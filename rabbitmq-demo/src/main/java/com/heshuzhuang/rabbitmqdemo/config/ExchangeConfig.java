package com.heshuzhuang.rabbitmqdemo.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消息交换机配置  可以配置多个
 * @author zhuzhe
 * @date 2018/5/25 15:40
 * @email 1529949535@qq.com
 */
@Configuration
public class ExchangeConfig {

    /**
     *   1.定义direct exchange，绑定queueTest
     *   2.durable="true" rabbitmq重启的时候不需要创建新的交换机
     *   3.direct交换器相对来说比较简单，匹配规则为：如果路由键匹配，消息就被投送到相关的队列
     *     fanout交换器中没有路由键的概念，他会把消息发送到所有绑定在此交换器上面的队列中。
     *     topic交换器你采用模糊匹配路由键的原则进行转发消息到队列中 在topic中  可对key进行特殊类似模糊匹配的功能来实现，ps: aaa.*  匹配  aaa.ha
     *                                                                                                                 aaa.#  匹配  aaa.sss.sa
     *
     *   在取消匹配测试时发现队列2 还是能接受消息  需要查看已经绑定的队列是否存在相同名称的两个，且匹配规则不一致
     */
    @Bean
    public DirectExchange directExchange(){
        DirectExchange directExchange = new DirectExchange(RabbitmqConfig.EXCHANGE,true,false);
        return directExchange;
    }


    /**
     * fanout交换器中没有路由键的概念，他会把消息发送到所有绑定在此交换器上面的队列中。
     * 所有绑定在   这个 交换机的队列都会受到信息
     * @return
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        FanoutExchange fanoutExchange = new FanoutExchange("交换机的名字",true,false);
        return fanoutExchange;
    }

    /**
     * topic 交换
     * @return
     */
    @Bean
    public TopicExchange topicExchange(){
        TopicExchange topicExchange = new TopicExchange("topicExchange");
        return topicExchange;
    }



}
