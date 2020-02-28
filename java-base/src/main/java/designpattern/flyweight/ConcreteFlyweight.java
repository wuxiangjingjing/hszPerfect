package designpattern.flyweight;

/**
 * @author Rod
 */
public class ConcreteFlyweight implements Flyweight {

    private String innerState;

    //由工厂创建，自己不能创建
    ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void operation(String outState) {
        System.out.println("内部状态：" + innerState);
        System.out.println("外部状态：" + outState);
    }
}
