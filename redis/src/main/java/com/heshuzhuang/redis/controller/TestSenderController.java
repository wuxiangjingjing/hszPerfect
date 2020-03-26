package com.heshuzhuang.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * 定时发送消息
 *
 * @author heshuzhuang
 * @Date 2020/3/26 15:40
 */
@EnableScheduling
@Component
public class TestSenderController {


	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	//向redis消息队列index通道发布消息
	@Scheduled(fixedRate = 3000)
	public void sendMessage(){
		stringRedisTemplate.convertAndSend("index",String.valueOf(Math.random()));
	}

}
