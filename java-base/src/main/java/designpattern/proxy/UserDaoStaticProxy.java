package designpattern.proxy;


/**
 * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
 *
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 2.缺点:
 *      因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 *      如何解决静态代理中的缺点呢?答案是可以使用动态代理方式
 */
public class UserDaoStaticProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoStaticProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("静态代理开始--");
        userDao.save();
        System.out.println("静态代理结束--");
    }

    public static void main(String[] args) {
        IUserDao user = new UserDao();
        UserDaoStaticProxy staticProxy = new UserDaoStaticProxy(user);
        staticProxy.save();
    }
}
