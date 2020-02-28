package designpattern.decorater;

public abstract class Decorator1 extends Component {

    private Component component;

    public Decorator1(Component component1) {
        this.component = component1;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
