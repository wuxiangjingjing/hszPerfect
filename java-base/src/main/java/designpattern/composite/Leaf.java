package designpattern.composite;

public class Leaf extends Component{

    Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Can not add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Can not remove from a leaf");
    }

    @Override
    public void display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++)
            temp += '-';
        System.out.println(temp + getName());
    }
}
