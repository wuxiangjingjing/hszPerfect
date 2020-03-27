package com.heshuzhuang.redis.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heshuzhuang.redis.service.impl.RedisReceiver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * redis 配置类
 * @author heshuzhuang
 * @Date 2020/3/25 13:40
 */
@Configuration
public class RedisConfig {


	@Bean
	@ConditionalOnMissingBean(name = "redisTemplate")
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {

		Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);

		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(redisConnectionFactory);
		template.setKeySerializer(jackson2JsonRedisSerializer);
		template.setValueSerializer(jackson2JsonRedisSerializer);
		template.setHashKeySerializer(jackson2JsonRedisSerializer);
		template.setHashValueSerializer(jackson2JsonRedisSerializer);
		template.afterPropertiesSet();
		return template;
	}

	@Bean
	@ConditionalOnMissingBean(StringRedisTemplate.class)
	public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
		StringRedisTemplate template = new StringRedisTemplate();
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}




	/**
	 * 下面为订阅发布配置bean
	 *
	 * redis消息监听器容器
	 * 可以添加多个监听不同话题的redis监听器，只需要把消息监听器和相应的消息订阅处理器绑定，该消息监听器
	 * 通过反射技术调用消息订阅处理器的相关方法进行一些业务处理
	 * @param connectionFactory
	 * @param listenerAdapter
	 * @return
	 */
	@Bean
	RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
	                                        MessageListenerAdapter listenerAdapter,
	                                        MessageListenerAdapter listeneAdapter
	) {
		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);

		//可以添加多个 messageListener
		container.addMessageListener(listenerAdapter, new PatternTopic("index"));
		container.addMessageListener(listeneAdapter, new PatternTopic("index"));
		return container;
	}


	/**
	 * 消息监听器适配器，绑定消息处理器，利用反射技术调用消息处理器的业务方法
	 * @param redisReceiver
	 * @return
	 */
	@Bean
	MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver) {
		System.out.println("A消息适配器进来了");
		return new MessageListenerAdapter(redisReceiver, "receiveMessage");
	}

	/**
	 * 客户端2
	 * @param redisReceiver
	 * @return
	 */
	@Bean
	MessageListenerAdapter listeneAdapter(RedisReceiver redisReceiver) {
		System.out.println("B消息适配器进来了");
		return new MessageListenerAdapter(redisReceiver, "receiveMessage2");
	}


}
