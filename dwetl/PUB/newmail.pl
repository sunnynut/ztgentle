#!/usr/bin/perl
use Net::SMTP;
my $mail_date = $ARGV[0];

my $mailhost = "mail.dajie-inc.com"; # SMTP������
my $mailfrom = 'xinguang.li@dajie-inc.com'; # ���EMAIL��ַ
my @mailto = ('xinguang.li@dajie-inc.com','15010657470@139.com'); # �����˵�ַ
my $subject = "ETL_23��PYT���񱨴�����";

my $text = "����";

$smtp = Net::SMTP->new($mailhost, Hello => 'localhost', Timeout => 120, Debug => 1); #Ϊ0ʱ�������������Ϣ
# anth login, type your user name and password here
$smtp->auth('user','pass'); ###�û���������
foreach my $mailto (@mailto) {
# Send the From and Recipient for the mail servers that require it
$smtp->mail($mailfrom);
$smtp->to($mailto);
# Start the mail
$smtp->data();
# Send the header
$smtp->datasend("To: $mailto\n");
$smtp->datasend("From: $mailfrom\n");
$smtp->datasend("Subject: $subject\n");
$smtp->datasend("\n");
# Send the message
$smtp->datasend("$text\n\n");
# Send the termination string
$smtp->dataend();
}
$smtp->quit;
