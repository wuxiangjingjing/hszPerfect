package designpattern.bridge;

public class TestClass {

    public static void main(String[] args) {
        // 实现类的简单示例
        AbstractAreaA areaA = new AreaA2();
        areaA.fromAreaA();

        // 接口的实现
        areaA.bridge = new AreaB3();
        areaA.bridge.targetAreaB();
    }
}
