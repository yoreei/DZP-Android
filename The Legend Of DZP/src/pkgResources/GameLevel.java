package pkgResources;

import gameMechanics.Tile;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

public class GameLevel {

    public static Map<GameLevel, String> levels;
    private ArrayList<ArrayList<Tile>> mapConfig;
    private ImageIcon mapImage;

    public GameLevel(URL mapImage, URL mapConfig) throws Exception {
        this.mapConfig = new ArrayList<>();
        BufferedReader readResource = new BufferedReader(new InputStreamReader((InputStream) mapConfig.getContent()));

        this.mapImage = new ImageIcon(mapImage);
        //System.out.println(this.mapImage.getIconHeight());
        this.mapImage = new ImageIcon(
                this.mapImage.getImage().getScaledInstance(
                this.mapImage.getIconWidth(),
                this.mapImage.getIconHeight(),
                Image.SCALE_SMOOTH));

        String line = readResource.readLine();
        //System.out.println(line);
        int x = Integer.parseInt(line.substring(0, line.indexOf(' ')));
        int y = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

        for (int i = 0; i <= y - 1; i++) {
            this.mapConfig.add(new ArrayList<Tile>());
            line = readResource.readLine();
            int begin = 0;
            for (int j = 0; j <= x - 1; j++) {

                int state = Integer.parseInt(line.substring(begin, begin + 1));
                this.mapConfig.get(i).add(new Tile(state));

            }
        }
    }

    public ImageIcon getMapImage() {
        return mapImage;
    }
}