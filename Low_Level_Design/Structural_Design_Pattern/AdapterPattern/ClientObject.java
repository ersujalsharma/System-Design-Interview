package Low_Level_Design.Structural_Design_Pattern.AdapterPattern;

class ClientObject{
    String name;
    int number;
    String usercat;
    @Override
    public String toString() {
        return "ClientObject [name=" + name + ", number=" + number + ", usercat=" + usercat + "]";
    }
    
}