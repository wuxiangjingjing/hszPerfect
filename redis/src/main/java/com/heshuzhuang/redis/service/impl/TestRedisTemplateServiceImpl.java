package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisCacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author heshuzhuang
 * @Date 2020/3/25 15:12
 */
public class TestRedisTemplateServiceImpl implements RedisCacheTestService {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;




	@Override
	public String testRedis() {
		return null;
	}
}
