package pkgResources;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

public class GameEpoch {
    
    private ArrayList<GameLevel> levels;
    private ImageIcon mapTexture;
    private ImageIcon characterSkin;
    private Map<String, ImageIcon> towerSkins;

    public GameEpoch(ImageIcon a) {
        this.mapTexture = a;
    }
    
    public ImageIcon getMapTexture() {
        return this.mapTexture;
        
    }
}