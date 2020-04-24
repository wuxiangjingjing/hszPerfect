package com.example.heshuzhuang.springboot_rocketmq;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.message.rocketmq.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRocketmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRocketmqApplication.class, args);
	}


	@Autowired
	private RocketMQTemplate template;


	@RequestMapping(value = "/send",method = RequestMethod.GET)
	public void send(){
		User samplePayload = new User();
		samplePayload.setName("核黄素黄组那个");

		template.asyncSend("heshuzhuangceshi",samplePayload, new SendCallback() {
			@Override
			public void onSuccess(SendResult sendResult) {
				System.out.println(sendResult);
			}

			@Override
			public void onException(Throwable throwable) {
				System.out.println(throwable.toString());
			}
		});
	}
}
