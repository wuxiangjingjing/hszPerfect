package com.heshuzhuang.nacosspringcloudconsumer.testcontroller;

import com.heshuzhuang.nacosspringcloudconsumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshuzhuang
 * @Date 2020/4/26 15:07
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {



	@Autowired
	ProviderClient providerClient;

	@RequestMapping(value = "/hello-comsumer",method = RequestMethod.GET)
	public  String hello(){
		String result = providerClient.helloWorld();
		return result;
	}
}
