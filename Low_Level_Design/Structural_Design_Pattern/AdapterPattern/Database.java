package Low_Level_Design.Structural_Design_Pattern.AdapterPattern;
public class Database {
    public CustomObject requestData(){
        CustomObject customObject = new CustomObject();
        customObject.name = "Sujal Sharma";
        customObject.number = 123456;
        return customObject;
    }
}
