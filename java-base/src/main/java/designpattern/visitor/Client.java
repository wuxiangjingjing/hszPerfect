package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();

        Element element1 = new ElmentA();
        Element element2 = new ElementB();
        Element element3 = new ElementB();
        Element element4 = new ElmentA();
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);
        elements.add(element4);

        Visiter visiter1 = new VisiterA();
        for (Element element : elements) {
            element.accept(visiter1);
        }

        Visiter visiter2 = new VisterB();
        for (Element element : elements) {
            element.accept(visiter2);
        }

    }
}
