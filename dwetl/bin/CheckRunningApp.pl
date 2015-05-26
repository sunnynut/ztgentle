#!/usr/bin/perl -w
################################################################################
## Program  : CheckRunningApp.pl
## WorkFlow v1.0 by dj
################################################################################

sub run_shell_result
{
my ($shell_buff) = @_;
my $list=`$shell_buff`;
if ( length($list) eq 0 )
{print "Input table Erro\n";
exit(1)
}
else{
return $list;
 }
}
sub main
{
my $applistcmd="yarn application -list |grep application_ |grep RUNNING|awk '{print \$1}'";
my $applist=run_shell_result($applistcmd);
my @app=split(/\n/,$applist);
for (my $i=0; $i <= $#app; $i += 1) {
	 print "Return Is: $app[$i]\n";
 	}
}
main();