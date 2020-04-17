package com.heshuzhuang.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author heshuzhuang
 * @Date 2020/3/20 17:07
 */
@RestController
@RequestMapping("/api/MQTest")
public class TestController {

	/**
	 * 消息队列的官方文档
	 * RocketMQ 官方文档： https://rocketmq.apache.org/docs/quick-start/RocketMQ
	 * 中国开发者中心：http://rocketmq.cloud/zh-cn/
	 * Kafka 官方文档： http://kafka.apache.org/documentation/
	 * RabbitMQ官方文档： https://www.rabbitmq.com/documentation.html
	 *
	 * 两种模式     消息队列   与    发布订阅
	 */

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Topic topic;

	@Autowired
	private Queue queue;


	@RequestMapping(value = "/mq" ,method = RequestMethod.POST)
	private String testMq(){
		jmsMessagingTemplate.convertAndSend(topic,"我是你爸爸");
		return "发送";
	}

}
