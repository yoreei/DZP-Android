package pkgResources;

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
import javax.swing.JProgressBar;

public class ResourceLoadThread extends Thread {

    private JProgressBar p;
    private ArrayList<GameEpoch> epoches;

    public ResourceLoadThread(JProgressBar p) throws IOException {
        //this.p = p;


        //Load
        ClassLoader cl = getClass().getClassLoader();
        URL url = cl.getResource("pkgResources/res/fileindex.ini");
        BufferedInputStream stream = (BufferedInputStream) url.openStream();
        InputStreamReader read = new InputStreamReader(stream);
        BufferedReader r = new BufferedReader(read);
        String line = r.readLine();
        int epochCount = Integer.parseInt(line);
        line = r.readLine();
        int levelCountPerEpoche = Integer.parseInt(line);
        
        for(int i=1;i<=epochCount;i++) {
            
            
            
        }

    }

    private void readEpoch() {
        
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