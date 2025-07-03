package Low_Level_Design.Creational_Design_Pattern.SingletonPattern;

public class Singleton {
    // private constructor to prevent instantiation
    private Singleton() {}
    // static variable to hold the single instance
    private static Singleton instance;
    // we can instantiate here also for eager initialization
    // private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        if (instance == null) { // lazy initialization
            instance = new Singleton();
        }
        return instance;
    }
}
