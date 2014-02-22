package gameInterface;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class LoaderThread extends Thread{
    
    private static final int data = 1142778;
    private JProgressBar progress;
    
    public LoaderThread(JProgressBar progress) {
        this.progress = progress;
    }
    
    @Override
    public void run () {
        
        while(true) {
            synchronized (pkgResources.ResourceLoader.loaded) {
                try {
                    while() pkgResources.ResourceLoader.loaded.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoaderThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }
    
}
