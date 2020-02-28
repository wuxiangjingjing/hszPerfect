package designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight01 = factory.getFlyweight("第一个");
        flyweight01.operation("我爱吃");

        Flyweight flyweight02 = factory.getFlyweight("第er个");
        flyweight02.operation("我爱玩");

        Flyweight flyweight03 = factory.getFlyweight("第三个");
        flyweight03.operation("我爱喝酒");

        Flyweight flyweight04 = factory.getFlyweight("第一个");
        flyweight04.operation("我爱吃还有玩");

        System.out.println("相等吗:" + (flyweight01 == flyweight04));

        System.out.println("长度：" + factory.getFlyweightSize());

        List<String> list = new ArrayList<>();
        String str01 = "第一个";
        String str02 = "第二个";
        String str03 = "第三个";
        String str04 = "第一个";
        list.add(str01);
        list.add(str02);
        list.add(str03);
        list.add(str04);
        Flyweight flyweight09 = factory.getFlyweight(list);
        flyweight09.operation("哈哈哈哈哈");
        System.out.println("长度：" + factory.getFlyweightSize());
    }

}
