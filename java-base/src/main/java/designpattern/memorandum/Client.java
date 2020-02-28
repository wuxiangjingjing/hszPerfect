package designpattern.memorandum;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("ON");
        caretaker.setMemento(originator.CreateMemonto());
        originator.setState("OFF");
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
