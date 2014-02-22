package gameMechanics;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Map {

    private static final int width = 21;
    private static final int height = 12;
    private BufferedImage mapImage;
    private ArrayList<ArrayList<Tile>> tiles;

    public Map(ArrayList<ArrayList<Tile>> tiles) throws Exception {

        
        this.tiles = tiles;
    }

    public Image getMapImage() {
        /*int w = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = Toolkit.getDefaultToolkit().getScreenSize().height;
        double scale = 4/3;
        BufferedImage r = new BufferedImage(
                w, 
                h,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = r.createGraphics();
        g.scale(scale, scale);
        g.drawImage(mapImage, 0, 0, null);
        System.out.println(mapImage.getWidth());
        return r;*/
        return mapImage.getScaledInstance(1366, 768, BufferedImage.SCALE_FAST);
        

    }
}