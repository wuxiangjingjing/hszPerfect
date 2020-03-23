package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public void add(String name, Flyweight flyweight) {
        flyweightMap.put(name, flyweight);
    }

    @Override
    public void operation(String outState) {
        Flyweight flyweight;
        for (String fly : flyweightMap.keySet()) {
            flyweight = flyweightMap.get(fly);
            flyweight.operation(outState);
        }
    }
}
