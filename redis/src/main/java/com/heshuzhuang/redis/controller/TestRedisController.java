package com.heshuzhuang.redis.controller;

import com.heshuzhuang.redis.service.RedisCacheTestService;
import com.heshuzhuang.redis.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshuzhuang
 * @Date 2020/3/24 14:48
 */
@RestController
@RequestMapping("test/redis")
public class TestRedisController {

	@Autowired
	private RedisCacheTestService redisCacheTestService;

	@Autowired
	private RedisTemplateService redisTemplateService;

	/**
	 * 测试缓存
	 * @return
	 */
	@GetMapping("/test")
	public String testRedis(){
		return redisCacheTestService.testRedis();
	}


	/**
	 * 测试缓存
	 * @return
	 */
	@GetMapping("/test/template")
	public String template(){
		redisTemplateService.testRedisTemplate();
		return null;
	}

}
