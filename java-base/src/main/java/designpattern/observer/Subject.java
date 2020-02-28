package designpattern.observer;

public interface Subject {
    void add(IObsever obsever);

    void remove(IObsever obsever);

    void nodify(String info);
}
