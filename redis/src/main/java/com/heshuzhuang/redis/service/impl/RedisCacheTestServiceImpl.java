package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisCacheTestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author heshuzhuang
 * @Date 2020/3/24 14:49
 */
@Service
public class RedisCacheTestServiceImpl implements RedisCacheTestService {

	@Override
	@Cacheable(cacheNames = "hsz" ,value = "111111111")
	public String testRedis() {
		return "我是你的巴巴变";
	}
}
