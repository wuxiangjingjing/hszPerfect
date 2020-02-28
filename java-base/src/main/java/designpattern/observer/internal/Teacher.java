package designpattern.observer.internal;

import java.util.Observable;

public class Teacher extends Observable {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student("许路路");
        teacher.addObserver(student);
        teacher.addObserver(new Student("许路路123"));
        teacher.addObserver(new Student("许路路456"));
        teacher.setChanged();
        teacher.notifyObservers("开学了");
        System.out.println("是否在修改中：" + teacher.hasChanged());

        teacher.deleteObserver(student);
        teacher.setChanged();
        teacher.notifyObservers("放假了");
        System.out.println("是否在修改中：" + teacher.hasChanged());
    }
}
