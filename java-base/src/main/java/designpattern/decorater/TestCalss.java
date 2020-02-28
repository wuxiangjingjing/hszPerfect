package designpattern.decorater;

public class TestCalss {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        component = new Decorator1Impl(component);

        component = new Decorator1Impl1(component);

        component.operate();

    }
}
