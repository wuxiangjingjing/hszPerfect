package designpattern.adapter;

/**
 *
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void method01() {
        source.method01();
    }

    @Override
    public void method02() {
        System.out.println("objectAdapter的method02");
    }

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new ObjectAdapter(source);
        targetable.method02();
        targetable.method01();
    }
}
