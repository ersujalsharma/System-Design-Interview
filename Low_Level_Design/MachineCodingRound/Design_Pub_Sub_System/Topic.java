package Low_Level_Design.MachineCodingRound.Design_Pub_Sub_System;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String name;
    private List<Subscriber> subscribers;
    private List<String> messages;
    public Topic(String name){
        this.name = name;
        subscribers = new ArrayList<>();
        messages = new ArrayList<>();
    }
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void addMessages(String message){
        messages.add(message);
    }
    public String getName() {
        return name;
    }
    public List<Subscriber> getSubscribers() {
        return subscribers;
    }
    public List<String> getMessages() {
        return messages;
    }
    
}
