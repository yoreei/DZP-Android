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
    private static final String root = "res/";
    
    private BufferedImage titleBackground;
    
    
    
    public ResourceLoadThread(JProgressBar p) throws IOException, InterruptedException {
        //this.p = p;

        epoches = new ArrayList<>();
        //Load
        cl = getClass().getClassLoader();
        resourceURL = cl.getResource(root + "fileindex");
        resourceReader = new BufferedReader(
                new InputStreamReader(
                (BufferedInputStream) resourceURL.openStream()));
        
        String line = resourceReader.readLine();
        epochCount = Integer.parseInt(line);
        line = resourceReader.readLine();
        levelCountPerEpoch = Integer.parseInt(line);

        resourceReader.close();
        readEpoch(1);
        
        for (int i = 1; i <= epochCount; i++) {
            
        }
    }
    
    public CurrentGame createGame(int e, int l) {
        return new CurrentGame(epoches.get(0), null, null);
    }
    
    ///Read
    private void readEpoch(int n) throws IOException  {

        final String namePrefix = root + "epoch" + n + "/" + n + "level";
        
        ArrayList<Point> road;
        /*ArrayList<ArrayList<ImageIcon>> texture;
        for(int i=1;i<=levelCountPerEpoch;i++) {
            
        }*/
        
        epoches.add(0,
                new GameEpoch(
                new ImageIcon(cl.getResource(root + "epoch" + 1 + "/textureTower.png"))));
        
    }

    private void readLevel() {
    }
    
    ///Set
    public void setCurrentResources(Level l) {
    }

    
    ///Get
    public Image getTitleBackground() {
        ImageIcon ret = new ImageIcon(cl.getResource(root+"titleBackground.png"));
        return ret.getImage();
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