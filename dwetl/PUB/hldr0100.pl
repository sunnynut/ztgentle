#!/usr/bin/perl
# Hiveload script for load lzofile
# Date Time    : 2013-08-01 12:00:00
# Author: jrjt
# Script File  : hldr0100.pl

use strict; # Declare using Perl strict syntax
use jrjtcommon;
my $x = $0;
$x=~ s/\//\\/g;
my @words=split(/\\/, $x);
my $SYS = $words[$#words-3];
my $JOB = $words[$#words-2];
my $TABLE = substr($words[$#words],0,length(${words[$#words]})-3);
my $AUTO_HOME = $ENV{"AUTO_HOME"};
my $AUTO_DATA = "${AUTO_HOME}/DATA";
my $SDATA=$ENV{"AUTO_SDATADB"};
my $ODATA=$ENV{"AUTO_DATADB"};
my $FILE_PATH='';
if ( $#ARGV < 0 ) {
   exit(1);
}
# Get the first argument as control file
my $CONTROL_FILE = $ARGV[0];
my $TX_DATE = substr(${CONTROL_FILE},length(${CONTROL_FILE})-12, 4).'-'.substr(${CONTROL_FILE},length(${CONTROL_FILE})-8, 2).'-'.substr(${CONTROL_FILE},length(${CONTROL_FILE})-6, 2);
######################################################################
# get time
sub getCurrentDateTime
{
   my ($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime(time());
   my $current = "";
   my ($info) = @_;
   $year += 1900;
   $mon = sprintf("%02d", $mon + 1);
   $mday = sprintf("%02d", $mday);
   $hour = sprintf("%02d", $hour);
   $min  = sprintf("%02d", $min);
   $sec  = sprintf("%02d", $sec);
   $current = "[${year}-${mon}-${mday} ${hour}:${min}:${sec}]:";
   return "\n","[",$current,"]",$info,"\n";
}
######################################################################
# get location and create lzo index
sub location_index
{
   my ($db_name,$table_name,$tx_date) = @_;
   my @location=table_url($db_name,$table_name);
   print getCurrentDateTime("目标表位置.."),"$location[0]","\n";
   print getCurrentDateTime("目标表存储格式.."),"$location[1]","\n";
   if ( $location[1] eq 'com.hadoop.mapred.DeprecatedLzoTextInputFormat' ) {
   my $path=$location[0].'/dt='.$tx_date;
   my $result=lzo_index($path);
   if ($result == 0){
   print getCurrentDateTime("建立索引完成.."),"\n";
   return 0;}
   else {return 1;}
   }
   else{
   print getCurrentDateTime("非lzo存储,无需建立索引.."),"\n";
   return 0;}
}
######################################################################
# Hiveload function
sub run_Hiveload_command
{
 my ($datafile) = @_;
 my $result=1;
 $FILE_PATH ="$AUTO_DATA/process/$datafile";
 my $cmd='use '.$SDATA.';alter table '.$TABLE.' drop partition(dt = "'.$TX_DATE.'");load data local inpath "'.$FILE_PATH.'"  overwrite into table  '.$SDATA.'.'.$TABLE.' partition (dt = "'.$TX_DATE.'");';
 print getCurrentDateTime("开始执行"),$cmd,"\n";
 my $hivecmd="echo '".$cmd."exit;'|hive";
 my $ret=system("${hivecmd}") >> 8;
 if ( $ret == 0 ) {
      print getCurrentDateTime("执行成功"),"\n";
      print getCurrentDateTime("开始创建索引.."),"\n";
      my $lzoresult=location_index($SDATA,$TABLE,$TX_DATE);
      return $lzoresult;
   }
   else {
      print getCurrentDateTime("执行失败"),"\n";
      return $result;
   }
 
}
######################################################################
# main function
sub main
{
   my $ret;
   # Open control file
   unless (open(CTRLFILE_H, "${AUTO_DATA}/process/${CONTROL_FILE}")) {
  print "Can't open CTRLFILE_H:${AUTO_DATA}/process/${CONTROL_FILE}\n";
  exit(1);
 }
   # Get all data files
   my @fileList = <CTRLFILE_H>;

   # Close control file
   close(CTRLFILE_H);

   my $endoffile = 0;
   my $totalfile = $#fileList;
   my @fields;
   my $datafile;

   # To process all of data files in control file
   for (my $i = 0; $i <= $totalfile; $i++) {
      if ($i == $totalfile) {
         $endoffile = 1;
      }

      $datafile = $fileList[$i];
      chomp($datafile);
      @fields = split(/\s+/, $datafile);

      # Call Hiveload command to load data
      $ret = run_Hiveload_command($fields[0]);

      if ( $ret != 0 ) {
         last;
      }
   }
   return $ret;
}

######################################################################
# program section
# To see if there is one parameter,
print getCurrentDateTime(" 启动成功 .."),"\n";
print "加载任务..","\n";
print "JOB=",$JOB,"\n";
print "TX_DATE=",$TX_DATE,"\n";
print "Target_Table=",$SDATA.'.'.$TABLE,"\n";
my $rc = main();
exit($rc);
