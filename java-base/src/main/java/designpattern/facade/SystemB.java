package designpattern.facade;

public class SystemB implements ISystemB {
    @Override
    public void excute() {
        System.out.println("系统B的方法调用.....");
    }
}
