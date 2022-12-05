package com.singh.nv.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<topic> getAllTopics()
    {

        return Arrays.asList( new topic("1","nisha1","springBoot1"),
                new topic("2","nisha2","springBoot2"),
                new topic("3","nisha3","springBoot3"));
    }
}
