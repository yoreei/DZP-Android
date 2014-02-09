package Resources;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Resources extends Thread {
    
    private JProgressBar p;
    private ArrayList<Epoch> epoches;
    private 
    
    
    public Resources(JProgressBar p) {
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
                Logger.getLogger(Resources.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}