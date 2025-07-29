package Low_Level_Design.MachineCodingRound.Design_Logging_Framework.LoggingSystem;

public class Logger {

    public static final int INFO = 1;
    public static final int WARN = 2;
    public static final int ERROR = 3;
    public Logger nextLogger;
    public Logger(Logger logger){
        this.nextLogger = logger;
    }
    public void log(int loglevel,String message){
        if(nextLogger!=null)
            nextLogger.log(loglevel, message);
    } 
}