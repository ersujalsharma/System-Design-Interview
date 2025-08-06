package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String title;
    private String description;
    private Priority priority;
    private Status status;
    private List<Comment> comments;
    private User assignedUser;
    private List<Activity> activities;
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public void addComments(Comment comment){
        if(comments==null){
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    public User getAssignedUser() {
        return assignedUser;
    }
    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
    @Override
    public String toString() {
        return "Task [title=" + title + ", description=" + description + ", priority=" + priority + ", status=" + status
                + ", comments=" + comments + ", assignedUser=" + assignedUser + "]";
    }
    public List<Activity> getActivities() {
        return activities;
    }
    public void addActivity(Activity activity) {
        if (activities == null) {
            activities = new ArrayList<>();
        }
        activities.add(activity);
    }
}
