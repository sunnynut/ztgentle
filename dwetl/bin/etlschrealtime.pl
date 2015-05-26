#!/usr/bin/perl -w
#####################################################################
# Program: etlschrealtime.pl
# Purpose: This program is doing job scheduling
# WorkFlow v1.0 by dj
#####################################################################

use strict;
use DBI;
use Time::Local;

my $DEBUG = 1;

my $VERSION = "v1.0";

my $home = $ENV{"AUTO_HOME"};
my $os   = $^O;
my $ETL_BIN='$home/bin';
$os =~ tr [A-Z][a-z];
my $DIRDELI;
if ( $os eq "mswin32" ) {
   $DIRDELI = "\\";
   unshift(@INC, "$home\\bin");
   require etl_nt;
} else {
   $DIRDELI = "/";
   unshift(@INC, "$home/bin");
   require etl_unix;
}

my $LOGDIR;
my ($LOGFILE, $LASTLOGFILE);
my $TODAY;

my $TRUE  = 1;
my $FALSE = 0;

my $STOP_FLAG = 0;
my $LOCK_FILE;

my $LOG_STAT = 0;

my $dbCon;

my @JobList;
my @AllJobList;
my ($LastHour, $LastMin);

my $MutexObj;

my $SLEEP_TIME = 1;
my $PRIMARY_SERVER = 0;
my $RUN_SERVER= $ENV{"AUTO_SERVER"};
if ( !defined($RUN_SERVER) ) {
   $RUN_SERVER ='ETL_181';
} 
my $value;
$value = $ENV{"AUTO_PRIMARY_SERVER"};
if ( defined($value) ) {
   $PRIMARY_SERVER = $value;
} 
else {
   $PRIMARY_SERVER = 0;
}

my $PRINT_VERSION_FLAG = 0;

#####################################################################
# Function section

# Create log file for this program
sub createLogFile
{
   my ($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime(time());
   
   $year  += 1900;
   $mon    = sprintf("%02d", $mon + 1);
   $mday   = sprintf("%02d", $mday);
   $hour   = sprintf("%02d", $hour);
   $min    = sprintf("%02d", $min);
   $sec    = sprintf("%02d", $sec);
   my $logtime = "${year}${mon}${mday}";
   $TODAY  = "${year}-${mon}-${mday} ${hour}:${min}:${sec}";
   $LOGDIR = "${ETL::ETL_LOG}${DIRDELI}${TODAY}"; 

   # To check the LOG directory is exist or not
   # If it is not exist then create the directory   
   if ( ! -d $ETL::ETL_LOG) {
      ETL::createDirectory($ETL::ETL_LOG);
   }

   # Composite the log file name
   $LOGFILE = "${ETL::ETL_LOG}${DIRDELI}etlschrealtime_${logtime}.log";

   if ("$LOGFILE" eq "$LASTLOGFILE") {
      return $TRUE;
   }

   # If log file was open before, close it first   
   if ( $LOG_STAT == 1 ) {
      close(LOGF_H);
      $LOG_STAT = 0;
   }

   # Try to open the log file
   unless ( open(LOGF_H, ">>${LOGFILE}") ) {
      return $FALSE;
   }

   $LASTLOGFILE = $LOGFILE;
   $LOG_STAT = 1;

   # Set the buffer of log file to be 1,
   # which means the log message will be wrriten out immediately
   select (LOGF_H);
   $| = 1;

   return $TRUE;
}

sub addOneDay
{
   my ($date) = @_;
   my ($year, $month, $day);
   
   $year  = int($date/10000);
   $month = int(($date%10000)/100);
   $day   = int($date % 100);

   if ( $month == 1 || $month == 3 || $month == 5 || $month == 7 ||
        $month == 8 || $month == 10 || $month == 12 ) {
      if ( $day == 31 ) {
      	 $month++;
      	 $day = 1;
         if ($month==13) {
            $month=1;
            $year++;
         }
      } else {
      	 $day++;
      }
   } elsif ( $month == 4 || $month == 6 || $month == 9 || $month == 11 ) {
      if ( $day == 30 ) {
      	 $month++;
      	 $day = 1;
      } else {
      	 $day++;
      }
   } else {
      # Check if it is leap year
      if ( (($year%4)==0 && ($year%100)!=0) || ($year%400)==0 ) {
      	 if ( $day == 29 ) {
            $month++;
            $day = 1;
         } else {
            $day++;
         }
      } else {
      	 if ( $day == 28 ) {
            $month++;
            $day = 1;
         } else {
            $day++;
         }
      }
   }
   
   $date = ($year*10000) + ($month*100) + $day;
   
   return $date;
}

sub TxDate
{
   my ($txdate) = @_;
   $txdate =~ s/-//g;
   $txdate =~ s/://g;
   $txdate =~ s/ //g;
   
   return $txdate;
}


# Get the current moment, by year, month, day, hour, minute
sub getNow
{
   my ($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime(time());
   my $current = "";
   
   $year += 1900;
   $mon   = $mon + 1;
   
   return ($year, $mon, $mday, $wday, $hour, $min);
}

# Get the job list for which is trigger by time
sub getJobList
{
   my ($dbh,$today) = @_;
   my @tabrow;

   my $sqltext = "SELECT ETL_Server,ETL_System,Etl_Job,Last_TXDate,Exec_Minute,DATE_ADD(Last_TXDate,INTERVAL Exec_Minute MINUTE) Exec_Time" .
                 "  FROM ${ETL::ETLDB}etl_job_realtime" .
                 " WHERE ENABLE =1 AND TimeTrigger='Y' AND ETL_Server='$RUN_SERVER' AND DATE_ADD(Last_TXDate,INTERVAL Exec_Minute MINUTE)<'$today'";
#   ETL::showTime(); print "Process sql=$sqltext ...\n";
   my $sth = $dbh->prepare($sqltext);
   unless ($sth) {
      return undef;
   }

   $sth->execute();

   @JobList = ();
   my $n = 0;
   my $count = 0;
   while ( @tabrow = $sth->fetchrow() ) {
      if (!defined($tabrow[0])) { $tabrow[0] = ""; }
      
      $JobList[$n++] = $tabrow[0];
      $JobList[$n++] = $tabrow[1];
      $JobList[$n++] = $tabrow[2];
      $JobList[$n++] = $tabrow[3];
      $JobList[$n++] = $tabrow[4];
      $JobList[$n++] = $tabrow[5];

      $count++;
   }

   $sth->finish();

   return $count;
}


sub updateJobLastRun
{
   my ($dbh, $sys, $job, $lastdate, $lasttime) = @_;
   my $sqltext;

   $sqltext = "UPDATE ${ETL::ETLDB}ETL_TimeTrigger" .
              "   SET LastRunDate = $lastdate, LastRunTime = $lasttime" .
              "   WHERE ETL_System = '$sys' AND ETL_Job = '$job'";

   my $sth = $dbh->prepare($sqltext) or return $FALSE;
   my $ret = $sth->execute();

   $sth->finish();

   if ( $ret ) {
      return $TRUE;
   }
   else {
      return $FALSE;
   }
}


sub invokeJob
{
   my ($server, $sys, $job, $exec_time) = @_;
   my $script;
   my $ExecDate=TxDate($exec_time);
   ETL::showTime(); print "Invoke ..server=$server, sys=$sys, job=$job, exec_time=$exec_time ,ExecDate=$ExecDate\n";
   my $param="${sys}_${job}_${ExecDate}.dir";
   $param =~ tr/[a-z]/[A-Z]/;
   $script = "nohup perl /home/pcsmaster/dwetl/bin/etlslave_realtime.pl $param >/dev/null 2>&1 &";

   ETL::showTime(); print "$script\n";

   system($script);

   return $TRUE;
}

sub checkRealTimeJob
{
   my ($dbh, $server, $sys, $job, $year, $month, $day, $hour, $min,$last_txdate,$exec_minute,$exec_time) = @_;

   if ( $DEBUG == 1 ) { print STDOUT "Checking for RealTime job...\n"; }
   my $ret;
   ETL::showTime(); print "Start to run server=$server, sys=$sys, job=$job, exec_time=$exec_time\n";
   $ret = invokeJob($server, $sys, $job, $exec_time);
   if ($ret != $TRUE) { return $FALSE; }

   ETL::showTime(); print "Update job's last running time to '$exec_time'.\n";
   if ( $DEBUG == 1 ) { print STDOUT "Update job's last running date and time to '$exec_time'.\n"; }
#   updateJobLastRun($dbh, $sys, $job, $lastdate, $lasttime);
   return $TRUE;   
}

sub doSchedule
{
   my ($server, $sys, $job, $last_txdate, $exec_minute ,$exec_time);
   my ($year, $month, $day, $wday, $hour, $min);
   my ($starthour, $startmin, $rerun, $sleeptime, $retrytime);

   ($year, $month, $day, $wday, $hour, $min) = getNow();
   if ( $DEBUG == 1 ) { print STDOUT "Year=$year, Month=$month, Day=$day, Weekday=$wday, Hour=$hour, Min=$min\n"; }	

   if ($hour == $LastHour && $min == $LastMin) { return $FALSE;	}
   
   ETL::showTime(); print "Connect to ETL DB...\n";
   if ( $DEBUG == 1 ) { print STDOUT "Connect to ETL DB...\n"; }
   $dbCon = ETL::connectETL();

   unless ( defined($dbCon) ) {
      ETL::showTime(); print "ERROR - Unable to connect to ETL database!\n";
      if ( $DEBUG == 1 ) { print STDOUT "ERROR - Unable to connect to ETL database!\n"; }
      
      my $errstr = DBI::errstr;
      ETL::showTime(); print "$errstr\n";
      if ( $DEBUG == 1 ) { print STDOUT "$errstr\n"; }
      return $FALSE;
   }

   ETL::showTime(); print "Get the job list from repository...\n";
   if ( $DEBUG == 1 ) { print STDOUT "Get the job list from repository...\n"; }
   my $count = getJobList($dbCon,$TODAY);
   ETL::showTime(); print "Process $count Jobs...\n";
   my ($i, $n);
   for ($i=0, $n=0; $i<$count; $i++) {
      unless ( $dbCon->ping() ) {
         ETL::showTime(); print "ERROR - Lost database connection.\n";
         if ( $DEBUG == 1 ) { print STDOUT "ERROR - Lost database connection.\n"; }
         last;
      }
#ETL_Server,ETL_System,Etl_Job,Last_TXDate,Exec_Minute,Exec_Time
      $server = $JobList[$n++];
      $sys    = $JobList[$n++];
      $job    = $JobList[$n++];
      $last_txdate   = $JobList[$n++];
      $exec_minute   = $JobList[$n++];
      $exec_time     = $JobList[$n++];

      if ( $DEBUG == 1 ) {
         print STDOUT "**********************************************************************\n";
      	 print STDOUT "Job:[$server,$sys, $job] last_txdate:[$last_txdate,$exec_minute,$exec_time]\n";
      }
     ETL::showTime(); print "Job:[$server,$sys, $job] last_txdate:[$last_txdate,$exec_minute,$exec_time]\n";
       checkRealTimeJob($dbCon, $server, $sys, $job, $year, $month, $day, $hour, $min,$last_txdate,$exec_minute,$exec_time);

      if ( $DEBUG == 1 ) {
         print STDOUT "**********************************************************************\n";
      }
   }

   ETL::showTime(); print "Disconnect from ETL DB...\n";
   if ( $DEBUG == 1 ) { print STDOUT "Disconnect from ETL DB...\n"; }

   ETL::disconnectETL($dbCon);

   $LastHour = $hour; $LastMin  = $min;
   
   return $TRUE;
}

sub main
{
   my $lastday = "";
   my $count = 0;

   $LastHour = -1;
   $LastMin  = -1;
      
   while ($TRUE)
   {
      if ( $STOP_FLAG ) { last; }

      # Try to create the log file
      unless ( createLogFile() ) {
      	 print STDERR "ERROR - Unable to create log file!\n";
      }

      if ($PRINT_VERSION_FLAG != 1) {
      	 printVersionInfo();
      }
      
#      if ( $PRIMARY_SERVER != 1 ) {
#         ETL::showTime(); print "This is not the primary server, terminate this program!\n";
#      	 last;
#      }

      doSchedule();
       
      if ( $STOP_FLAG ) { last; }

      # Go to sleep for a while
      sleep($SLEEP_TIME);
   }

   removeLock();
}

# This function is to see if there is another instance of program running.
# Only one instance of program allow to run at any given time.
# If there is another instance of program is running, we stop the new one.
sub check_instance()
{
   my $count = 1;
   my $LK_FILE_H;

   # For windows platform, we use mutex to control the single instance of program
   if ( $os eq "mswin32" ) {
      $MutexObj = ETL::CreateMutex("ETLSCH_MUTEX");
      if ( ! defined($MutexObj) ) {
         print STDERR "Only one instance of etlschrealtime.pl allow to run, program terminated!\n";
      	 return $FALSE;
      }

      until (ETL::getMasterLock($ETL::ETL_LOCK)) {
         if ($count++ == 5) {
            #print STDERR "Unable to get master lock for five times, program terminated!\n";
            last;
         }
         sleep(1);
      }
   
      unless ( open(LK_FILE_H, ">$LOCK_FILE") ) {
         ETL::releaseMasterLock($ETL::ETL_LOCK);
         print STDERR "Unable to create lock file!\n";
         return $FALSE;
      }
   
      print LK_FILE_H ("$$\n");
   
      close(LK_FILE_H);
   
      ETL::releaseMasterLock($ETL::ETL_LOCK);
   
      return $TRUE;
   }
   else {
      until (ETL::getMasterLock($ETL::ETL_LOCK)) {
         if ($count++ == 5) {
            print STDERR "Unable to get master lock for five times, program terminated!\n";
            return $FALSE;
         }
         sleep(1);
      }
   
      if ( -f $LOCK_FILE ) {
         ETL::releaseMasterLock($ETL::ETL_LOCK);
         print STDERR "Only one instance of etlclean.pl allow to run, program terminated!\n";
   
         return $FALSE;
      }  
   
      unless ( open(LK_FILE_H, ">$LOCK_FILE") ) {
         ETL::releaseMasterLock($ETL::ETL_LOCK);
   
         print STDERR "Unable to create lock file, program terminated!\n";
         return $FALSE;
      }
   
      print LK_FILE_H ("$$\n");
   
      close(LK_FILE_H);
   
      ETL::releaseMasterLock($ETL::ETL_LOCK);
   
      return $TRUE;
   }
}

# To remove the lock file create by this program
sub removeLock
{
   my $count = 1;

   # For windows platform, we use mutex to control single instance of program
   # We have to release the mutex before program terminated
   if ( $os eq "mswin32" ) {
      ETL::ReleaseMutex($MutexObj); 

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
   else {
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
}

# This function will be called when the program has catched some signal
# The purpose of this program is to some clean up task when the program terminate.
sub cleanUp
{
   my ($signal) = @_;
   my $count = 1;

   until (ETL::getMasterLock($ETL::ETL_LOCK)) {
      if ($count++ == 5) {
         return;
      }
      sleep(1);
   }

   unlink($LOCK_FILE);

   ETL::releaseMasterLock($ETL::ETL_LOCK);

   if ( $LOG_STAT == 1 ) {
      print LOGF_H "Stop by signal '${signal}'\n";
   }

   $STOP_FLAG = 1;

   # If the system is Unix, we exit the program when receive the singnal
   if ( $os eq "svr4" ) {
      exit(0);
   }
}

sub printVersionInfo
{
   print "\n";
   ETL::showTime(); print "*******************************************************************\n";
   ETL::showTime(); print "* WorkFlow Job Real Time Schedule Program ${VERSION}, DJ 2014 Copyright. *\n";
   ETL::showTime(); print "*******************************************************************\n";
   print "\n";
   $PRINT_VERSION_FLAG = 1;
}

#####################################################################

$LOCK_FILE = "${ETL::ETL_LOCK}${DIRDELI}etlschrealtime.lock";
$LASTLOGFILE = "";

unless ( check_instance() ) { exit(1); }

$SIG{'INT'}  = 'cleanUp';
$SIG{'QUIT'} = 'cleanUp';
$SIG{'TERM'} = 'cleanUp';

open(STDERR, ">&STDOUT");

main();

exit(0);

__END__

