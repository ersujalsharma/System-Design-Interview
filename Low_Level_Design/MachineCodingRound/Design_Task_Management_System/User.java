package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

public class User {
    static int userCounter = 0;
    private int Userid;
    private String username;
    @Override
    public String toString() {
        return "User [Userid=" + Userid + ", username=" + username + "]";
    }
    public int getUserid() {
        return Userid;
    }
    public void setUserid(int userid) {
        Userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public User(String username) {
        this.Userid = userCounter++;
        this.username = username;
    }
    
}
