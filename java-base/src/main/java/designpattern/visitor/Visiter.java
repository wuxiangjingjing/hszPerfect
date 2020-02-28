package designpattern.visitor;

//访问者角色 可以访问不同的被访问者
public abstract class Visiter {

    public abstract void visiter(ElmentA elmentA);

    public abstract void visiter(ElementB elementB);
}
