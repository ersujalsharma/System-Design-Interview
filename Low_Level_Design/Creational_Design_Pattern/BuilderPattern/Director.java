package Low_Level_Design.Creational_Design_Pattern.BuilderPattern;

import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Object construct() {
        return studentBuilder.build();
    }
}
