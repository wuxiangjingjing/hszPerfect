package designpattern;


import designpattern.factory.SendEmail;
import designpattern.factory.SendMessage;
import designpattern.factory.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分
 * 注意：一个sender接口的列表
 */
public class BuilderPartten {

    private List<Sender> list = new ArrayList();

    public List<Sender> getList() {
        return list;
    }

    public void produceMailSend(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SendEmail());
        }
    }

    public void produceMessageSend(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SendMessage());
        }
    }

    public static void main(String[] args) {
        BuilderPartten partten = new BuilderPartten();
        partten.produceMailSend(10);
        partten.produceMessageSend(6);
        for (Sender sender : partten.getList()) {
            sender.send();
        }
    }
}
