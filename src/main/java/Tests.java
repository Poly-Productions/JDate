import JDate.JDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class Tests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tests.class);

    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;


    private static void testConstructors() {
        LOGGER.info("Testing Constructor JDate(String name);");
        try {
            new JDate("Testing Constructor JDate(String name);");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("Testing Constructor JDate(String name, int windowWidth, int windowHeight);");
        try {
            new JDate("Constructor JDate(String name, int windowWidth, int windowHeight);",WIDTH,HEIGHT);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("Testing Constructor JDate(String name, int windowWidth, int windowHeight, int exitOperation);");
        try {
            new JDate("Testing Constructor JDate(String name, int windowWidth, int windowHeight, int exitOperation);",WIDTH,HEIGHT, JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("Testing Constructor JDate(String name, int windowWidth, int windowHeight, int exitOperation, boolean isVisible);");
        try {
            new JDate("Testing Constructor JDate(String name, int windowWidth, int windowHeight, int exitOperation);",WIDTH,HEIGHT, JFrame.DISPOSE_ON_CLOSE,false);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

    }

    private static void testRun() {
        LOGGER.info("Testing jDate.runGame();");

        JDate testRun = new JDate("Testing jDate.runGame();",WIDTH,HEIGHT);

        try {
            testRun.runGame();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LOGGER.info("===Running Tests===");

        testConstructors();
        testRun();
    }

}
