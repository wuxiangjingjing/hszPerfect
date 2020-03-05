package com.example.heshuzhuang.springbootdubbonacosprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootDubboNacosProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboNacosProviderApplication.class, args);
	}

}
