#!/usr/bin/perl
###############################################################################
# Program  : etlSpMsg.pl
# Argument : check dir eg:/etl/RD/
# Function : Check receive directory /etl/RD/
###############################################################################
use strict;
use Time::localtime;
###############################################################################
my $home = $ENV{"AUTO_HOME"};
my $SLEEP_TIME = $ENV{"AUTO_SLEEP"};
if ( !defined($SLEEP_TIME) ) {
   # If the sleep time does not set, we set the sleep time to be 60 seconds
   $SLEEP_TIME = 60;
}
my $VERSION = "v2.50";
my $PRINT_VERSION_FLAG = 0;
my $TRUE  = 1;
my $FALSE = 0;

my $STOP_FLAG = 0;
my $LOCK_FILE;
my $LOG_STAT = 0;
my $LOGDIR;
my ($LOGFILE, $LASTLOGFILE);
my $TODAY;
my $dbCon;
my @dirFileList;
my @dataFileList;

my $TX_DATE;
my $os   = $^O;
$os =~ tr [A-Z][a-z];
my $DIRDELI;

if ( $os eq "mswin32" ) {
  unshift(@INC, "$home\\bin");
  require etl_nt;
   $DIRDELI = "\\";
}
else {
  unshift(@INC, "$home/bin");
  require etl_unix;
   $DIRDELI = "/";
}

my $ETL_LOG = "$home${DIRDELI}LOG";
my $MSG_RECEIVE = "${home}${DIRDELI}DATA${DIRDELI}RD";

my $account            ="ACT_ACCOUNT"     ;           
my $individual               ="PTY_INDIVIDUAL"  ;     
my $occupation           ="PTY_OCCUPATION"  ;         
my $residence              ="PTY_RESIDENCE"   ;       
my $guart            ="ACT_GUART"       ;             
my $id_change               ="ACT_ID_CHANGE"   ;      
my $specialTXN           ="ACT_SPEC_TXN"    ;         
my $specialComment       ="ACT_SPEC_COMMENT";         
my $head                 ="MESSAGE_HEAD"    ;         
my $msgseq               = "msg.seq"                 ;

if ( $#ARGV < 0 ) {
  print STDOUT " MsgBody\n";
  
   exit(1);
}
# Create log file for this program
sub createLogFile
{
   my ($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime(time());
   
   $year  += 1900;
   $mon    = sprintf("%02d", $mon + 1);
   $mday   = sprintf("%02d", $mday);
   $TODAY  = "${year}${mon}${mday}";
   $LOGDIR = "${ETL_LOG}/${TODAY}";

   # To check the LOG directory is exist or not
   # If it is not exist then create the directory
   if ( ! -d $ETL_LOG) {
      ETL::createDirectory($ETL_LOG);
   }

   # Composite the log file name
   $LOGFILE = "${ETL_LOG}/etlspmsg_${TODAY}.log";

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

# Check the receiving directory to see if there is any control file
# here need to be processed
sub checkReceiveDir
{
   my $filename;
   my $RCV_DIR;
    my $n = 0;
   @dirFileList = ();
   my @tempList;
   my $Fin_Inst_ID;
   my $Data_date;
   my $Msg_Num;
   my $Msg_Tpye;
   my $tmp;
   ETL::showTime(); print "Checking receiving directory '${MSG_RECEIVE}'...\n";

   # Open the receiving directory for processing
   unless ( opendir(RCV_DIR, "${MSG_RECEIVE}") ) {
      ET::showTime(); print "ERROR - Unable to open '${MSG_RECEIVE}'\n";
      return $FALSE;
   }

   
   while ($filename = readdir(RCV_DIR))
   {
      if ( $STOP_FLAG ) { last; }

      if ( $filename eq "." || $filename eq ".." ) { next; }

      # If the file is directory then skip it
      if ( -d "${MSG_RECEIVE}${DIRDELI}${filename}" ) { next; }
      if ( ETL::isSizeStable("${MSG_RECEIVE}${DIRDELI}${filename}") ) {

		  if ( isMsgDataFile($filename) ) {
			 $Fin_Inst_ID=substr($filename,0,14);
			 $Data_date=substr($filename,14,6);
			 $Msg_Num=substr($filename,20,3);
			 $Msg_Tpye=substr($filename,23,1);
			 $tempList[$n++] = $filename;
			 $tmp="${MSG_RECEIVE}${DIRDELI}${Data_date}";
			 my $Ftail="${Fin_Inst_ID}${Data_date}${Msg_Num}${Msg_Tpye}";
			if ( ! -d $tmp ) {
				  ETL::createDirectory($tmp);
			   }
			my $CResult=system("$home/bin/spmsg "."${MSG_RECEIVE}${DIRDELI}${filename} "."${tmp}${DIRDELI}${account}${Ftail} "."${tmp}${DIRDELI}${individual}${Ftail} "."${tmp}${DIRDELI}${occupation}${Ftail} "."${tmp}${DIRDELI}${residence}${Ftail} "."${tmp}${DIRDELI}${guart}${Ftail} "."${tmp}${DIRDELI}${id_change}${Ftail} "."${tmp}${DIRDELI}${specialTXN}${Ftail} "."${tmp}${DIRDELI}${specialComment}${Ftail} "."${tmp}${DIRDELI}${head}${Ftail} "."${home}${DIRDELI}DATA${DIRDELI}RD${DIRDELI}${msgseq}");  
			if ($CResult!=0) {
			   ETL::showTime(); print "msg split failed...\n";
			   return $FALSE;
			}
				 # Try to open the control file
		   my $controlFile;
		   $controlFile="${tmp}${DIRDELI}"."dir."."${account}${TX_DATE}"."01";
		   unless ( open(accountF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${individual}${TX_DATE}"."01";
		   unless ( open(individualF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${occupation}${TX_DATE}"."01";
		   unless ( open(occupationF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${residence}${TX_DATE}"."01";
		   unless ( open(residenceF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${guart}${TX_DATE}"."01";
		   unless ( open(guartF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${id_change}${TX_DATE}"."01";
		   unless ( open(id_changeF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		   $controlFile="${tmp}${DIRDELI}"."dir."."${specialTXN}${TX_DATE}"."01";
		   unless ( open(specialTXNF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
			$controlFile="${tmp}${DIRDELI}"."dir."."${specialComment}${TX_DATE}"."01";
		   unless ( open(specialCommentF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
			$controlFile="${tmp}${DIRDELI}"."dir."."${head}${TX_DATE}"."01";
		   unless ( open(headF_H, ">>${controlFile}") ) {
			  return $FALSE;
		   }
		  
			my $fsize;
			$fsize=(stat("${tmp}${DIRDELI}${account}${Ftail}"))[7];
				print accountF_H "${account}${Ftail}"." ".$fsize ."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${individual}${Ftail}"))[7];
				print individualF_H "${individual}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${occupation}${Ftail}"))[7];
				print occupationF_H "${occupation}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${residence}${Ftail}"))[7];
				print residenceF_H "${residence}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${guart}${Ftail}"))[7];
				print guartF_H "${guart}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${id_change}${Ftail}"))[7];
				print id_changeF_H "${id_change}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${specialTXN}${Ftail}"))[7];
				print specialTXNF_H "${specialTXN}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${specialComment}${Ftail}"))[7];
				print specialCommentF_H "${specialComment}${Ftail}"." ".$fsize."\n"; 
			$fsize=(stat("${tmp}${DIRDELI}${head}${Ftail}"))[7];
				print headF_H "${head}${Ftail}"." ".$fsize."\n"; 
		   close accountF_H;
		   close individualF_H;
		   close occupationF_H;
		   close residenceF_H;
		   close guartF_H;
		   close id_changeF_H;
		   close specialTXNF_H;
		   close specialCommentF_H;
		   close headF_H;
		}
	  }
   }
   
   # Close the receiving directory
   closedir(RCV_DIR);

   ETL::showTime(); print "Check receiving directory '$ETL::ETL_RECEIVE' done.\n";

   return $TRUE;
}

#是非重报的正常报文数据
sub isMsgDataFile
{
   my($filename) = @_;
   #第25位 为0 非重报 24 位 为 1 正常数据
      if ( substr($filename, 24, 1) eq "0" && substr($filename, 23, 1) eq "1" && substr($filename, 14, 6) eq "${TX_DATE}"  ) {
         return $TRUE;
      }
      else  {
         return $FALSE;
      }
}

sub removeTmpfile
{
   my $zipdir = "$home/zipdata";
   unless ( opendir(ZIP_DIR, "$zipdir") ) {
      ETL::showTime(); print "ERROR - Unable to open '$zipdir'\n";
      return $FALSE;
   }
   my $filename;
   while ($filename = readdir(ZIP_DIR))
   {
		if ( $STOP_FLAG ) { last; }

		if ( $filename eq "." || $filename eq ".." ) { next; }
		# If the file is directory then skip it
		if ( -d "${zipdir}/${filename}" ) { next; }

		my $ftime = (stat("${zipdir}/${filename}"))[9];
		my $d = (time() - $ftime)/3600/24;
		if ($d > 30) {
			print "Remove old file: ${zipdir}/${filename}\n";
			unlink("${zipdir}/${filename}");
		}
  }
   # Close the receiving directory
   closedir(ZIP_DIR);
}

# The main function of this program
sub main
{
  # while ($TRUE)
   #{
      unless ( createLogFile() ) {
      	 print STDERR "ERROR - Unable to create log file!\n";
      }

      if ($PRINT_VERSION_FLAG != 1) {
      	 printVersionInfo();
      }

      # Check the receive directory
      checkReceiveDir("$home/DATA/ftpdir/shanghai");
     # checkFtpDir("$home/data/ftpdir/shenzhen");
     # checkFtpDir("$home/data/ftpdir");
      # Remove the day before this week
	  #removeOldzipfile();
      
      # Go to sleep for a while
   # }

   #removeLock();
} 
sub printVersionInfo
{
   print "\n";
   ETL::showTime(); print "**************************************************************\n";
   ETL::showTime(); print "* TASK Automation Preprocess Process DATA directory by zxg            *\n";
   ETL::showTime(); print "**************************************************************\n";
   print "\n";
   $PRINT_VERSION_FLAG = 1;
}

#$MSG_RECEIVE = $ARGV[0];
$TX_DATE = $ARGV[0];
my $ret=main();
exit($ret);
