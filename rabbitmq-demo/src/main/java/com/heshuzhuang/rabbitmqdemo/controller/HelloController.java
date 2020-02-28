package com.heshuzhuang.rabbitmqdemo.controller;


import com.heshuzhuang.rabbitmqdemo.dto.User;
import com.heshuzhuang.rabbitmqdemo.producerandreceiver.MsgProducer;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshuzhuang
 * @Date 2019/10/12 14:27
 */
@RestController("/api/hsz")
public class HelloController {


	@Autowired
	private MsgProducer msgProducer;


	@RequestMapping(value = "/queryIn", method = RequestMethod.GET)
	@ApiOperation(value="获取图书列表", notes="获取图书列表")
	public String index() {
		User user = new User();
		user.setName("何书壮");
		msgProducer.sendMsg(user);
		return "偶吼吼";
	}

}
