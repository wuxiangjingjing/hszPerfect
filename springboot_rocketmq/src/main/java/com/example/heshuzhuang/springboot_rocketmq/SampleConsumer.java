package com.example.heshuzhuang.springboot_rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.message.rocketmq.annotation.RocketMQMessageListener;
import org.springframework.boot.message.rocketmq.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 *
 * 对于中间件的使用（引入内网的jar   外网暂无法使用）
 *
 *
 *
 * @author heshuzhuang
 * @Date 2020/4/17 16:54
 */
@Component
@RocketMQMessageListener(topic = "heshuzhuangceshi", consumerGroup = "g1")
@Slf4j
public class SampleConsumer implements RocketMQListener<User> {

		@Override
		public void onMessage(User message) {

			log.info("接收到消息: {}", message);

		}
}
