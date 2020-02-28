package designpattern.factory;

public class SendMessage implements Sender{
    @Override
    public void send() {
        System.out.println("发短信........");
    }
}
