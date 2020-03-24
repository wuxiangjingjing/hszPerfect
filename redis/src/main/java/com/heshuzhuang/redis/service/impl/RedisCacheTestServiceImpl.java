package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisCacheTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author heshuzhuang
 * @Date 2020/3/24 14:49
 */
@Service
@Slf4j
public class RedisCacheTestServiceImpl implements RedisCacheTestService {


	/**
	 * value 和 cacheNames 不可以同时设置
	 * @return
	 */
	@Override
	@Cacheable(cacheNames = "hsz" ,key = "111111111")
	public String testRedis() {
		log.info("进来了否");
		return "我是你的巴巴变";
	}
}
