package com.heshuzhuang.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Topic;

@Service
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;



    @Autowired
    private Topic topic;

    public void send(String msg) {
        jmsMessagingTemplate.convertAndSend(topic, msg);
    }

}