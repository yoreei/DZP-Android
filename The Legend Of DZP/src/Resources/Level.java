package resources;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Level {
    
    private ArrayList<ArrayList<BufferedImage>> mapTexture;
    private ArrayList<Point> roads;
    
    public Level (ArrayList<Point> roads, ArrayList<ArrayList<BufferedImage>> mapTexture) {
        this.roads = roads;
        this.mapTexture = mapTexture;
    }
    
}