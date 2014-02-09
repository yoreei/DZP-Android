package gameInterface;

import Resources.Resources;
import gameMechanics.EntityManager;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Run {
    
    public static EntityManager manager;
    public static Resources resources;
    
    public static void main(String[] args) throws LWJGLException {
        Display.setDisplayMode(new DisplayMode(500, 500));
        Display.setFullscreen(true);
        Display.setTitle("The Legend of DZP");
        Display.create();
        
        Display.update();
        
        while(!Display.isCloseRequested()) {
            Display.update();
        }
        Display.destroy();
    }
}