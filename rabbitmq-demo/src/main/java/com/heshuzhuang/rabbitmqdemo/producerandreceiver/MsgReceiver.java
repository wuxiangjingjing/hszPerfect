package com.heshuzhuang.rabbitmqdemo.producerandreceiver;


import com.heshuzhuang.rabbitmqdemo.config.RabbitmqConfig;
import com.heshuzhuang.rabbitmqdemo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author heshuzhuang
 * @Date 2019/11/14 19:37
 */
@Component
@RabbitListener(queues = RabbitmqConfig.QUEUE_A)
public class MsgReceiver {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RabbitHandler
	public void process(User content) {
		logger.info("接收处理队列A当中的消息： " + content);
	}

}
