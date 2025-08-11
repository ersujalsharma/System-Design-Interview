package Low_Level_Design.MachineCodingRound.Design_Pub_Sub_System;

public class PubSubSystem {

    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.addTopic("news");
        broker.addSubscriber("news", new Subscriber("Sujal"));
        broker.addSubscriber("news", new Subscriber("Deepak"));
        // publishing the message ; 
        broker.publishMessage("news", "money heist");
    }
}