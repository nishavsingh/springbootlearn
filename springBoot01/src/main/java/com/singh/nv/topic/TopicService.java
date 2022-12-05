package com.singh.nv.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<topic> topics = Arrays.asList( new topic("1","nisha1","springBoot1"),
                new topic("2","nisha2","springBoot2"),
                new topic("3","nisha3","springBoot3"));

   public List<topic> getAllTopics()
   {
       return topics;
   }
}
