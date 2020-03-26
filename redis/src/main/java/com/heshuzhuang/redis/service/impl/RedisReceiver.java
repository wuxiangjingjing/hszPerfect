package com.heshuzhuang.redis.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author heshuzhuang
 * @Date 2020/3/26 15:38
 */
@Service
public class RedisReceiver {

	public void receiveMessage(String message) {
		System.out.println("消息来了："+message);
		//这里是收到通道的消息之后执行的方法
	}
}
