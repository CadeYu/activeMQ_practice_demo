package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class messageService {

    @Autowired
   private JmsTemplate jmsTemplate;

    public  void sendMsg(String msg){
        jmsTemplate.convertAndSend("activeMqDemo1",msg);
    }

    @JmsListener(destination = "activeMqDemo1")//消费者监听队列
    public void receiveMsg(String msg){
        System.out.println("从队列里面拿到的消息是"+msg);
    }
}
