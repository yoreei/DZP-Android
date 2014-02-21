package gameMechanics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Map {

    private static final int width = 180;
    private static final int height = 120;
    private BufferedImage mapImage;
    private ArrayList<ArrayList<Tile>> tiles;

    public Map(pkgResources.GameEpoch epoch, int screenWidth, int screenHeigth) {
        
        Tile.setDimensions(64, 64);
        mapImage = new BufferedImage(
                Tile.getDimension().width*100,
                Tile.getDimension().height*100, 
                BufferedImage.TYPE_INT_RGB);
        tiles = new ArrayList<>();
        
        for (int i = 0; i <= height; i++) {
            tiles.add(new ArrayList<Tile>());
            for (int j = 0; j <= width; j++) {
                System.out.println(height + " " + width);
                tiles.get(i).add(new Tile(epoch.getMapTexture()));
                mapImage.getGraphics().drawImage(tiles.get(i).get(j).getArea().getImage()
                        , Tile.getDimension().height*i
                        , Tile.getDimension().width*j
                        , null);
                //System.out.println(mapImage);
            }
        }
    }

    public Image getMapImage() {

        return this.mapImage.getScaledInstance(
                this.mapImage.getWidth(),
                this.mapImage.getHeight(),
                BufferedImage.SCALE_DEFAULT);

    }
}