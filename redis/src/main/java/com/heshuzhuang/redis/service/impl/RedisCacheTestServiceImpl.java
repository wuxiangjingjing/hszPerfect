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
	 *
	 *  注解开启缓存 todo 注解中的参数的意义
	 *  key 可以动态的设置为方法的   参数     ps: key="#参数"   or key = "#参数.属性"
	 *  condition   为缓存的条件，当符合条件时才进行缓存
	 *  unless 即条件不成立时缓存 ps:unless = "#result.code != 0",#result 代表返回值，意思是当返回码不等于 0 时不缓存，也就是等于 0 时才缓存
	 *
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
