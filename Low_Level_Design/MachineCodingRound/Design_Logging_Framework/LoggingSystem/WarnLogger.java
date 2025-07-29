package Low_Level_Design.MachineCodingRound.Design_Logging_Framework.LoggingSystem;

public class WarnLogger extends Logger{
    public WarnLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int loglevel, String message) {
        // TODO Auto-generated method stub
        if(loglevel == WARN){
            System.out.println("WARN ----- "+ message);
        }
        else super.log(loglevel, message);
    }
}
