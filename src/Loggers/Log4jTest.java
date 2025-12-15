package Loggers;


import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;


public class Log4jTest {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(Log4jTest.class);

    public static void operation() {
        log.info("Running the service ....");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.warn("Service is Trying to connect...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.error("Something went wrong .. ");
    }

    static void main() {
        operation();
    }
}
