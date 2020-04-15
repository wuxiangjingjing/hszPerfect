package com.heshuzhuang.rabbitmqdemo.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshuzhuang
 * @Date 2019/10/12 14:27
 */
@RestController("/api/hsz")
@Deprecated
public class HelloController {





	@RequestMapping(value = "/queryIn", method = RequestMethod.GET)
	@ApiOperation(value="获取图书列表", notes="获取图书列表")
	public String index() {


		return null;
	}

}
