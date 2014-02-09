package resources;

import java.io.File;
import java.util.Map;


public class CurrentGame {
    
    private final Epoch epoch;
    private final Level level;
    private final Map<String, Integer> towerUpgrades;
    
    public CurrentGame(Epoch e, Level l, File upgradeList) {
        this.epoch = e;
        this.level = l;
        
    }
    
    
}