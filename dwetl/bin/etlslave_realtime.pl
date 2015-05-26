#!/usr/bin/perl -w
###############################################################################
# Program  : etlslave_realtime.pl
# Argument : (ControlFile)
#            This program need one argument.
# WorkFlow v1.0 by dj
###############################################################################

use strict;
use DBI;

my $VERSION = "v1.0";

my $home = $ENV{"AUTO_HOME"};

unshift(@INC, "$home/bin");

require etl_unix;

my $LOGDIR;
my $LOGFILE;
my $TODAY;

my $TRUE  = 1;
my $FALSE = 0;

my $STOP_FLAG = 0;
my $LOCK_FILE;

my $ControlFile;
my $RetryCount =0;
my ($Sys, $Job, $AutoOff, $JobType, $TxDate, $HeadJobGroup, $AutoOnChild);
my $JobSessionID;
my $AppPath;
my $AppBINPath;
my $AppDDLPath;
my $AppPythonBinPath;
my $AppPythonEtcPath;
my $AppPythonPubPath;
my $PythonScript;
my $SyntaxMode = 0;
my $RunDownstreamFlag = 1;
my $RunGroupFlag = 1;
my $UpTxdate="";
my @dirFileList;
my $dbCon;

my @dataFileList;



# Create log file for this program
sub createLogFile
{
   my ($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime(time());
   
   $year  += 1900;
   $mon    = sprintf("%02d", $mon + 1);
   $mday   = sprintf("%02d", $mday);
   $TODAY  = "${year}${mon}${mday}";

   # To check the LOG directory is exist or not
   # If it is not exist then create the directory   
   if ( ! -d ${ETL::ETL_LOG} ) {
      ETL::createDirectory($ETL::ETL_LOG);
   }

   $LOGDIR = "${ETL::ETL_LOG}/${Sys}";
   # To check the system's log directory is exist or not
   # If it is not exist then create the directory
   if ( ! -d ${LOGDIR} ) {
      ETL::createDirectory($LOGDIR);
   }

   $LOGDIR = "${LOGDIR}/${TODAY}";
   # To check the system today log directory is exist or not
   # If it is not exist then create the directory
   if ( ! -d ${LOGDIR} ) {
      ETL::createDirectory($LOGDIR);
   }

   my $confile = substr($ControlFile, 0, length($ControlFile) - 4);
   $LOGFILE = "${LOGDIR}/${confile}.${JobSessionID}.log";
   
   unless ( open(LOGF_H, ">>${LOGFILE}") ) {
      return $FALSE;
   }

   select (LOGF_H);
   $| = 1;

   return $TRUE;
}

sub getJobFailInfo
{
   my ($dbh, $job) = @_;
   my @tabrow;
      
   my $sqlText = "SELECT Etl_Job,Last_TXDate,main_man FROM ${ETL::ETLDB}etl_job_realtime" .
                " WHERE ETL_Job = '$job'";
   $dbh->do("SET NAMES 'UTF8'");
   my $sth = $dbh->prepare($sqlText);

   unless ($sth) { return ""; }

   $sth->execute();
    
   @tabrow = $sth->fetchrow();

   $sth->finish();

   return $tabrow[0],$tabrow[1],$tabrow[2];
}
sub getMontel
{
   my ($dbh,$failfix) = @_;
   my @tabrow;
      
   my $sqlText = "SELECT Mobile FROM etl_user WHERE (Description='job_monitor') OR( STATUS=1 AND Mobile IS NOT NULL AND UserName='$failfix')";
   $dbh->do("SET NAMES 'UTF8'");
   my $sth = $dbh->prepare($sqlText);

   unless ($sth) {
      return undef;
   }

   $sth->execute();
   my @TelList = ();
   my $n = 0;
   my $count = 0;
   while ( @tabrow = $sth->fetchrow() ) {
      $TelList[$n++] = $tabrow[0];
      $count++;
   }
   ETL::showPrefixSpace(); print "count $count!\n";
   $sth->finish();
   return @TelList;
}
sub SendFailInfo
{
 my ($dbCon, $Job) = @_;
 my @FailInfo=getJobFailInfo($dbCon, $Job);
 my $failjob=$FailInfo[0];
 ETL::showPrefixSpace(); print "failjob $failjob!\n";
 my $faildate=$FailInfo[1];
 ETL::showPrefixSpace(); print "faildate $faildate!\n";
 my $failfix=$FailInfo[2];
 ETL::showPrefixSpace(); print "failfix $failfix!\n";
 my @telnumber=getMontel($dbCon,$failfix);
 for (my $i=0; $i <= $#telnumber; $i += 1) {
 	ETL::showPrefixSpace(); print "telnumber $telnumber[$i]!\n";
 	my $sendinfo="http://stat.dajie.com/log_query/smsSend.do?template=98&mobile=".$telnumber[$i]."&taskName=".$failjob."&date=".$faildate."&personName=".$failfix;
 	ETL::showPrefixSpace(); print "sendinfo $sendinfo!\n";
  my $sendcmd="curl '".$sendinfo."'";
#  my $cdcmd ="cd /home/pcsmaster/dwetl/LOG/SMS";
#  my $ret = system($cdcmd);
  my $ret = system($sendcmd);
  $ret = $ret >> 8;
  ETL::showPrefixSpace(); print "Return Code is $ret\n";
 	}
}
sub invokeJobPerl
{
   my ($jobscript,$scriptFile, $controlFile) = @_;
   my $ret;
   my $job = "";
   my $dataFile;

   my $fileseq = substr($scriptFile, length($scriptFile) - 7, 4);

   my $txdate = ETL::formatTXDate($TxDate);

   my $logfile = "${LOGDIR}/${jobscript}.${JobSessionID}.log";
   $job = "perl ${scriptFile} $controlFile >& $logfile";
   

   ETL::showPrefixSpace(); print "${job}\n";

   $ret = system($job);
   
   $ret = $ret >> 8;

   ETL::showPrefixSpace(); print "Return Code is $ret\n";

   return $ret;
}
sub invokeJobPython
{
   my ($jobscript,$scriptFile, $controlFile) = @_;
   my $ret;
   my $job = "";
   my $dataFile;

   my $fileseq = substr($scriptFile, length($scriptFile) - 7, 4);

   my $txdate = ETL::formatTXDate($TxDate);

   my $logfile = "${LOGDIR}/${jobscript}.${JobSessionID}.log";
   $job = "python ${scriptFile} $controlFile >& $logfile";
   

   ETL::showPrefixSpace(); print "${job}\n";

   $ret = system($job);
   
   $ret = $ret >> 8;

   ETL::showPrefixSpace(); print "Return Code is $ret\n";

   return $ret;
}
sub invokeJobShell
{
   my ($jobscript,$scriptFile, $controlFile) = @_;
   my $ret;
   my $job = "";
   my $dataFile;

   my $fileseq = substr($scriptFile, length($scriptFile) - 7, 4);

   my $txdate = ETL::formatTXDate($TxDate);

   my $logfile = "${LOGDIR}/${jobscript}.${JobSessionID}.log";
   $job = "sh ${scriptFile} $controlFile >& $logfile";
   

   ETL::showPrefixSpace(); print "${job}\n";

   $ret = system($job);
   
   $ret = $ret >> 8;

   ETL::showPrefixSpace(); print "Return Code is $ret\n";
   return $ret;
}
# The main function for executing real job
sub mainRealJob
{
   $AppPythonBinPath    = "${ETL::ETL_APP}/${Sys}/bin";
   $AppPythonEtcPath    = "${ETL::ETL_APP}/${Sys}/etc";
   $AppPythonPubPath    = "${ETL::ETLDIR}/PUB";
   ETL::showPrefixSpace(); print ("AppPythonBinPath=$AppPythonBinPath\n");
   my $jobscript = $Job;
   $jobscript =~ tr/[A-Z]/[a-z]/;
   if ($Sys eq 'STG'){
   	$PythonScript ="${ETL::ETLDIR}/PUB/DsyncX.py";
   	}
   	elsif($Sys eq 'EXP'){
   	$PythonScript ="${ETL::ETLDIR}/PUB/DsyncX_Exp.py";
   	}
   else {
   	if ( -e "${AppPythonBinPath}/${jobscript}.py" ){
  $PythonScript ="${AppPythonBinPath}/${jobscript}.py";}
    if ( -e "${AppPythonBinPath}/${jobscript}.pl" ){
  $PythonScript ="${AppPythonBinPath}/${jobscript}.pl";}
    if ( -e "${AppPythonBinPath}/${jobscript}.sh" ){
  $PythonScript ="${AppPythonBinPath}/${jobscript}.sh";}
   	}
   ETL::showPrefixSpace(); print ("PythonScript=${PythonScript}\n");
      unless ( -e $PythonScript ) {
      ETL::showPrefixSpace(); print ("Error: bin directory does not exist, job terminated!\n");
      ETL::showTime(); print ("No script file existing!\n");
      SendFailInfo($dbCon,$Job);
      return $FALSE;
   }

   my $cur_time;

   my $ret;
   my $failflag = 0;

   $cur_time = ETL::getCurrentDateTime();
   updateJobStartTime($dbCon, $Sys, $Job, $cur_time);

   # Processing the python script file .
   my $filename = $PythonScript;

   ETL::showTime(); print "Invoke $filename\n";

   $cur_time = ETL::getCurrentDateTime();
   insertJobLog($dbCon, $Sys, $Job, $UpTxdate, $filename, $cur_time, $JobSessionID);

#   ETL::updateJobRunningScript($dbCon, $Sys, $Job, $filename);

   my $ext = substr($filename, length($filename) - 3, 3);
   ETL::showTime(); print "Script suffix $ext\n";
   ETL::showTime(); print "RetryCount $RetryCount\n";
   for (my $TryCount=0; $TryCount <= $RetryCount; $TryCount++){
   ETL::showTime(); print "TryCount........ $TryCount\n";
   if ( "$ext" eq ".sh" ) {
      # Call the function to execute the Shell script file
      $ret = invokeJobShell($jobscript,$filename, $ControlFile);
   } elsif ( "$ext" eq ".pl" ){
      # Call the function to execute the Perl script file
      $ret = invokeJobPerl($jobscript,$filename, $ControlFile);      	
   }else {
      # Call the function to execute the Perl script file
      $ret = invokeJobPython($jobscript,$filename, $ControlFile);      	
   }
   if ( $ret == 0 ) {
     last;
      }
 }
   # If the job failed
   if ( $ret != 0 ) {
      ETL::showPrefixSpace(); print "Invoke failed!\n";
      $failflag = 1;
      SendFailInfo($dbCon,$Job);
   }else{ETL::showPrefixSpace(); print "Invoke succeed!\n";}
   my ($status, $checkflag);

   if ( $failflag == 1 ) {
      $status = "Failed";
      $checkflag = "N";
   }
   else {
      $status = "Done";
      $checkflag = "Y";
   }
   
   ETL::showTime(); print "Update Job status <$status>\n";
   ETL::showTime(); print "Connect from ETL DB2...\n";
   my $dbCon2 = ETL::connectETL();
   $cur_time = ETL::getCurrentDateTime();
   updateJobLog($dbCon2, $Sys, $Job, $UpTxdate, $filename, $cur_time, $ret, $JobSessionID);
   updateJobEndTime($dbCon2, $Sys, $Job, $cur_time);
   updateJobStatusWithCheckFlag($dbCon2, $Sys, $Job, $status, $checkflag);

   ETL::disconnectETL($dbCon2);

   return $TRUE;
}

sub check_instance()
{
   my $count = 1;
   my $LK_FILE_H;

   ETL::showTime(); print "Check for instance...\n";

   until (ETL::getMasterLock($ETL::ETL_LOCK)) {
      if ($count++ == 10) {
         ETL::showPrefixSpace(); print "Unable to get master lock for five times, program terminated!\n";
         return $FALSE;
      }
      sleep(1);
   }

   if ( -f $LOCK_FILE ) {
      ETL::releaseMasterLock($ETL::ETL_LOCK);
      ETL::showPrefixSpace(); print "Only one instance of etlslave.pl allow to run, program terminated!\n";

      return $FALSE;
   }  

   unless ( open(LK_FILE_H, ">$LOCK_FILE") ) {
      ETL::releaseMasterLock($ETL::ETL_LOCK);

      ETL::showPrefixSpace(); print "Unable to create lock file, program terminated!\n";
      return $FALSE;
   }

   print LK_FILE_H ("$$\n");

   close(LK_FILE_H);

   ETL::releaseMasterLock($ETL::ETL_LOCK);

   return $TRUE;
}

# To remove the lock file create by this program
sub removeLock
{
   my $count = 1;

   until (ETL::getMasterLock($ETL::ETL_LOCK)) {
      if ($count++ == 5) {
         unlink($LOCK_FILE);
         return;
      }
      sleep(1);
   }

   unlink($LOCK_FILE);

   ETL::releaseMasterLock($ETL::ETL_LOCK);
}

# This function will be called when the program has catched some signal
# The purpose of this program is to some clean up task when the program terminate.
sub cleanUp
{
   my ($signal) = @_;
   my $count = 1;

   until (ETL::getMasterLock($ETL::ETL_LOCK)) {
      if ($count++ == 5) {
         unlink($LOCK_FILE);
         return;
      }
      sleep(1);
   }

   unlink($LOCK_FILE);

   ETL::releaseMasterLock($ETL::ETL_LOCK);

   print LOGF_H "Stop by signal '${signal}'\n";

   $STOP_FLAG = 1;

   exit(0);
}

sub printVersionInfo
{
   print "\n";
   ETL::showTime(); print "*********************************************************************\n";
   ETL::showTime(); print "* WorkFlow Slave RealTime Program for Unix ${VERSION}, DJ 2013 Copyright. *\n";
   ETL::showTime(); print "*********************************************************************\n";
   print "\n";
}

sub updateJobStatusRunning
{
   my ($dbh, $sys, $job, $txdate) = @_;

   ETL::showTime(); print "Reset [$sys, $job] status to running for '$txdate'.\n";
   
   my $sqlText = "UPDATE ${ETL::ETLDB}etl_job_realtime SET Last_JobStatus = 'Running'," .
                 "       Last_TXDate = '$txdate', RunningScript = ''" . 
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText) or return $FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $TRUE;
   }
   else {
      return $FALSE;
   }
}

sub printSyntax
{
   print STDERR "etlslave_realtime.pl: Automation Job Script Runner, v2.5.1\n";
   print STDERR "Syntax 1: etlslave_realtime.pl <control file>\n";
   print STDERR "          <control file> the control file name for executing job.\n";
   print STDERR "Syntax 2: etlslave_realtime.pl <sys> <job> <txdate> [-nd] [-ng]\n";
   print STDERR "          <sys>, the system name of executing job.\n";
   print STDERR "          <job>, the job name of executing job.\n";
   print STDERR "          <txdate>, the data date for the executing job.\n";
   print STDERR "          -nd, disable the down stream job execution, it's optional.\n";
   print STDERR "          -ng, disable the job group execution, it's optional.\n"; 
}

sub getJobRunInfo
{
   my ($dbh, $file) = @_;
   my @Tabrow;
   my ($etlsys, $conv_head, $txdate);
   my ($etljob, $autoOff,$retrycount);
   my $sqltext;
   
   $etlsys    = substr($file, 0, 3);
   $conv_head = substr($file, 4, (length($file) - 23));
   $txdate    = substr($file, (length($file) - 18), 14);

   $sqltext = "SELECT ETL_Job" . 
              "   FROM ${ETL::ETLDB}ETL_Job_Source" . 
              "      WHERE ETL_system = '$etlsys'" .
              "        AND Conv_File_Head = '$conv_head'";

   my $sth = $dbh->prepare($sqltext);

   unless ($sth) {
      $etljob  = "";
      $autoOff = "";
      $txdate = "";
      $retrycount = 0;
      return ($etlsys, $etljob, $autoOff, $txdate, $retrycount);
   }

   $sth->execute();

   if (@Tabrow = $sth->fetchrow()) {
      $Tabrow[0] =~ tr/[a-z]/[A-Z]/;
      $etljob = $Tabrow[0];
   }
   else {
      $etljob  = "";
      $autoOff = "";
      $txdate = "";
      $retrycount = 0;
      $sth->finish();
      return ($etlsys, $etljob, $autoOff, $txdate,  $retrycount);
   }
   $sth->finish();

   # get the auto off flag of job
   $sqltext = "SELECT AutoOff,  Retry_Count FROM ${ETL::ETLDB}etl_job_realtime" .
              " WHERE ETL_System = '$etlsys' AND ETL_Job = '$etljob'";

   $sth = $dbh->prepare($sqltext);
   $sth->execute();

   @Tabrow = $sth->fetchrow();

   $autoOff = $Tabrow[0];
   $retrycount = $Tabrow[1];

   $sth->finish();

   return ($etlsys, $etljob, $autoOff, $txdate, $retrycount);
}
sub getJobSessionID
{
   my ($dbh, $sys, $job) = @_;
   my @Tabrow;

   my $sqlText = "SELECT JobSessionID FROM ${ETL::ETLDB}etl_job_realtime" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText);
   unless ($sth) {
      return $ETL::FALSE;
   }

   $sth->execute();
   @Tabrow = $sth->fetchrow();
   $sth->finish();

   return $Tabrow[0];
}
sub updateJobStartTime
{
   my ($dbh, $sys, $job, $starttime) = @_;

   my $sqlText = "UPDATE ${ETL::ETLDB}etl_job_realtime SET Last_StartTime = '$starttime'" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
sub insertJobLog
{
   my ($dbh, $sys, $job, $txdate, $script, $starttime, $sessionid) = @_;

   my $sqlText = "INSERT INTO ${ETL::ETLDB}ETL_RealTime_Job_Log" .
                 "       (ETL_System, ETL_Job, JobSessionID, ScriptFile, TxDate, StartTime," .
                 "        EndTime, ReturnCode)".
                 "   VALUES ('$sys', '$job', $sessionid, '$script', '$txdate', '$starttime'," .
                 "           null, null)";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
sub updateJobLog
{
   my ($dbh, $sys, $job, $txdate, $script, $endtime, $retcode, $sessionid) = @_;

   my $sqlText = "UPDATE ${ETL::ETLDB}ETL_RealTime_Job_Log SET" .
                 "       EndTime = '$endtime', ReturnCode = $retcode" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'" .
                 "     AND JobSessionID = $sessionid AND ScriptFile = '$script'";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
sub updateJobEndTime
{
   my ($dbh, $sys, $job, $endtime) = @_;

   my $sqlText = "UPDATE ${ETL::ETLDB}etl_job_realtime SET Last_EndTime = '$endtime'" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
sub updateJobStatusWithCheckFlag
{
   my ($dbh, $sys, $job, $status, $checkflag) = @_;

   my $sqlText = "UPDATE ${ETL::ETLDB}etl_job_realtime SET Last_JobStatus = '$status'," .
                 "       CheckFlag = '$checkflag'" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
sub increaseJobSessionID
{
   my ($dbh, $sys, $job) = @_;

   my $sqlText = "UPDATE ${ETL::ETLDB}etl_job_realtime SET JobSessionID = JobSessionID + 1" .
                 "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqlText) or return $ETL::FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $ETL::TRUE;
   }
   else {
      return $ETL::FALSE;
   }
}
###############################################################################

if ( $#ARGV == 0 ) {
   # Get the argument of control file name
   $ControlFile = $ARGV[0];

   # Check the argument is presented or not
   unless ( defined($ControlFile) ) {
      print STDERR ("ERROR: Unknow job control file\n");
      exit(1);
   }

   # Connect to WorkFlow repository
   $dbCon = ETL::connectETL();

   unless ( defined($dbCon) ) {
      # Can not connect to database
      print STDERR "Unable to connect database\n";
      exit(2);
   }

   ($Sys, $Job, $AutoOff, $TxDate,$RetryCount) = getJobRunInfo($dbCon, $ControlFile);
   if ( "$Sys" eq "" || "$Job" eq "" ) {
      print STDERR "Unable to find job information, terminate this program1\n";
      exit(3);
   }
   
   $SyntaxMode = 1;   
}  else {
   printSyntax();
   exit(1);	
}

$JobSessionID = getJobSessionID($dbCon, $Sys, $Job);

#($HeadJobGroup, $AutoOnChild) = ETL::isGroupHeadJob($dbCon, $Sys, $Job);

unless ( createLogFile() ) {
   print STDERR "Unable to create log file, terminate this program\n";
   exit(4);
}

printVersionInfo();


$LOCK_FILE = "${ETL::ETL_LOCK}/etlslave_${Sys}_${Job}.lock";
unless ( check_instance() ) {
   ETL::showTime(); print "Instance check failed, disconnect from ETL DB...\n";
   ETL::disconnectETL($dbCon);

   close(LOGF_H);

   exit(1);
}

$SIG{'INT'}  = 'cleanUp';
$SIG{'QUIT'} = 'cleanUp';
$SIG{'TERM'} = 'cleanUp';

open(STDERR, ">&STDOUT");

$UpTxdate=substr($TxDate,0,4)."-".substr($TxDate,4,2)."-".substr($TxDate,6,2)." ".substr($TxDate,8,2).":".substr($TxDate,10,2).":".substr($TxDate,12,2);
ETL::showTime(); print "System:[$Sys] Job:[$Job] AutoOff:[$AutoOff] TXDate:[$TxDate] RetryCount:[$RetryCount] UpTxdate:[$UpTxdate]\n";
updateJobStatusRunning($dbCon, $Sys, $Job, $UpTxdate);

   mainRealJob();

increaseJobSessionID($dbCon, $Sys, $Job);

removeLock();

ETL::showTime(); print "Disconnect from ETL DB...\n";
ETL::disconnectETL($dbCon);

close(LOGF_H);

exit(0);

__END__
