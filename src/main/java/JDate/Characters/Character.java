// JDate Character Class
// @Auth v0ncent
package JDate.Characters;

import java.util.ArrayList;
import java.util.Objects;

public class Character {
    private final String name;

    public final ArrayList<String> aliases;

    public Character(String name) {
        this(name, null);
    }

    public Character(String name, ArrayList<String> aliases) {
        this.name = name;
        this.aliases = Objects.requireNonNullElseGet(aliases, ArrayList::new);
    }

    // Getters / Setters
    public String getName() {
        return this.name;
    }
    public ArrayList<String> getAliases() {
        return this.aliases;
    }
}
