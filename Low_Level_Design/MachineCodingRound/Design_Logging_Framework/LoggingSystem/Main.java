package Low_Level_Design.MachineCodingRound.Design_Logging_Framework.LoggingSystem;

public class Main {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new WarnLogger(new ErrorLogger(null)));
        logger.log(Logger.INFO, "This is just for information");
        logger.log(Logger.WARN, "This is to warn");
        logger.log(Logger.ERROR, "Error need to be solved.");
    }
}
