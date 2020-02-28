package designpattern.iterator;


/**
 * 白箱聚集与外禀迭代子
 */
public class OutIterator {

    /**
     * 抽象聚集角色 ，定出所有的具体聚集必须实现的接口。
     * 迭代子模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代子对象的实例。
     */
    public static abstract class Aggregate {
        /**
         * 工厂方法，创建相应迭代子对象的接口
         */
        public abstract Iterator createIterate();
    }

    /**
     * 具体聚集角色类，实现了抽象聚集角色类所要求的接口，也就是createIterator()方法。
     * 此外，还有方法getElement()向外界提供聚集元素，而方法size()向外界提供聚集的大小等。
     */
    public static class ConcreteAggregate extends Aggregate {

        private Object[] objArrary;

        public ConcreteAggregate(Object[] objArrary) {
            this.objArrary = objArrary;
        }

        @Override
        public Iterator createIterate() {
            return new ConcreteIterator(this);
        }

        public int size() {
            return objArrary.length;
        }

        public Object getElement(int index) {
            if (index > objArrary.length) {
                return null;
            }
            return objArrary[index];
        }
    }

    public interface Iterator {
        void first();

        void next();

        Object currentElem();

        boolean isDone();
    }

    public static class ConcreteIterator implements Iterator {

        private ConcreteAggregate aggregate;

        private int index;

        private int size;

        public ConcreteIterator(ConcreteAggregate aggregate) {
            this.aggregate = aggregate;
            this.size = aggregate.size();
            this.index = 0;
        }

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            index = index + 1;
        }

        @Override
        public Object currentElem() {
            return aggregate.getElement(index);
        }

        @Override
        public boolean isDone() {
            return index >= size;
        }
    }

    //客户端类
    public static class Client {
        public void operation() {
            Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
            // 创建聚合对象
            Aggregate agg = new ConcreteAggregate(objArray);
            // 循环输出聚合对象中的值
            Iterator it = agg.createIterate();
            while (!it.isDone()) {
                System.out.println(it.currentElem());
                it.next();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }

}
