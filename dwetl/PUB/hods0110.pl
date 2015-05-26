#!/usr/bin/perl
# ods operation script from sdata to ods
# Date Time    : 2013-08-01 12:00:00
# Author: jrjt
# Script File  : hoperation.pl

use strict; # Declare using Perl strict syntax
use jrjtcommon;
my $x = $0;
$x=~ s/\//\\/g;
my @words=split(/\\/, $x);
my $SYS = $words[$#words-3];
my $JOB = $words[$#words-2];
my $TABLE = substr($words[$#words],0,length(${words[$#words]})-3);
my $AUTO_HOME = $ENV{"HOME"};
my $AUTO_DATA = "${AUTO_HOME}/DATA";
my $ddlfile="/".$words[$#words-7]."/".$words[$#words-6]."/".$words[$#words-5]."/".$words[$#words-4]."/".$words[$#words-3]."/".$words[$#words-2]."/ddl/".substr($words[$#words],0,length(${words[$#words]})-3).".ddl";
my $SDATA=$ENV{"AUTO_SDATADB"};
my $ODATA=$ENV{"AUTO_DATADB"};
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
   $current = "${year}-${mon}-${mday} ${hour}:${min}:${sec}";
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
   my $path=$location[0];
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
# ods operation function
sub run_Hiveods_operation
{
 my ($operation_sql) = @_;
 my $result=1;
 print getCurrentDateTime("开始执行.."),"\n";
 my $ret=system("$operation_sql") >> 8;
 print getCurrentDateTime("ret"),"$ret","\n";
 print getCurrentDateTime("?"),"$?","\n";
 if ( $ret == 0 ) {
      print getCurrentDateTime("执行成功"),"\n";
      print getCurrentDateTime("开始创建索引.."),"\n";
      my $lzoresult=location_index('ods',$TABLE,$TX_DATE);
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
unless (open (MYFILE, $ddlfile)) {
die ("cannot open input file $ddlfile");
}
$/="";
my $sql_buff=<MYFILE>;
$sql_buff=~s/jrjt_day/$TX_DATE/g;
$sql_buff=~s/JRJT_DAY/$TX_DATE/g;
close(MYFILE);
$/="\n";
my $cmd="echo '".$sql_buff."exit;'|hive -i /home/jrjt/dwetl/PUB/UDF/udf/hive.config";
print getCurrentDateTime('执行脚本'),"\n";
$ret = run_Hiveods_operation($cmd);
return $ret;
}

######################################################################
# program section
# To see if there is one parameter,
print getCurrentDateTime(" 启动成功 .."),"\n";
print "计算任务..","\n";
print "JOB=",$JOB,"\n";
print "TX_DATE=",$TX_DATE,"\n";
print "Target_Table=",$TABLE,"\n";
print "DdlPath=",$ddlfile,"\n";
my $rc = main();
exit($rc);
