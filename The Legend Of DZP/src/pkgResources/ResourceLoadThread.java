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
    
    private BufferedImage titleBackground;
    
    
    
    public ResourceLoadThread(JProgressBar p) throws IOException, InterruptedException {
        //this.p = p;


        //Load
        cl = getClass().getClassLoader();
        resourceURL = cl.getResource("res/fileindex");
        resourceReader = new BufferedReader(
                new InputStreamReader(
                (BufferedInputStream) resourceURL.openStream()));
        
        String line = resourceReader.readLine();
        epochCount = Integer.parseInt(line);
        line = resourceReader.readLine();
        levelCountPerEpoch = Integer.parseInt(line);

        resourceReader.close();
        
        for (int i = 1; i <= epochCount; i++) {
            
        }
    }

    ///Read
    private void readEpoch(int n)  {

        final String namePrefix = "res/epoch" + n + "/" + n + "level";
        
        ArrayList<Point> road;
        ArrayList<ArrayList<ImageIcon>> texture;
        for(int i=1;i<=levelCountPerEpoch;i++) {
            
            
        }
        
        
        
    }

    private void readLevel() {
    }
    
    ///Set
    public void setCurrentResources(Level l) {
    }

    
    ///Get
    public Image getTitleBackground() {
        System.out.println("wat");
        ImageIcon ret = new ImageIcon(cl.getResource("res/titleBackground.png"));
        System.out.println(ret);
        return ret.getImage();
    }
    
    public GameEpoch getEpoch(int n) {
        return null;
        
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
            System.out.println("ASD");
        }
    }
}