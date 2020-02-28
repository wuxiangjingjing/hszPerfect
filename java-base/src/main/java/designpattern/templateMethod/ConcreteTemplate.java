package designpattern.templateMethod;

/**
 * @author Rod
 */
public class ConcreteTemplate extends AbstractTemplate{

    @Override
    protected void abstractMethod() {
        System.out.println("具体模板实现的抽象方法");
    }

    @Override
    protected void hookMethod(){
        System.out.println("具体模板类实现的钩子方法");
    }
}
