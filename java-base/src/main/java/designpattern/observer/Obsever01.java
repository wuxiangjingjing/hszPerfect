package designpattern.observer;


/**
 * 只需要一个实现观察者接口的类就可以 就是这个
 */
public class Obsever01 implements IObsever {

    private String name;

    public Obsever01(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        System.out.println(name + "得到通知：" + info);
    }
}
