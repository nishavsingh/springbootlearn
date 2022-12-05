package com.singh.nv.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics1")
    public topic getAllTopics1()
    {

        return ( new topic("1","nisha1","springBoot1"));
    }
}
