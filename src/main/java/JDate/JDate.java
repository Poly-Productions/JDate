// JDate Main Class
// @Auth v0ncent
package JDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class JDate {
    /** Instance of logger for JDate class*/
    private static final Logger LOGGER = LoggerFactory.getLogger(JDate.class);

    /** Name of JFrame window */
    private final String name;
    /** Exit operation of JFrame Window */
    private final int exitOperation;
    /** Width of JFrame Window */
    private final int width;
    /** Height of JFrame Window */
    private final int height;

    public JDate(String name, int width, int height) {
        this(name, width, height, JFrame.EXIT_ON_CLOSE);
    }

    public JDate(String name, int width, int height, int exitOperation) {
        this.name = name;
        this.exitOperation = exitOperation;
        this.width = width;
        this.height = height;

        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(exitOperation);
        frame.setSize(width,height);
        frame.setVisible(true);
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
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
}
