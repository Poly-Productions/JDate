// JDate Main Class
// @Auth v0ncent
package JDate;

import JDate.Characters.Character;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JDate {
    /** Instance of logger for JDate class*/
    private static final Logger LOGGER = LoggerFactory.getLogger(JDate.class);

    /** Name of JFrame window */
    private final String name;
    /** Exit operation of JFrame Window */
    private final int exitOperation;
    /** Width of JFrame Window */
    private final double width;
    /** Height of JFrame Window */
    private final double height;
    /** Width of user's primary screen */
    private final double userScreenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    /** Height of user's primary screen */
    private final double userScreenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    /** If the JFrame window is visible or not */
    private boolean isVisible;

    /**List of all game characters*/
    private final ArrayList<Character> characters = new ArrayList<>();

    /**
     * Creates a JDate object called the given title.
     * Defaults JFrame window to user Screen size.
     * @param name Name of window.
     */
    public JDate(String name) {
        this(name,Toolkit.getDefaultToolkit().getScreenSize().getWidth(), Toolkit.getDefaultToolkit().getScreenSize().getHeight(),JFrame.EXIT_ON_CLOSE,true);
    }

    /**
     * Creates a JDate Object called the given title, and sets the JFrame window to the passed
     * Width and Height.
     * @param name Name of JDate Object.
     * @param width Width of JFrame Window.
     * @param height Height of JFrame Window.
     */
    public JDate(String name, double width, double height) {
        this(name, width, height, JFrame.EXIT_ON_CLOSE);
    }

    public JDate(String name, double width, double height, int exitOperation) {
        this(name,width,height,exitOperation,true);
    }

    public JDate(String name, double width, double height, int exitOperation, boolean isVisible) {
        this.name = name;
        this.exitOperation = exitOperation;
        this.width = width;
        this.height = height;
        this.isVisible = isVisible;

        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(exitOperation);
        frame.setSize((int) width,(int) height);
        frame.setVisible(isVisible);
    }

    public void runGame() {
        LOGGER.info(
                "\n     _____       __     \n" +
                        " __ / / _ \\___ _/ /____ \n" +
                        "/ // / // / _ `/ __/ -_)\n" +
                        "\\___/____/\\_,_/\\__/\\__/ \n" +
                        "                        "
        );

        if (characters.isEmpty()) {
            LOGGER.warn("Warning there are no characters!");
        }

    }

    public void addCharacter(Character... character) {
        characters.addAll(Arrays.asList(character));
    }

    // -GETTERS / SETTERS-
    public String getName() {
        return this.name;
    }
    public int getExitOperation() {
        return this.exitOperation;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public boolean isVisible() {
        return this.isVisible;
    }
    public double getUserScreenWidth() {
        return this.userScreenWidth;
    }
    public double getGetUserScreenHeight() {
        return this.userScreenHeight;
    }
    public ArrayList<Character> getCharacters() {
        return this.characters;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
}
