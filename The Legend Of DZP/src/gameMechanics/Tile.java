package gameMechanics;

import java.awt.image.BufferedImage;

public class Tile {
    
    private static BufferedImage screenArea;
    private Object occupator;
    private boolean solid;
    
    public static void setScreenArea(int w, int h) {
        screenArea.setData(null);
    }
}