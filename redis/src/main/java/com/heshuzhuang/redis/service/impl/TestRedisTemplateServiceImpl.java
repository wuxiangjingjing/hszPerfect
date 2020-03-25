package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author heshuzhuang
 * @Date 2020/3/25 15:12
 */
@Service
public class TestRedisTemplateServiceImpl implements RedisTemplateService {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	@Override
	public void testRedisTemplate() {

		// 操作对象为string 时 推荐使用stringRedisTemplate
		stringRedisTemplate.opsForValue().set("key","value");

	}
}
