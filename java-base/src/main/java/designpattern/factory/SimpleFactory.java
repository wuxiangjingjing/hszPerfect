package designpattern.factory;


/**
 * 工厂方法模式
 * 弊端：每次有新的实现类都需要改工厂方法，就是本方法，在里面添加一个创建类
 */
public class SimpleFactory {

    private static SendMessage sendMessage(){
        return new SendMessage();
    }

    private static SendEmail sendEmail(){
        return new SendEmail();
    }

    /**
     * 最简单的工厂模式
     * @param arg 通过字符串判断执行的方法
     * @return
     */
    private Sender getSender(String arg) {
        if (arg.equals("message")) {
            return new SendMessage();
        } else if (arg.equals("email")) {
            return new SendEmail();
        }
        return null;
    }

    public static void main(String[] args) {
        String arg = "email";
        SimpleFactory simpleFactory = new SimpleFactory();
        Sender sender = simpleFactory.getSender(arg);
        sender.send();

        //多个方法的工厂
        sender = SimpleFactory.sendEmail();
        sender.send();
        sender = SimpleFactory.sendMessage();
        sender.send();
    }
}
