package pkgResources;

import java.io.File;
import java.util.Map;


public class CurrentGame {
    
    private final GameEpoch epoch;
    private final GameLevel level;
    private final Map<String, Integer> towerUpgrades;
    private final gameMechanics.Map gameMap;
    
    public CurrentGame(GameEpoch e, GameLevel l, File upgradeList) {
        this.epoch = e;
        this.level = l;
        towerUpgrades=null;
        this.gameMap = new gameMechanics.Map(epoch, 1366, 768);
    }
    
    public gameMechanics.Map getMap() {
        return this.gameMap;
    }
    
}