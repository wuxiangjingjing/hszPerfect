package designpattern;


/**
 * 单例模式
 * 注意：1、私有构造器
 *      2、实例化一次
 *      3、饱汉式-实例直接new出来，本例采用饿汉式
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (new Object()) {
                if (singleton == null) {
                    System.out.println(".......创建一个实例......");
                    singleton = new Singleton();
                }
            }
            System.out.println("....逃离synchronized...");
        }
        System.out.println("....完成到这里...");
        return singleton;
    }

    private String filed;

    public static void main(String[] args) {
        Singleton singleton001 = Singleton.getInstance();
        new Thread(()->{
            Singleton singleton002 = Singleton.getInstance();
            singleton002.setFiled("设置678");
            System.out.println(".....:" + singleton001.getFiled());
        }).start();
        singleton001.setFiled("设置");
        System.out.println(".....:" + singleton001.getFiled());
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }
}
