package pkgResources;

public enum FileNames {

    root("res/"),
    epoch("epoch"),
    level("level"),
    mapConfig("mapConfig"),
    mobImage("texture0.png"),
    mapImage("map.png"),
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
