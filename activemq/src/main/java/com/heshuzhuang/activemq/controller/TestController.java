package com.heshuzhuang.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;

/**
 * @author heshuzhuang
 * @Date 2020/3/20 17:07
 */
@RestController
@RequestMapping("/api/MQTest")
public class TestController {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Topic topic;



	@RequestMapping(value = "/mq" ,method = RequestMethod.POST)
	private String testMq(){
		jmsMessagingTemplate.convertAndSend(topic,"我是你爸爸");
		return "发送";
	}

}
