package designpattern.decorater;

public class Decorator1Impl1 extends Decorator1 {

    public Decorator1Impl1(Component component1) {
        super(component1);
    }

    public void Test002() {
        System.out.println("0002222222");
    }

    @Override
    public void operate() {
        super.operate();
        Test002();
    }
}
