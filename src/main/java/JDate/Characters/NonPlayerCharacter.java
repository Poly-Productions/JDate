// JDate NonPlayerCharacter Class
// @Auth v0ncent
package JDate.Characters;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class NonPlayerCharacter extends Character {
    private final Image defaultPose;

    public final HashMap<String,Image> poses;

    public NonPlayerCharacter(String name,Image defaultPose, HashMap<String, Image> poses) {
        this(name,null,defaultPose,poses);
    }

    public NonPlayerCharacter(String name, ArrayList<String> aliases, Image defaultPose, HashMap<String, Image> poses) {
        super(name, aliases);
        this.defaultPose = defaultPose;
        this.poses = Objects.requireNonNullElseGet(poses, HashMap::new);
    }

    // getters / setters
    public Image getDefaultPose() {
        return this.defaultPose;
    }
    public HashMap<String, Image> getPoses() {
        return this.poses;
    }
}
