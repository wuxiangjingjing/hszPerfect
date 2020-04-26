package com.heshuzhuang.nacosspringcloudprovider.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshuzhuang
 * @Date 2020/4/26 14:04
 */
@RestController
public class ConfigController {


	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	@ResponseBody
	public String get(){
		return "我是你爸爸";
	}
}
