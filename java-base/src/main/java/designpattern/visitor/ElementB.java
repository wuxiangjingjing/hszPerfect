package designpattern.visitor;

public class ElementB extends Element{

    @Override
    void accept(Visiter visiter) {
        visiter.visiter(this);
    }
}
