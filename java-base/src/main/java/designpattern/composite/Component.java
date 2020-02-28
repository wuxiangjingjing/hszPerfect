package designpattern.composite;

/**
 * @author Rod
 */
public abstract class Component {
    private String name;

    Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
