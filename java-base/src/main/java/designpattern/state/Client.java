package designpattern.state;

public class Client {
    public static void main(String[] args) {
        State state = new SunshineState();
        Context context = new Context(state);
        String mess = context.getMessage();
        System.out.println("......" + mess);
        mess = context.getMessage();
        System.out.println("......" + mess);
        mess = context.getMessage();
        System.out.println("......" + mess);
        mess = context.getMessage();
        System.out.println("......" + mess);
    }
}
