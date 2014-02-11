package pkgResources;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
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

    public ResourceLoadThread(JProgressBar p) throws IOException {
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

    private void readEpoch(int n)  {

        final String namePrefix = "res/epoch" + n + "/" + n + "level";
        
        ArrayList<Point> road;
        ArrayList<ArrayList<ImageIcon>> texture;
        for(int i=1;i<=levelCountPerEpoch;i++) {
            
            
        }
        
        
        
    }

    private void readLevel() {
    }

    public void setCurrentResources(Level l) {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            try {
                p.setValue(i / 100);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ResourceLoadThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}