package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理有以下特点:
 * 1.代理对象,不需要实现接口
 * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
 * 3.动态代理也叫做:JDK代理,接口代理
 */
public class DynamicProxyFactory {
    private Object target;

    public DynamicProxyFactory(Object object) {
        target = object;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("动态代理开始--方法名:" + method);
                        Object returnVlue = method.invoke(target, objects);
                        System.out.println("动态代理接结束--");
                        return returnVlue;
                    }
                });
    }

    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        System.out.println("原始类：" + userDao.getClass());
        DynamicProxyFactory proxyFactory = new DynamicProxyFactory(userDao);
        IUserDao proxy = (IUserDao) proxyFactory.getProxyInstance();
        System.out.println("代理类：" + proxy.getClass());
        proxy.save();
    }
}
