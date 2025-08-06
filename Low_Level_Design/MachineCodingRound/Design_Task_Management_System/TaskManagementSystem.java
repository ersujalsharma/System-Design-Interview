package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

import java.util.ArrayList;
import java.util.List;

public class TaskManagementSystem {
    private List<Task> taskList;
    private User user;
    public TaskManagementSystem(){
        taskList = new ArrayList<>();
    }
    public void createTask(Task task){
        // if user is loogedIn
        if(user!=null){
            if(taskList == null){
                taskList = new ArrayList<>();
            }
            taskList.add(task);
            System.out.println("Task Added Successfully....");
        }
        else System.out.println("Login first");
    }
    public void deleteTask(Task task){
        if(user!=null){
            for(Task t : taskList){
                if(t == task){ 
                    taskList.remove(t);
                    break;
                }
            }
        }
        else System.out.println("Login first");
    }
    public void updateTask(Task task,Task updatedTask){
        if(user!=null){
            for(Task t : taskList){
                if(t == task){ 
                    taskList.remove(t);
                    break;
                }
            }
            taskList.add(updatedTask);
        }
        else System.out.println("Login first");
    }
    public void assignTask(Task task,User assignee){
        if(user!=null){
            task.setAssignedUser(assignee);
        }
        else System.out.println("Login first");
    }
    public void changeStatus(Task task,Status status){
        if(user!=null){
            task.setStatus(status);
        }
        else System.out.println("Login first");
    }
    public void addComments(Task task,Comment comment){
        if(user!=null){
            task.addComments(comment);
            System.out.println("Comment added successfully");
        }
        else System.out.println("Login first");
    }
    public List<Task> getList(){
        return taskList;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
