package designpattern.command;

public class Client {
    public static void main(String[] args) {
        WorkMan workMan = new CodeWorkMan();
        Command command = new CodeCommand(workMan);
        LittleLead littleLead = new LittleLead(command);
        littleLead.action();
    }
}
