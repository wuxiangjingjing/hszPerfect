package designpattern.adapter;

/**
 *
 */
public class ClassAdapter extends Source implements Targetable {
    @Override
    public void method02() {
        System.out.println("adpter的method02");
    }

    public static void main(String[] args) {
        Targetable targetable = new ClassAdapter();
        targetable.method01();
        targetable.method02();
    }
}
