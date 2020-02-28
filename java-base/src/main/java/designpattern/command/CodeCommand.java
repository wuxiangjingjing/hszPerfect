package designpattern.command;

public class CodeCommand implements Command {

    private WorkMan workMan;

    public CodeCommand(WorkMan workMan) {
        this.workMan = workMan;
    }

    @Override
    public void excuted() {
        workMan.coding();
        workMan.overWork();
        workMan.writeDocument();
    }

}
