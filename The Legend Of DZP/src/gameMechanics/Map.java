package gameMechanics;

import gameInterface.Run;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Map {

    private static final int width = 21;
    private static final int height = 12;
    private BufferedImage mapImage;
    private ArrayList<ArrayList<Tile>> tiles;

    public Map(URL mapConfig) throws Exception {
        this.tiles = new ArrayList<>();
        
        BufferedReader readResource = new BufferedReader(new InputStreamReader((InputStream) mapConfig.getContent()));
        String line = readResource.readLine();
        int x = Integer.parseInt(line.substring(0, line.indexOf(' ')));
        int y = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
        System.out.println(x + " " + y);
        for (int i = 0; i <= y - 1; i++) {
            this.tiles.add(new ArrayList<Tile>());
            line = readResource.readLine();
            int begin = 0;
            for (int j = 0; j <= x - 1; j++) {

                int state = Integer.parseInt(line.substring(begin, begin + 1));
                System.out.println(i+ " " + j + " " + state);
                this.tiles.get(i).add(new Tile(state));
                begin += 2;

            }
        }
    }

    public Image getMapImage() throws Exception {
        int w = Run.ScreenSize.width;
        int h = Run.ScreenSize.height;
        double scale = 4 / 3;
        BufferedImage r = new BufferedImage(
                w,
                h,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = r.createGraphics();

        for (int i = 0; i <= tiles.size() - 1; i++) {

            for (int j = 0; j <= tiles.get(i).size() - 1; j++) {

                //System.out.println(i + " " + j + " " + tiles.get(i).get(j).getOccupator().toString());
                switch (tiles.get(i).get(j).getOccupator()) {
                    case ROAD:
                        g.setColor(Color.red);
                        break;

                    case MISC:
                        g.setColor(Color.green);
                        break;
                    case NEXUS:
                        g.setColor(Color.blue);
                }
                g.fillRect(j * Tile.size.width,
                        i * Tile.size.height,
                        Tile.size.width,
                        Tile.size.height);

            }
        }

        ImageIO.write(r, "png", new File("E:/test.png"));

        return r;
    }
}