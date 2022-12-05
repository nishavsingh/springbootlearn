package com.singh.nv.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/topics/{id}")
    public topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody topic topic)
    {
        topicService.addTopic(topic);
    }
}
