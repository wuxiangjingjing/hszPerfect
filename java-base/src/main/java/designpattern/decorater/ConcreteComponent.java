package designpattern.decorater;

public class ConcreteComponent extends Component{

    @Override
    public void operate() {
        System.out.println("具体实现类");
    }
}
