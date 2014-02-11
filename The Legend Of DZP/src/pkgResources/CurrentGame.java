package pkgResources;

import java.io.File;
import java.util.Map;


public class CurrentGame {
    
    private final GameEpoch epoch;
    private final GameLevel level;
    private final Map<String, Integer> towerUpgrades;
    
    public CurrentGame(GameEpoch e, GameLevel l, File upgradeList) {
        this.epoch = e;
        this.level = l;
        towerUpgrades=null;
    }
    
    
}