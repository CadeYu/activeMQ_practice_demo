package com.example.demo.controller;

import com.example.demo.service.messageService;
import com.example.demo.service.topicPublisher;
import com.example.demo.service.topicSubscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class controller {
    @Autowired
    private messageService messageService;

    @Autowired
    private topicPublisher topicPublisher;

    @Autowired
    private topicSubscriber topicSubscriber;

    @PostMapping("/send")
    public void sendMsg() {
        messageService.sendMsg("hello,world");
    }






    @PostMapping("/sendTopic")
    public void sendMsgTopic() {
        topicPublisher.sendMsgTopicModel("hello,world,but topic version");
    }
}
