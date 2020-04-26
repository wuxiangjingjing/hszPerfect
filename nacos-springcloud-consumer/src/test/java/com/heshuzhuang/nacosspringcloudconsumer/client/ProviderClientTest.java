package com.heshuzhuang.nacosspringcloudconsumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController
@RequestMapping("consumer")
class ProviderClientTest {


	@Autowired
	ProviderClient providerClient;

	@RequestMapping(value = "/hello-comsumer",method = RequestMethod.GET)
	public  String hello(){
		String result = providerClient.helloWorld();
		return result;
	}


}