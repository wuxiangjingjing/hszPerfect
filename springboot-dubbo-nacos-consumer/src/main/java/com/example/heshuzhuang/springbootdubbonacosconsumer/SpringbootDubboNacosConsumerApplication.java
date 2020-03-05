package com.example.heshuzhuang.springbootdubbonacosconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootDubboNacosConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboNacosConsumerApplication.class, args);
	}

}
