package com.heshuzhuang.nacosspringcloudconsumer.testcontroller;

import com.heshuzhuang.nacosspringcloudconsumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用Autowired   或者  构造器注入都是可以的，注解注入   代码更加简介
 *
 *
 * @author heshuzhuang
 * @Date 2020/4/26 15:07
 */
@Deprecated
@RestController
@RequestMapping("consumer")
public class ConsumerController {



	@Autowired
	ProviderClient providerClient;

//	public ConsumerController(ProviderClient providerClient) {
//		this.providerClient = providerClient;
//	}

	@RequestMapping(value = "/hello-comsumer",method = RequestMethod.GET)
	public  String hello(){
		String result = providerClient.helloWorld();
		return result;
	}
}
