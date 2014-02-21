package gameMechanics;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;

public class Tile {

   
    private Object occupator;
    private ImageIcon area;
    private boolean solid;
    private Point mapCoordinates;
    private static Dimension size;
    
    static { 
        size = new Dimension();
    }
    
    public static void setDimensions(int w, int h) {
        size.setSize(w, h);
    }
    
    public Tile(ImageIcon area) {
        setOccupator(null);
        setArea(area);
    }
    
    public static Dimension getDimension() {
        return size;
    }
    
    public ImageIcon getArea() {
        return this.area;
    }
    
    ///Set parameters
    private void setOccupator(Object o) {
        this.occupator = o;
        if(o!=null) {
            this.solid = true;
        }
    }
    private void setArea(ImageIcon area) {
        this.area = area;
    }
    
}