package Low_Level_Design.Creational_Design_Pattern.SingletonPattern;

public class SingletonMultiThreading {
    private static SingletonMultiThreading instance;
    // to make thread-safe we can early initialize the instance
    // private static final SingletonMultiThreading instance = new SingletonMultiThreading();
    private SingletonMultiThreading() {
        // private constructor to prevent instantiation
    }
    public static SingletonMultiThreading getInstance() {
        if(instance == null) {
            synchronized (SingletonMultiThreading.class) {
                if(instance == null) { // double-checked locking
                    instance = new SingletonMultiThreading();
                }
            }
        }
        return instance;
    }
}
