package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

public class Activity {
    private int activityId;
    private String activityDesc;
    private User user;
    private long timeStamp;
    private static int activityCounter = 0;
    public Activity(String activityDesc, User user) {
        this.activityId = activityCounter++;
        this.activityDesc = activityDesc;
        this.user = user;
        this.timeStamp = System.currentTimeMillis();
    }
    public int getActivityId() {
        return activityId;
    }   
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }
    public String getActivityDesc() {
        return activityDesc;
    }
    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    @Override
    public String toString() {
        return "Activity [activityId=" + activityId + ", activityDesc=" + activityDesc + ", user=" + user + ", timeStamp=" + timeStamp + "]";
    }
}
