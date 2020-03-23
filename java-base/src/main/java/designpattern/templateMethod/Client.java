package designpattern.templateMethod;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.templateMethod();
    }
}
