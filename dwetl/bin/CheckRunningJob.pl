#!/usr/bin/perl -w
###############################################################################
# Program  : CheckRunningJob.pl
# WorkFlow v1.0 by dj
###############################################################################

use strict;
use DBI;

my $VERSION = "v1.0";

my $home = $ENV{"AUTO_HOME"};

unshift(@INC, "$home/bin");

require etl_unix;

my $dbCon;

sub SendRunningInfo
{
 my ($dbCon, $Job) = @_;
 my @RunninglInfo=getJobRunninglInfo($dbCon, $Job);
 my $runningjob=$RunninglInfo[0];
 ETL::showPrefixSpace(); print "runningjob $runningjob!\n";
 my $runningdate=$RunninglInfo[1];
 ETL::showPrefixSpace(); print "runningdate $runningdate!\n";
 my $runningfix=$RunninglInfo[2];
 ETL::showPrefixSpace(); print "runningfix $runningfix!\n";
 my @telnumber=getMontel($dbCon,$runningfix);
 for (my $i=0; $i <= $#telnumber; $i += 1) {
 	ETL::showPrefixSpace(); print "telnumber $telnumber[$i]!\n";
 	my $sendinfo="http://stat.dajie.com/log_query/smsSend.do?template=99&mobile=".$telnumber[$i]."&taskName=".$runningjob."&runningTime=".$runningdate."&personName=".$runningfix;
 	ETL::showPrefixSpace(); print "sendinfo $sendinfo!\n";
  my $sendcmd="curl '".$sendinfo."'";
  my $ret = system($sendcmd);
  $ret = $ret >> 8;
  ETL::showPrefixSpace(); print "Return Code is $ret\n";
 	}
}

sub getJobRunninglInfo
{
   my ($dbh,$job) = @_;
   my @tabrow;
      
   my $sqlText = "SELECT etl_job,UNIX_TIMESTAMP(NOW())-UNIX_TIMESTAMP(Last_StartTime) timediffsec ,main_man FROM ${ETL::ETLDB}ETL_Job" .
                " WHERE ENABLE =1 AND etl_job='$job' ";
   $dbh->do("SET NAMES 'UTF8'");
   my $sth = $dbh->prepare($sqlText);

   unless ($sth) { return ""; }

   $sth->execute();
    
   @tabrow = $sth->fetchrow();

   $sth->finish();

   return $tabrow[0],$tabrow[1],$tabrow[2];
}
sub getAllRunninglInfo
{
   my ($dbh) = @_;
   my @tabrow;
      
   my $sqlText = "SELECT etl_job FROM ${ETL::ETLDB}ETL_Job" .
                " WHERE ENABLE =1 AND Last_JobStatus='Running' AND UNIX_TIMESTAMP(NOW())-UNIX_TIMESTAMP(Last_StartTime)>=7200 ";
   $dbh->do("SET NAMES 'UTF8'");
   my $sth = $dbh->prepare($sqlText);

   unless ($sth) { return ""; }

   $sth->execute();
   my @JobList = ();
   my $n = 0;
   my $count = 0;
   while ( @tabrow = $sth->fetchrow() ) {
      $JobList[$n++] = $tabrow[0];
      $count++;
   }
   ETL::showPrefixSpace(); print "count $count!\n";
   $sth->finish();
   return @JobList;
}
sub getMontel
{
   my ($dbh,$runningfix) = @_;
   my @tabrow;
      
   my $sqlText = "SELECT Mobile FROM etl_user WHERE (Description='job_monitor') OR( STATUS=1 AND Mobile IS NOT NULL AND UserName='$runningfix')";
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
   return @TelList;}
sub main
{
$dbCon = ETL::connectETL();
unless ( defined($dbCon) ) {
   # Can not connect to database
   print STDERR "Unable to connect database\n";
   exit(2);
}
my @AllRunning=getAllRunninglInfo($dbCon);
for (my $i=0; $i <= $#AllRunning; $i += 1) {
	my $job=$AllRunning[$i];
	SendRunningInfo($dbCon,$job);
	}
}
main();