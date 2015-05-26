use DBI;
$user="dataol";
$passwd="dataol-13";
$dbh="";
$dbh = DBI->connect("dbi:mysql:database=db_datamgrcfg;host=10.10.67.17;port=3353",$user,$passwd) or die "can't connect to
database ". DBI-errstr;
$sth=$dbh->prepare("select * from etl_job limit 10");
$sth->execute;
while (@recs=$sth->fetchrow_array) {
print $recs[0].":".$recs[1].":".$recs[2]."\n";
}
$dbh->disconnect;
