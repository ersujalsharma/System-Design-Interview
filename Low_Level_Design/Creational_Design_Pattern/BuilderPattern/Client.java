package Low_Level_Design.Creational_Design_Pattern.BuilderPattern;

import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder.EngineeringStudentBuilder;
import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Student.EngineeringStudent;

public class Client {
    public static void main(String[] args) {
        // Create a builder for an Engineering Student
        EngineeringStudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();
        
        // Set the name and student type
        engineeringStudentBuilder.setName("John Doe").setStudentType();
        
        // Build the Engineering Student object
        EngineeringStudent engineeringStudent = engineeringStudentBuilder.build();
        
        // Print the details of the Engineering Student
        System.out.println(engineeringStudent);
        Director director = new Director(engineeringStudentBuilder);
        EngineeringStudent engineeringStudent1 = (EngineeringStudent) director.construct();
        System.out.println(engineeringStudent1);
    }
}
