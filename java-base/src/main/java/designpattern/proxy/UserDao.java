package designpattern.proxy;

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("正经的保存");
    }
}
