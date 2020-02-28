package designpattern.templateMethod;

/**
 * @author Rod
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.templateMethod();
    }
}
