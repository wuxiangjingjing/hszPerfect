package designpattern.memorandum;

/**
 * 发起人角色
 */
public class Originator {

    private String state;

    public Memento CreateMemonto() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
