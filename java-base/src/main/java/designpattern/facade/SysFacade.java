package designpattern.facade;

public class SysFacade {

    private static SysFacade facade = new SysFacade();

    private SysFacade() {
    }

    public static SysFacade getInstance() {
        return facade;
    }

    ISystemA systemA = new SystemA();
    ISystemB systemB = new SystemB();
    ISystemC systemC = new SystemC();

    public void excute() {
        systemB.excute();
        systemA.excute();
        systemC.excute();
    }
}
