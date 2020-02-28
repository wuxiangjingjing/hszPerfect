package designpattern.decorater.simple;

//抽象成绩单
public abstract class SchoolReport {
    //展示成绩情况
    public abstract void report();
    //家长签字
    public abstract void sign(String name);
}
