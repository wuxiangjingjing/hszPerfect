package designpattern.facade;

public class SystemA implements ISystemA {
    @Override
    public void excute() {
        System.out.println("系统A的方法调用.........");
    }

    public void excute1() {
        System.out.println("系统A");
    }
}
