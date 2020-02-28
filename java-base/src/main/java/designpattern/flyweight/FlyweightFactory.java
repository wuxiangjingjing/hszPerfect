package designpattern.flyweight;

import java.util.HashMap;
import java.util.List;

public class FlyweightFactory {

    private HashMap<String, Flyweight> factory = new HashMap<>();

    public Flyweight getFlyweight(List<String> flyweightState) {
        ConcreteCompositeFlyweight concrete = new ConcreteCompositeFlyweight();
        for (String item : flyweightState) {
            concrete.add(item, getFlyweight(item));
        }
        return concrete;
    }

    public Flyweight getFlyweight(String flyweightState) {
        Flyweight fly = factory.get(flyweightState);
        if (fly == null) {
            fly = new ConcreteFlyweight(flyweightState);
            factory.put(flyweightState, fly);
        }
        return fly;
    }

    public int getFlyweightSize() {
        return factory.size();
    }

}
