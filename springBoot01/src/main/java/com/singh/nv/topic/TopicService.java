package com.singh.nv.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<topic> topics = new ArrayList<>(Arrays.asList( new topic("1","nisha1","springBoot1"),
                new topic("2","nisha2","springBoot2"),
                new topic("3","nisha3","springBoot3")));

   public List<topic> getAllTopics()
   {
       return topics;
   }
    public topic getTopic(String id)
    {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(topic topic, String id) {
       for (int i=0; i< topics.size(); i++)
       {
           topic t = topics.get(i);
           if(t.getId().equals(id))
           {
               topics.set(i,topic);
               return;
           }
       }

    }

    public void deleteTopic(String id) {
       topics.removeIf(t -> t.getId().equals(id));
    }
}
