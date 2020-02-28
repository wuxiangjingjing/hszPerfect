package designpattern.visitor;

public class ElmentA extends Element{
    @Override
    void accept(Visiter visiter) {
        visiter.visiter(this);
    }
}
