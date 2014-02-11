package pkgResources;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class ResourceLoadThread extends Thread {
    
    private JProgressBar p;
    private ArrayList<GameEpoch> epoches;
    
    public ResourceLoadThread(JProgressBar p) {
        this.p = p;
        
        
        //Levels
        GameLevel.levels.put(null, null);
        
        
    }
    public void setCurrentResources(Level l) {
        
    }
    
    @Override
    public void run () {
        for(int i=0;i<=10000;i++) {
            try {
                p.setValue(i/100);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ResourceLoadThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}