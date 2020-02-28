package designpattern.observer;

/**
 * 只需要一个实现观察者接口的类就可以  这个可以不用
 */
public class Obsever02 extends AbstactObsever {

    public Obsever02(String name) {
        super(name);
    }

    @Override
    public void update(String info) {
        System.out.println(getName() + "得到通知：" + info);
    }
}
