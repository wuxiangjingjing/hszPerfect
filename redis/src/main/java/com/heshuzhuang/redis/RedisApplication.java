package com.heshuzhuang.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 注解方式使用redis 缓存 @EnableCaching
 */

@SpringBootApplication
@EnableCaching
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

}
