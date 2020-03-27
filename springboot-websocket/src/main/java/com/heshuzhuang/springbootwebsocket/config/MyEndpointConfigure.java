package com.heshuzhuang.springbootwebsocket.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.websocket.server.ServerEndpointConfig;
/**
 * 博客地址：https://blog.csdn.net/qq_35387940/article/details/93483678
 *
 * ApplicationContextAware
 * 当一个类实现了这个接口（ApplicationContextAware）之后，这个类就可以方便获得ApplicationContext中的所有bean。
 * 换句话说，就是这个类可以直接获取spring配置文件中，所有有引用到的bean对象
 *
 *
 *
 * @Author：JCccc
 * @Description：
 * @Date： created in 15:56 2019/5/13
 */
public class MyEndpointConfigure extends ServerEndpointConfig.Configurator implements ApplicationContextAware {
	private static volatile BeanFactory context;

	@Override
	public <T> T getEndpointInstance(Class<T> clazz) throws InstantiationException {
		return context.getBean(clazz);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		MyEndpointConfigure.context = applicationContext;
	}
}