package Low_Level_Design.MachineCodingRound.Design_Logging_Framework.LoggingSystem;

public class InfoLogger extends Logger{
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int loglevel, String message) {
        // TODO Auto-generated method stub
        if(loglevel == INFO){
            System.out.println("INFO ----- "+ message);
        }
        else super.log(loglevel, message);
    }
}
