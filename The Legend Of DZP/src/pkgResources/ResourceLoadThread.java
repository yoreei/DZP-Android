package pkgResources;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class ResourceLoadThread extends Thread {
    
    private JProgressBar p;
    private ArrayList<Epoch> epoches;
    
    public ResourceLoadThread(JProgressBar p) {
        this.p = p;
    }
    public void setCurrentResources(Epoch e, Level l) {
        
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