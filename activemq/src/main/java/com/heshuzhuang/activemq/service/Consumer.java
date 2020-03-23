package com.heshuzhuang.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author heshuzhuang
 * @Date 2020/3/23 11:19
 */
@Component
public class Consumer {

	@JmsListener(destination = "Topic01")
	public void receiveMessage(String text) {
		System.out.println(text);
	}


}
