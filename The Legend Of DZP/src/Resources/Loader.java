package Resources;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Loader extends Thread {
    
    private JProgressBar p;
    private 
    
    
    
    public Loader(JProgressBar p) {
        this.p = p;
    }
    
    @Override
    public void run () {
        for(int i=0;i<=10000;i++) {
            try {
                p.setValue(i/100);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}