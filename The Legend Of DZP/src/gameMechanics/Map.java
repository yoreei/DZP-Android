package gameMechanics;

import java.util.ArrayList;

public class Map {
    
    private static final int width = 180;
    private static final int heigth = 120;
    
    
    private ArrayList<ArrayList<Tile>> tiles;
    
    public Map(int screenWidth, int screenHeigth) {
        Tile.setDimensions(screenWidth, screenHeigth);
        for(int i=0;i<=heigth;i++) {
            tiles.add(new ArrayList<Tile>());
            for(int j=0;j<=width;j++) {
                //tiles.get(i).add(new Tile());
            }
        }
    }
    
}