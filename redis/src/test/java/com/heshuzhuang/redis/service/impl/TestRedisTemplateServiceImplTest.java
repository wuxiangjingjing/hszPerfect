package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisTemplateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestRedisTemplateServiceImplTest {

	@Autowired
	private RedisTemplateService redisCacheTestService;

	@Test
	public void testDemo1(){
		redisCacheTestService.testRedisTemplate();
	}

}