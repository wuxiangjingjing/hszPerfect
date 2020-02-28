package designpattern.facade;

public class Client {
    public static void main(String[] args) {
        SysFacade sysFacade = SysFacade.getInstance();
        sysFacade.excute();
    }
}
