package designpattern.factory;

public class SendEmailFactory implements Provide{

    @Override
    public Sender produce() {
        return new SendEmail();
    }
}
