package Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder;

import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Student.Student;

public abstract class StudentBuilder{

    private String name;
    public String studentType;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public abstract StudentBuilder setStudentType();

    public String getName() {
        return name;
    }

    public String getStudentType() {
        return studentType;
    }

    public Object build() {
        // TODO Auto-generated method stub
        return new Student(this);
    }
}
