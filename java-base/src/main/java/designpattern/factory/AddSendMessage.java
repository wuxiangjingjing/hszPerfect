package designpattern.factory;

public class AddSendMessage implements Sender {
    @Override
    public void send() {
        System.out.println("新加的发送方法.......");
    }
}
