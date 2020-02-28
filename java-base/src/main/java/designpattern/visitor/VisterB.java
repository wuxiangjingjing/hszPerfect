package designpattern.visitor;

public class VisterB extends Visiter {
    @Override
    public void visiter(ElmentA elmentA) {
        System.out.println("访问者B访问元素A");
    }

    @Override
    public void visiter(ElementB elementB) {
        System.out.println("访问者B访问元素A");
    }
}
