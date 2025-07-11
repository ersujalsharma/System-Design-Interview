package Low_Level_Design.Structural_Design_Pattern.AdapterPattern;

public class Adapter {
    public static ClientObject convertToClientObject(CustomObject customObject){
        ClientObject clientObject = new ClientObject();
        clientObject.name = customObject.name;
        clientObject.number = customObject.number;
        clientObject.usercat = "Developer";
        return clientObject;
    }
}
