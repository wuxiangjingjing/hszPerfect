package designpattern.observer;

/**
 * 只需要一个实现观察者接口的类就可以  这个可以不用
 */
public class Obsever03 extends AbstactObsever {

    private int age;

    public Obsever03(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void update(String info) {
        System.out.println(getName() + "得到通知：" + info + "，我还有个年龄:" + getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
