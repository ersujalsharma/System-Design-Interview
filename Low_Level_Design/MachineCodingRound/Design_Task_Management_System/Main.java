package Low_Level_Design.MachineCodingRound.Design_Task_Management_System;

public class Main {
    public static void main(String[] args) {
        User user = new User("Sujal");
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();
        System.out.println(taskManagementSystem.getList());
        Task task = new Task("Task1", "Creating task to test");
        taskManagementSystem.createTask(task); // Login First;
        taskManagementSystem.setUser(user);
        taskManagementSystem.createTask(task);
        taskManagementSystem.setUser(null);
        System.out.println(taskManagementSystem.getList());
        taskManagementSystem.addComments(task, new Comment("Comment1",user)); // Login First
        taskManagementSystem.setUser(user);
        taskManagementSystem.addComments(task, new Comment("Comment1",user));
        System.out.println(taskManagementSystem.getList());
    }
}
