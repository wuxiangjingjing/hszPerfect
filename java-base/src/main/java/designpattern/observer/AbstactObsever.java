package designpattern.observer;

/**
 * 只需要一个实现观察者接口的类就可以  这个可以不用
 */
public abstract class AbstactObsever implements IObsever {

    private String name;

    public AbstactObsever(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        System.out.println(getName() + "得到通知：" + info);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
