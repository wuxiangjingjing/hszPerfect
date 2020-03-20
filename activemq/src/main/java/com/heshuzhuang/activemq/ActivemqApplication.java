package com.heshuzhuang.activemq;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Topic;

@SpringBootApplication
public class ActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqApplication.class, args);
	}


	@Bean
	public Topic topic(){
		return new ActiveMQTopic("Topic");
	}
}
