package com.heshuzhuang.nacosspringcloudprovider.client.impl;

import com.heshuzhuang.nacosspringcloudconsumer.client.ProviderClient;
import com.heshuzhuang.nacosspringcloudprovider.biz.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主要是测试feign调用
 * @author heshuzhuang
 * @Date 2020/4/26 14:04
 */
@RestController
@Deprecated
public class ConfigController implements ProviderClient {


	@Autowired
	private Test test;


	@Override
	public String helloWorld() {
		return test.sayHello();
	}


	//	@RequestMapping(value = "/hello",method = RequestMethod.GET)
//	@ResponseBody
//	public String get(){
//		return "我是你爸爸";
//	}
}
