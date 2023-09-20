package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@EnableJms
@Component
public class topicSubscriber {
    @Autowired
    private JmsTemplate jmsTemplate;


    @JmsListener(destination = "topic")
    public void receiveMsgTopicModel(String msg){
            System.out.println("从队列里面拿到的消息是"+msg);
    }
}
