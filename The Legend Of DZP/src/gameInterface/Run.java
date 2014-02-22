package gameInterface;

import gameMechanics.EntityManagerThread;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import pkgResources.ResourceLoadThread;
/*import org.lwjgl.LWJGLException;
 import org.lwjgl.opengl.Display;
 import org.lwjgl.opengl.DisplayMode;*/

public class Run {

    public static EntityManagerThread manager;
    public static ResourceLoadThread resources;
    public static final Dimension ScreenSize =
            Toolkit.getDefaultToolkit().getScreenSize();

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, Exception /*throws LWJGLException **/ {
        ///EventQueue


        /*Display.setDisplayMode(new DisplayMode(500, 500));
         Display.setFullscreen(true);
         Display.setTitle("The Legend of DZP");
         Display.create();
        
         Display.update();
        
         while(!Display.isCloseRequested()) {
         Display.update();
         }
         Display.destroy();*/

        resources = new pkgResources.ResourceLoadThread(null);
        resources.start();
        new gameInterface.Screen(new Dimension(1366, 704)).setVisible(true);
    }
}