package Low_Level_Design.MachineCodingRound.Design_Pub_Sub_System;

public class Subscriber {
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    public void onmessage(String message){
        System.out.println(this.name+" -> new Message is --> "+message);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
