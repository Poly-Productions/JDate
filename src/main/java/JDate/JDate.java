// JDate Main Class
// @Auth v0ncent
package JDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class JDate {
    /** Instance of logger for JDate class*/
    private static final Logger LOGGER = LoggerFactory.getLogger(JDate.class);

    private final String name;

    private final int exitOperation;

    public JDate(String name) {
        this(name,JFrame.EXIT_ON_CLOSE);
    }

    public JDate(String name, int exitOperation) {
        this.name = name;
        this.exitOperation = exitOperation;

        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(exitOperation);
    }

    public void runGame() {
        LOGGER.info(
                "\n     _____       __     \n" +
                        " __ / / _ \\___ _/ /____ \n" +
                        "/ // / // / _ `/ __/ -_)\n" +
                        "\\___/____/\\_,_/\\__/\\__/ \n" +
                        "                        "
        );



    }

    // -GETTERS / SETTERS-
    public String getName() {
        return this.name;
    }

    public int getExitOperation() {
        return this.exitOperation;
    }

}
