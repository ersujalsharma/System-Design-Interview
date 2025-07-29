package Low_Level_Design.MachineCodingRound.Design_Logging_Framework.LoggingSystem;

public class ErrorLogger  extends Logger{
    public ErrorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int loglevel, String message) {
        // TODO Auto-generated method stub
        if(loglevel == ERROR){
            System.out.println("ERROR ----- "+ message);
        }
        else super.log(loglevel, message);
    }
}   
