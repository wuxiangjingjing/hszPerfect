package designpattern.factory;

public class SendEmail implements Sender{
    @Override
    public void send() {
        System.out.println("发邮件........");
    }
}
