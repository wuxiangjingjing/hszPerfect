package designpattern.decorater;

public class Decorator1Impl extends Decorator1 {

    public Decorator1Impl(Component component) {
        super(component);
    }

    public void test001() {
        System.out.println("添加功能00001111");
    }

    @Override
    public void operate() {
        test001();
        super.operate();
    }
}
