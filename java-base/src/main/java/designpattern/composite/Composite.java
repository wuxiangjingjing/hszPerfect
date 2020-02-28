package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    List<Component> children = new ArrayList<>();

    Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {

        String temp = "";
        for (int i = 0; i < depth; i++) {
            temp += '-';
        }
        System.out.println(temp + getName());
        for (Component component : children) {
            component.display(depth + 2);
        }

    }
}
