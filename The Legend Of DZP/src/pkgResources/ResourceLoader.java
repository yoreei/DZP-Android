package pkgResources;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ResourceLoader {

    public static ArrayList<GameEpoch> epoches;
    private static ClassLoader cl;
    private static BufferedReader resourceReader;
    private static URL resourceURL;
    public static int epochCount;
    public static int levelCountPerEpoch;
    public static ImageIcon titleBackground;
    public static final Integer loaded;
    public static volatile int progress = 0;

    static {
        loaded = new Integer(0);
    }

    public static void load() throws Exception {

        cl = ResourceLoader.class.getClassLoader();
        resourceURL = cl.getResource(FileNames.getPathTo(FileNames.fileIndex));
        resourceReader = new BufferedReader(
                new InputStreamReader(
                (BufferedInputStream) resourceURL.openStream()));

        ImageIcon icon = new ImageIcon(cl.getResource(FileNames.getPathTo(FileNames.backgroundImage)));
        titleBackground = new ImageIcon(
                icon.getImage()
                .getScaledInstance(icon.getIconWidth(), icon.getIconHeight() - 64, Image.SCALE_SMOOTH));

        synchronized (loaded) {
            progress += 60;
            loaded.notifyAll();
        }

        epoches = new ArrayList();
        String line = resourceReader.readLine();
        File f = new File("E:/Anime and Manga/MMCE_Win32.zip");
        System.out.println(f.getParent());
        epochCount = Integer.parseInt(line);
        line = resourceReader.readLine();
        levelCountPerEpoch = Integer.parseInt(line);
        resourceReader.close();
        for (int i = 1; i <= epochCount; i++) {
            epoches.add(readEpoch(i));
            synchronized (loaded) {
                loaded.notifyAll();
                progress += 8;
            }
        }
    }

    public static CurrentGame createGame(int e, int l) throws IOException {

        return new CurrentGame(epoches.get(e), epoches.get(e).getLevel(l), null);/* Not finished */
    }

    ///Read
    private static GameEpoch readEpoch(int n) throws Exception {

        ImageIcon tower, map;
        tower = new ImageIcon(cl.getResource(FileNames.getPathTo(n, FileNames.towerImage)));

        ArrayList<GameLevel> levels = new ArrayList();

        for (int i = 1; i <= levelCountPerEpoch; i++) {
            levels.add(readLevel(i, n));
        }

        return new GameEpoch(tower, levels);

    }

    private static GameLevel readLevel(int n, int e) throws Exception {
        return new GameLevel(
                cl.getResource(FileNames.getPathTo(e, n, FileNames.mapImage)),
                cl.getResource(FileNames.getPathTo(e, n, FileNames.mapConfig)));
    }
}