#!/usr/bin/perl -w
use strict;
use Net::SMTP_auth;
 
#smtp�ʼ��������Ͷ˿�
my $smtpHost = 'smtp.163.com';
my $smtpPort = '25';
my $sslPort = '465';
 
#smtp��������֤�û�������(�������½�����ʱ����û���������)
my $username = 'lixinguang23@163.com';
my $passowrd = 'Daguang123';
 
#�ʼ������Ķ���Ҫȥ�Ķ�,�ʼ�����
my $from = 'lixinguang23@163.com';
my $to   = 'xinguang.li@dajie-inc.com';
my $subject = '[Notice]�����ʼ�';
 
#�����ʼ�header
my $header = << "MAILHEADER";
From:$from
To:$to
Subject:$subject
Mime-Version:1.0
Content-Type:text/plain;charset="UTF-8"
Content-Trensfer-Encoding:7bit
 
MAILHEADER
 
#�����ʼ�����
my $message = << "MAILBODY";
������д�ʼ������ݡ�
��ã���������$from�Ĳ����ʼ���
MAILBODY
 
#����ʼ��������֣��������ӵ�ʱ��������
my @helo = split /\@/,$from;
 
#����smtp������������/SSL/TLS���ַ�ʽ��������ʹ�õ�SMTP֧�����ѡ��һ��
#��2����ʱ����ע���ˣ�����=cut֮��ľ��Ǳ�ע�͵�
#��ͨ��ʽ��ͨ�Ź��̲�����
my $smtp = Net::SMTP_auth->new(
                "$smtpHost:$smtpPort",
                Hello   => $helo[1],
                Timeout => 30
                ) or die("Error:���ӵ�$smtpHostʧ�ܣ�");
$smtp->auth('LOGIN',$username,$passowrd) or die("Error:��֤ʧ�ܣ�");
 
=cut
#tls���ܷ�ʽ��ͨ�Ź��̼��ܣ��ʼ����ݰ�ȫ��ʹ��������smtp�˿�
use Net::SMTP::TLS;
my $smtp = Net::SMTP::TLS->new(
                "$smtpHost:$smtpPort",
                User     => $username,
                Password => $passowrd,
                Hello    => $helo[1],
                Timeout  => 30
                ) or die "Error:ͨ��TLS���ӵ�$smtpHostʧ�ܣ�";
 
#�����ssl���ܷ�ʽ��ͨ�Ź��̼��ܣ��ʼ����ݰ�ȫ
use Net::SMTP::SSL;
my $smtp = Net::SMTP::SSL->new(
                "$smtpHost:$sslPort",
                Hello   => $helo[1],
                Timeout => 30
                ) or die "Error:ͨ��SSL���ӵ�$smtpHostʧ�ܣ�";
$smtp->auth($username,$passowrd) or die("Error:��֤ʧ�ܣ�");
=cut
 
#�����ʼ�
$smtp->mail($from);
$smtp->to($to);
$smtp->data();
$smtp->datasend($header);
$smtp->datasend($message);
$smtp->dataend();
$smtp->quit();
 
print "OK";
exit 0;