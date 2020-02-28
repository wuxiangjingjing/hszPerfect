package designpattern.observer.internal;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("学生名：" + name + "主题类名:" + observable.getClass().getName() + ",参数：" + o);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
