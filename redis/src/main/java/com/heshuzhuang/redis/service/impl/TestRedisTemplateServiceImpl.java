package com.heshuzhuang.redis.service.impl;

import com.heshuzhuang.redis.service.RedisTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heshuzhuang
 * @Date 2020/3/25 15:12
 */
@Service
@Slf4j
public class TestRedisTemplateServiceImpl implements RedisTemplateService {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;



	@Override
	public void testRedisTemplate() {
		// 操作对象为string 时 推荐使用stringRedisTemplate
		stringRedisTemplate.opsForValue().set("key","value");
		// 操作  hash
		Map<String ,String> mapAdd = new HashMap<>();
		mapAdd.put("涅米","托尼");
		// h hash名称   hk map key值    hv map value
		redisTemplate.opsForHash().put("1","2","3");
		redisTemplate.opsForHash().put("1","23","3");
		redisTemplate.opsForHash().put("1","26","3");

		log.info("这是设呢么玩意" + redisTemplate.opsForHash().get("1","2"));

	}



}
