package pkgResources;

import java.awt.Image;
import java.net.URL;
import java.util.Map;
import javax.swing.ImageIcon;

public class GameLevel {

    public static Map<GameLevel, String> levels;
    private final ImageIcon mapImage;
    private final gameMechanics.Map mapConfig;

    public GameLevel(URL mapImage, URL mapConfig) throws Exception {
        
        this.mapConfig = new gameMechanics.Map(mapConfig);
        
        ImageIcon m = new ImageIcon(mapImage);
        this.mapImage = new ImageIcon(
                m.getImage().getScaledInstance(
                m.getIconWidth(),
                m.getIconHeight(),
                Image.SCALE_SMOOTH));

        
    }

    public gameMechanics.Map getMap () {
        return this.mapConfig;
    }
    
    public ImageIcon getMapImage() {
        return mapImage;
    }
}