package gameMechanics;

import java.util.ArrayList;

public class Map {
    
    private ArrayList<ArrayList<Tile>> tiles;
    
    public Map(int screenWidth, int screenHeigth) {
        Tile.setDimensions(screenWidth, screenHeigth);
        for(int i=0;i<=100;i++) {
            tiles.add(new ArrayList<Tile>());
            for(int j=0;j<=150;j++) {
                tiles.get(i).add(new Tile());
            }
        }
    }
    
}