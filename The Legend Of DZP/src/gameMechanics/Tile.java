package gameMechanics;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class Tile {
    
    private Object occupator;
    private BufferedImage area;
    private boolean solid;
    private static Dimension size;
    
    public static void setDimensions(int w, int h) {
        size.setSize(w, h);
    }
    
    public Tile(BufferedImage area) {
        setOccupator(null);
        setArea(area);
    }
    
    ///Set parameters
    private void setOccupator(Object o) {
        this.occupator = o;
        if(o!=null) {
            this.solid = true;
        }
    }
    private void setArea(BufferedImage area) {
        this.area = area;
    }
    
}