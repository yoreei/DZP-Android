package pkgResources;

import gameMechanics.Tile;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

public class GameLevel {
    
    public static Map<GameLevel, String> levels;
    
    private ArrayList<ArrayList<ImageIcon>> mapTexture;
    private ArrayList<Tile> roads;
    
    public GameLevel (File levelFile) {
        
    }
    
}