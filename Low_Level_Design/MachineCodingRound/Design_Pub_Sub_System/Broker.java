package Low_Level_Design.MachineCodingRound.Design_Pub_Sub_System;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Broker {
    private Map<String,Topic> map;
    public Broker(){
        map = new HashMap<>();
    }
    public void publishMessage(String topicName,String message){
        map.get(topicName).addMessages(message);
        notifyToSubscribers(topicName, message);
    }
    void notifyToSubscribers(String topicName, String message){
        List<Subscriber> list = map.get(topicName).getSubscribers();
        for(Subscriber subscriber : list){
            subscriber.onmessage(message);
        }
    }
    public void addSubscriber(String topicName, Subscriber subscriber){
        map.putIfAbsent(topicName, new Topic(topicName));
        map.get(topicName).addSubscriber(subscriber);
    }
    public void addTopic(String topicName){
        if(map.get(topicName)!=null){
            System.out.println("ALREADY_EXIST");
        }
        Topic topic = new Topic(topicName);
        map.put(topicName,topic);
    }
}
