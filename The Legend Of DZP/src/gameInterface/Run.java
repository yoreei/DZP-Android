package gameInterface;

import pkgResources.ResourceLoadThread;
import gameMechanics.EntityManagerThread;
import java.io.*;
import java.util.Scanner;
/*import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;*/

public class Run {
    
    public static EntityManagerThread manager;
    public static ResourceLoadThread resources;
    
    public static void main(String[] args) throws IOException, ClassNotFoundException /*throws LWJGLException **/{
        /*Display.setDisplayMode(new DisplayMode(500, 500));
        Display.setFullscreen(true);
        Display.setTitle("The Legend of DZP");
        Display.create();
        
        Display.update();
        
        while(!Display.isCloseRequested()) {
            Display.update();
        }
        Display.destroy();*/
        
        String a;
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        File f = new File ("Serial.bin");
        if(!f.exists()) f.createNewFile();
        FileInputStream fileOut = new FileInputStream(f);
        try (ObjectInputStream objOut = new ObjectInputStream(fileOut)) {
            a = (String) objOut.readObject();
        }
        System.out.println(a);
        String
    }
}