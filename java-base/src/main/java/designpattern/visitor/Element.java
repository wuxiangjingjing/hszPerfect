package designpattern.visitor;

//被访问者抽象类
public abstract class Element {
    abstract void accept(Visiter visiter);
}
