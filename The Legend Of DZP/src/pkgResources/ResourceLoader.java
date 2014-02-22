package pkgResources;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.ImageIcon;

public class ResourceLoader {

    private ArrayList<GameEpoch> epoches;
    private ClassLoader cl;
    private BufferedReader resourceReader;
    private URL resourceURL;
    private int epochCount;
    private int levelCountPerEpoch;
    private final ImageIcon titleBackground;

    public ResourceLoader() throws Exception {

        cl = getClass().getClassLoader();
        resourceURL = cl.getResource(FileNames.getPathTo(FileNames.fileIndex));
        resourceReader = new BufferedReader(
                new InputStreamReader(
                (BufferedInputStream) resourceURL.openStream()));

        ImageIcon icon = new ImageIcon(cl.getResource(FileNames.getPathTo(FileNames.backgroundImage)));
        titleBackground = new ImageIcon(
                icon.getImage()
                .getScaledInstance(icon.getIconWidth(), icon.getIconHeight() - 64, Image.SCALE_SMOOTH));


        epoches = new ArrayList<>();

        String line = resourceReader.readLine();
        epochCount = Integer.parseInt(line);
        
        line = resourceReader.readLine();
        levelCountPerEpoch = Integer.parseInt(line);
        resourceReader.close();
        
        for (int i = 1; i <= epochCount; i++) {
            epoches.add(readEpoch(i));
        }
    }

    public CurrentGame createGame(int e, int l) throws IOException {
        
        return new CurrentGame(epoches.get(e), epoches.get(e).getLevel(l), null);/* Not finished */
    }

    ///Read
    private GameEpoch readEpoch(int n) throws Exception {

        ImageIcon tower, map;
        tower = new ImageIcon(cl.getResource(FileNames.getPathTo(n, FileNames.towerImage)));

        ArrayList<GameLevel> levels = new ArrayList<>();
        
        for(int i=1;i<=levelCountPerEpoch;i++) {
            levels.add(readLevel(i, n));
        }

        return new GameEpoch(tower, levels);

    }

    private GameLevel readLevel(int n, int e) throws Exception {
        return new GameLevel(
                cl.getResource(FileNames.getPathTo(e, n, FileNames.mapImage)),
                cl.getResource(FileNames.getPathTo(e, n, FileNames.mapConfig)));
    }

    ///Set
    public void setCurrentResources(Level l) {
    }

    ///Get
    public Image getTitleBackground() {
        return this.titleBackground.getImage();
    }

    public GameEpoch getEpoch(int n) {
        return epoches.get(n);

    }
}