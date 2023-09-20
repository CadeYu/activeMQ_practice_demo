package com.example.demo.service;

import jdk.nashorn.internal.runtime.JSErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class topicPublisher {
    @Autowired
    private JmsTemplate jmsTemplate;


    public void sendMsgTopicModel(String msg){
        jmsTemplate.convertAndSend("topic",msg);

    }
}
