package com.heshuzhuang.rabbitmqdemo.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


/**
 * @author heshuzhuang
 * @Date 2019/11/14 16:48
 */
@Configuration
public class RabbitmqConfig {
	private static final Logger log= LoggerFactory.getLogger(RabbitmqConfig.class);
//  暂未做
//	@Autowired
//	private Environment env;
//
//	@Autowired
//	private CachingConnectionFactory connectionFactory;
//
//	@Autowired
//	private SimpleRabbitListenerContainerFactoryConfigurer factoryConfigurer;
//
//	/**
//	 * 单一消费者
//	 * @return
//	 */
//	@Bean(name = "singleListenerContainer")
//	public SimpleRabbitListenerContainerFactory listenerContainer(){
//		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//		factory.setConnectionFactory(connectionFactory);
//		factory.setMessageConverter(new Jackson2JsonMessageConverter());
//		factory.setConcurrentConsumers(1);
//		factory.setMaxConcurrentConsumers(1);
//		factory.setPrefetchCount(1);
//		factory.setTxSize(1);
//		factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
//		return factory;
//	}
//
//	/**
//	 * 多个消费者
//	 * @return
//	 */
//	@Bean(name = "multiListenerContainer")
//	public SimpleRabbitListenerContainerFactory multiListenerContainer(){
//		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//		factoryConfigurer.configure(factory,connectionFactory);
//		factory.setMessageConverter(new Jackson2JsonMessageConverter());
//		factory.setAcknowledgeMode(AcknowledgeMode.NONE);
////		factory.setConcurrentConsumers(env.getProperty("spring.rabbitmq.listener.concurrency",int.class));
////		factory.setMaxConcurrentConsumers(env.getProperty("spring.rabbitmq.listener.max-concurrency",int.class));
////		factory.setPrefetchCount(env.getProperty("spring.rabbitmq.listener.prefetch",int.class));
//		return factory;
//	}
//
//	@Bean
//	public RabbitTemplate rabbitTemplate(){
//		connectionFactory.setPublisherConfirms(true);
//		connectionFactory.setPublisherReturns(true);
//		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//		rabbitTemplate.setMandatory(true);
//		rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
//			@Override
//			public void confirm(CorrelationData correlationData, boolean ack, String cause) {
//				log.info("消息发送成功:correlationData({}),ack({}),cause({})",correlationData,ack,cause);
//			}
//		});
//		rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
//			@Override
//			public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
//				log.info("消息丢失:exchange({}),route({}),replyCode({}),replyText({}),message:{}",exchange,routingKey,replyCode,replyText,message);
//			}
//		});
//		return rabbitTemplate;
//	}

	/**
	 * 第二种 配置rabbitmq方案
	 */

		private final Logger logger = LoggerFactory.getLogger(this.getClass());

		@Value("${spring.rabbitmq.host}")
		private String host;

		@Value("${spring.rabbitmq.port}")
		private int port;

		@Value("${spring.rabbitmq.username}")
		private String username;

		@Value("${spring.rabbitmq.password}")
		private String password;


		public static final String EXCHANGE_A = "my-mq-exchange_A";
		public static final String EXCHANGE_B = "my-mq-exchange_B";
		public static final String EXCHANGE_C = "my-mq-exchange_C";


		public static final String QUEUE_A = "QUEUE_A";
		public static final String QUEUE_B = "QUEUE_B";
		public static final String QUEUE_C = "QUEUE_C";

		public static final String ROUTINGKEY_A = "spring-boot-routingKey_A";
		public static final String ROUTINGKEY_B = "spring-boot-routingKey_B";
		public static final String ROUTINGKEY_C = "spring-boot-routingKey_C";

		@Bean
		public ConnectionFactory connectionFactory() {
			CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host,port);
			connectionFactory.setUsername(username);
			connectionFactory.setPassword(password);
			connectionFactory.setVirtualHost("/");
			connectionFactory.setPublisherConfirms(true);
			return connectionFactory;
		}

		@Bean
		@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		//必须是prototype类型
		public RabbitTemplate rabbitTemplate() {
			RabbitTemplate template = new RabbitTemplate(connectionFactory());
			return template;
		}

	/**
	 * 针对消费者配置
	 * 1. 设置交换机类型
	 * 2. 将队列绑定到交换机
	 FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
	 HeadersExchange ：通过添加属性key-value匹配
	 DirectExchange:按照routingkey分发到指定队列
	 TopicExchange:多关键字匹配
	 */
	@Bean
	public DirectExchange defaultExchange() {
		return new DirectExchange(EXCHANGE_A);
	}

	/**
	 * 获取队列A
	 * @return
	 */
	@Bean
	public Queue queueA() {
		return new Queue(QUEUE_A, true); //队列持久
	}


	@Bean
	public Binding binding() {

		return BindingBuilder.bind(queueA()).to(defaultExchange()).with(RabbitmqConfig.ROUTINGKEY_A);
	}


}
