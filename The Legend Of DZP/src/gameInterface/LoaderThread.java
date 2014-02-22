package gameInterface;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class LoaderThread extends Thread {
    
    private static final int data = 1142778;
    private JProgressBar progress;
    
    public LoaderThread(JProgressBar progress) {
        this.progress = progress;
    }
    
    @Override
    public void run() {
        
        while (true) {
            synchronized (pkgResources.ResourceLoader.loaded) {
                try {
                    while (progress.getValue() < 100) {
                        pkgResources.ResourceLoader.loaded.wait();
                        progress.setValue(pkgResources.ResourceLoader.progress);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoaderThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }
}
