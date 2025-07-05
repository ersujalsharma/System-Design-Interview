package Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Builder;

import Low_Level_Design.Creational_Design_Pattern.BuilderPattern.Student.EngineeringStudent;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public EngineeringStudent build() {
        return new EngineeringStudent(this);
    }

    @Override
    public String getStudentType() {
        return this.studentType;
    }

    @Override
    public StudentBuilder setStudentType() {
        // TODO Auto-generated method stub
        this.studentType = "Engineering Student";
        return this;
    }
    
}
