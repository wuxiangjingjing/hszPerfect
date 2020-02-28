package designpattern.memorandum;

/**
 * 负责人角色
 */
public class Caretaker {
    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
