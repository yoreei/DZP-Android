package com.dzp.game.gui;

import com.dzp.game.mechanics.EntityManagerThread;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import pkgResources.ResourceLoader;
/*import org.lwjgl.LWJGLException;
 import org.lwjgl.opengl.Display;
 import org.lwjgl.opengl.DisplayMode;*/

public class Run {

    public static EntityManagerThread manager;
    public static ResourceLoader resources;
    public static final Dimension ScreenSize =
            Toolkit.getDefaultToolkit().getScreenSize();

    public static void main(String[] args) throws Exception /*throws LWJGLException **/ {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ResourceLoader.load();
                } catch (Exception ex) {
                    Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("DONE");
               
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    com.dzp.game.gui.Screen s = new com.dzp.game.gui.Screen(new Dimension(1366, 704));
                    s.setVisible(true);
                    new LoaderThread(s.progress).start();
                    
                } catch (Exception ex) {
                    Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }).start();
        
    }
}