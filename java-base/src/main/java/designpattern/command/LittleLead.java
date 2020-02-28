package designpattern.command;

/**
 * 调用者
 */
public class LittleLead {

    private Command command;

    public LittleLead(Command command) {
        this.command = command;
    }

    public void action() {
        command.excuted();
    }

}
