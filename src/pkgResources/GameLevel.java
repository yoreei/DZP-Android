package pkgResources;

import java.awt.Image;
import java.net.URL;
import java.util.Map;
import javax.swing.ImageIcon;

public class GameLevel {

    public static Map<GameLevel, String> levels;
    private final ImageIcon mapImage;
    private final com.dzp.game.mechanics.Map mapConfig;

    public GameLevel(URL mapImage, URL mapConfig) throws Exception {
        
        this.mapConfig = new com.dzp.game.mechanics.Map(mapConfig);
        
        ImageIcon m = new ImageIcon(mapImage);
        this.mapImage = new ImageIcon(
                m.getImage().getScaledInstance(
                m.getIconWidth(),
                m.getIconHeight(),
                Image.SCALE_SMOOTH));

        
    }

    public com.dzp.game.mechanics.Map getMap () {
        return this.mapConfig;
    }
    
    public ImageIcon getMapImage() {
        return mapImage;
    }
}