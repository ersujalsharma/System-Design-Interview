package Low_Level_Design.Structural_Design_Pattern.AdapterPattern;
public class Client {
    public static void main(String[] args) {
        Database database = new Database();
        CustomObject obj = database.requestData();
        System.out.println(obj);
        ClientObject clientObject = Adapter.convertToClientObject(obj);
        System.out.println(clientObject);
    }
}
