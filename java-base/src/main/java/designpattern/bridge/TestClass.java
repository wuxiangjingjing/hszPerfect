package designpattern.bridge;

public class TestClass {

    public static void main(String[] args) {
        AbstractAreaA areaA = new AreaA2();
        areaA.bridge = new AreaB3();
        areaA.fromAreaA();
        areaA.bridge.targetAreaB();
    }
}
