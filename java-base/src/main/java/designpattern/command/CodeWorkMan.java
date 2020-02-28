package designpattern.command;

/**
 * 具体执行者
 */
public class CodeWorkMan implements WorkMan {

    @Override
    public void writeDocument() {
        System.out.println("写文档的工作");
    }

    @Override
    public void coding() {
        System.out.println("撸代码");
    }

    @Override
    public void overWork() {
        System.out.println("加班");
    }
}
