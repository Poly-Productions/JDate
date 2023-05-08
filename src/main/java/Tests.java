import JDate.JDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tests.class);

    private static void testConstructors() {
        LOGGER.info("Testing Constructor JDate(String name, int windowWidth, int windowHeight);");

        try {
            new JDate("Constructor JDate(String name, int windowWidth, int windowHeight);");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

    }

    private static void testRun() {
        LOGGER.info("Testing jDate.runGame();");

        JDate testRun = new JDate("Testing jDate.runGame();");

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
