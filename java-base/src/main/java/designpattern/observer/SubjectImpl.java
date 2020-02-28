package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private static List<IObsever> obseverList = new ArrayList<>();

    @Override
    public void add(IObsever obsever) {
        obseverList.add(obsever);
    }

    @Override
    public void remove(IObsever obsever) {
        if (!obseverList.isEmpty()) {
            obseverList.remove(obsever);
        }
    }

    @Override
    public void nodify(String info) {
        if (!obseverList.isEmpty()) {
            for (IObsever obsever : obseverList) {
                //remove(obsever);
                obsever.update(info);
            }
        }
    }

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        /*IObsever obsever3 = new Obsever03("三号学生", 9);
        subject.add(new Obsever01("一号学生"));
        subject.add(obsever3);
        subject.add(new Obsever02("2号学生"));

        subject.nodify("开学了开学了");

        System.out.println("--------------------------------------");
        subject.remove(obsever3);
        //subject.remove(new Obsever02("2号学生"));

        subject.nodify("放假了");*/
        IObsever obsever1 = new Obsever01("1号学生");
        IObsever obsever2 = new Obsever01("2号学生");
        IObsever obsever3 = new Obsever01("3号学生");
        IObsever obsever4 = new Obsever01("4号学生");
        subject.add(obsever1);
        subject.add(obsever2);
        subject.add(obsever3);
        subject.add(obsever4);
        subject.nodify("开学了开学了");
        System.out.println("--------------------------------------");
        subject.remove(obsever3);
        subject.remove(obsever4);
        subject.nodify("放假了");

    }
}
