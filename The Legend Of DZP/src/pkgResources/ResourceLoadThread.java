package pkgResources;

import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public class ResourceLoadThread extends Thread {

    private JProgressBar p;
    private ArrayList<GameEpoch> epoches;
    private ClassLoader cl;
    private BufferedReader resourceReader;
    private URL resourceURL;
    private int epochCount;
    private int levelCountPerEpoch;
    private final ImageIcon titleBackground;
    

    public ResourceLoadThread(JProgressBar p) throws Exception {
        
        cl = getClass().getClassLoader();
        
        System.out.println(FileNames.getPathTo(FileNames.backgroundImage));
        ImageIcon icon = new ImageIcon(cl.getResource(FileNames.getPathTo(FileNames.backgroundImage)));
        titleBackground = new ImageIcon(
                icon.getImage()
                .getScaledInstance(icon.getIconWidth(), icon.getIconHeight()-64, Image.SCALE_SMOOTH));
        epoches = new ArrayList<>();
        
        //System.out.println(titleBackground.getIconHeight());
        
        resourceURL = cl.getResource(FileNames.getPathTo(FileNames.fileIndex));
        resourceReader = new BufferedReader(
                new InputStreamReader(
                (BufferedInputStream) resourceURL.openStream()));

        String line = resourceReader.readLine();
        epochCount = Integer.parseInt(line);
        line = resourceReader.readLine();
        levelCountPerEpoch = Integer.parseInt(line);

        resourceReader.close();
        epoches.add(readEpoch(1));
        for (int i = 1; i <= epochCount; i++) {
        }
    }

    public CurrentGame createGame(int e, int l) throws IOException {
        System.out.println(epoches.size());
        return new CurrentGame(epoches.get(0), epoches.get(0).getLevel(0), null);
    }

    ///Read
    private GameEpoch readEpoch(int n) throws Exception {

        final String namePrefix =
                FileNames.root.getName()
                + FileNames.epoch.getName();

        ArrayList<Point> road;
        /*ArrayList<ArrayList<ImageIcon>> texture;
         for(int i=1;i<=levelCountPerEpoch;i++) {
            
         }*/
        ImageIcon tower, map;
        tower = new ImageIcon(cl.getResource(FileNames.getPathTo(1, FileNames.towerImage)));
        
        ArrayList<GameLevel> levels = new ArrayList<>();
        levels.add(readLevel(1, 1));
        
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

    public GameLevel getLevel(int n) {
        return null;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            try {
                //p.setValue(i / 100);
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ResourceLoadThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}