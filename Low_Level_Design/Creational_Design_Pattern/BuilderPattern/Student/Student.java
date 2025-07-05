package Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Student;


import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder.StudentBuilder;

public class Student {
    private String name;
    private String studentType;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.studentType = studentBuilder.getStudentType();
    }

    public String getName() {
        return name;
    }

    public String getStudentType() {
        return studentType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentType='" + studentType + '\'' +
                '}';
    }
}
