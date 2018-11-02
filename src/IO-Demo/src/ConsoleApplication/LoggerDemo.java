package ConsoleApplication;


import org.apache.log4j.*;

public class LoggerDemo {
    static Logger log = Logger.getLogger(LoggerDemo.class);

    public static void main(String[] args) {

        log.info(" Information Message");
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Exception occured", new RuntimeException("Dummy"));
    }
}
