package designpattern;


import java.io.*;

/**
 * 原型模式：最不像设计模式的模式
 */
public class PrototypeParttern implements Cloneable, Serializable {
    private String str;

    private SeriaObject seriaObject;

    public static void main(String[] args) {

    }

    //浅复制
    public Object colne() throws CloneNotSupportedException {
        PrototypeParttern prototypeParttern = (PrototypeParttern) super.clone();
        return prototypeParttern;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SeriaObject getSeriaObject() {
        return seriaObject;
    }

    public void setSeriaObject(SeriaObject seriaObject) {
        this.seriaObject = seriaObject;
    }

    public class SeriaObject implements Serializable {

    }
}
