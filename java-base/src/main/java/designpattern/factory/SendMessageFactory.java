package designpattern.factory;

public class SendMessageFactory implements Provide{

    @Override
    public Sender produce() {
        return new SendMessage();
    }
}
