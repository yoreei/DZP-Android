package pkgResources;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class CurrentGame {
    
    private final GameEpoch epoch;
    private final GameLevel level;
    private final Map<String, Integer> towerUpgrades;
    
    public CurrentGame(GameEpoch e, GameLevel l, File upgradeList) throws IOException {
        this.epoch = e;
        this.level = l;
        towerUpgrades=null;
    }
    
    public GameLevel getLevel() {
        return this.level;
    }
    
    public GameEpoch getEpoch() {
        return this.epoch;
    }
    
}