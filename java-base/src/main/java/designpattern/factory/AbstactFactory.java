package designpattern.factory;

/**
 * 抽象工厂
 * 注意点：在接口provide中提供获取sender的方法
 */
public class AbstactFactory {
    public static void main(String[] args) {
        Provide provide = new SendEmailFactory();
        provide.produce().send();
        provide = new SendMessageFactory();
        provide.produce().send();
    }
}
