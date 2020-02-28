package designpattern.templateMethod;

/**
 * @author Rod
 */
public abstract class AbstractTemplate {

    public void templateMethod() {
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    protected abstract void abstractMethod();

    protected void hookMethod() {
        System.out.println("抽象方法中的钩子方法");
    }

    protected final void concreteMethod() {
        System.out.println("不需要子类实现的基本方法，");
    }

}
