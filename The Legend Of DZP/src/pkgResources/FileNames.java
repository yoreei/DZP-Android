/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgResources;

/**
 *
 * @author Madara1233
 */
public enum FileNames {

    root("res/"),
    epoch("epoch"),
    level("level"),
    mapConfig("mapConfig"),
    mobImage("texture0.png"),
    mapImage("map1.png"),
    towerImage("texture1.png"),
    backgroundImage("bg.png"),
    fileIndex("config");
    private String value;

    private FileNames(String value) {
        this.value = value;
    }

    public String getName() {
        return this.value;
    }
    
    public static String getPathTo(int e, FileNames c) {
        return root.getName() + epoch.getName() + e + "/" + c.getName();
    }

    public static String getPathTo(int e, int l, FileNames c) {
        return root.getName()
                + epoch.getName() + e + "/"
                + level.getName() + l + "/"
                + c.getName();
    }

    public static String getPathTo(FileNames c) {
        return root.getName() + c.getName();
    }
}
