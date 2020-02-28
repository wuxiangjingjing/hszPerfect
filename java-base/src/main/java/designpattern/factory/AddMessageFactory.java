package designpattern.factory;

public class AddMessageFactory implements Provide {
    @Override
    public Sender produce() {
        return new AddSendMessage();
    }
}
