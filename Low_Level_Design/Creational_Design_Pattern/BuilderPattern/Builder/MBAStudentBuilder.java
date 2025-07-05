package Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder;

import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Student.MBAStudent;

public class MBAStudentBuilder extends StudentBuilder {

    public MBAStudentBuilder() {
    }

    @Override
    public Object build() {
        return new MBAStudent(this);
    }

    @Override
    public String getStudentType() {
        return "MBA Student";
    }

    @Override
    public StudentBuilder setStudentType() {
        // TODO Auto-generated method stub
        this.studentType = "MBA Student";
        return this;
    }
    
}
