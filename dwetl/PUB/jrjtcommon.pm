#!/usr/bin/perl
###############################################################################
# Program  : jrjtcommon.pm
# Argument : none
# Task automation v1.0 
###############################################################################

use strict;


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
sub run_shell_status
{
my ($shell_buff) = @_;
my $status=system($shell_buff) >> 8;
if ( $status eq 0 )
{return $status;
}
else{
return 1;
 }
}

sub table_url
{
my ($db_name,$table_name) = @_;
my $location='';
my $inputformat='';
my $cmd="hive -e'use $db_name;desc formatted $table_name'" ;
my $table_get='@'.run_shell_result($cmd);
my @table_info=split(/\n/,$table_get);
if ( $#table_info < 10 )
{print "No Table Found!!\n";
exit(1)
}
else{
for (my $row = 0; $row <= $#table_info; $row++) {
    my $info=$table_info[$row];
    my @row_info=split(/\t/,$info);
        my $line_info=$row_info[0];
        $line_info =~ s/\s//g;
        if($line_info eq 'Location:'){
        $location=$row_info[1];
        $location=~ s/\s//g;
        }
        if($line_info eq 'InputFormat:'){
        $inputformat=$row_info[1];
        $inputformat=~ s/\s//g;
        }
}
return $location,$inputformat;
}
}

sub stage_table_columns
{
my ($db_name,$table_name) = @_;
my $columns='';
my $cmd="hive -e'use $db_name;desc $table_name'" ;
my $table_get=run_shell_result($cmd);
my @table_info=split(/\n/,$table_get);
if ( substr($table_info[0],length($table_info[0])-5,5) eq 'exist' )
{print "No Table Found!!\n";
exit(1)
}
else{
for (my $row = 0; $row <= $#table_info; $row++) {
    my $info=$table_info[$row];
    my @row_info=split(/\t/,$info);
        my $line_info=$row_info[0];
        $line_info =~ s/\s//g;
        $columns=$columns.','.$line_info;
}
return lc(substr($columns,1,length($columns)-4));
}
}


sub lzo_index
{
my ($path) = @_;
my $cmd='hadoop jar $HADOOP_HOME/lib/hadoop-lzo-0.4.14.jar com.hadoop.compression.lzo.DistributedLzoIndexer '.$path;
my $result=run_shell_status($cmd);
print "result=$result\n";
if ( $result eq 0 )
{return 0;
}
else{
print "LzoIndexer Failed ,Please Check It!\n";
exit(1);
 }
}
sub string_md5
{
my ($string) = @_;
my $cmd='echo -n '.$string.'|md5sum';
my $result=run_shell_result($cmd);
my @md5=split(/\s+/,$result);
return $md5[0];
}

sub parseXml
{
use XML::Simple;
use Encode;
use Encode::CN;
my ($filename,$parentnode,$childnode) = @_;
my $info = "";

if(defined($filename)&&defined($parentnode)&&defined($childnode)){#传入参数个数为3表示解析子节点的属性

my $conf = XMLin($filename);# 参数$filename为需要解析的xml文件名。这一步用来打开xml文件
my $i = 0;
while( $conf->{$parentnode}->[$i] )  #遍历$parentnode节点
{
$info .= "$conf->{$parentnode}->[$i]->{$childnode},"; #取出第i个$parentnode节点的$childnode属性的值拼成一个用逗号间隔的字符串
    $i ++;
}

if(length($info)>$i){
    $info = substr($info,0,-1); # 去掉最后一个逗号
}else{
$info = "";
}

$info = encode("euc-cn",decode_utf8($info)); #
return "$info"; # 输出解析出来的结果
}elsif(defined($filename)&&defined($parentnode)){#传入参数个数为2表示解析根节点的属性

my $conf = XMLin($filename);# 参数$filename为需要解析的xml文件名。这一步用来打开xml文件
return "$conf->{$parentnode} \n";#取出根节点的属性
}else{ 
print " \n--------- you need at least two arguments ! ----------\n";
}
}

sub main
{
my $db_name='stage';
my $table_name='s_s02_union_user';
print "db_name=$db_name\ntable_name=$table_name\n";
my $result = stage_table_columns($db_name,$table_name);
print "result=$result\n";
my $md5=string_md5($result);
print "md5=$md5\n";

#my $lzo_status=table_columns($result[0]);
#print "lzo_status=$lzo_status\n";
}
#my $rc = main();
return 1;
