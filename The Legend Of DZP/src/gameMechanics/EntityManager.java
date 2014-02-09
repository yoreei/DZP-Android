package gameMechanics;

import java.awt.Point;
import java.util.ArrayList;

public class EntityManager extends Thread {
    
    private ArrayList<Tower> towers;
    private ArrayList<Mob> mobs;
    private int tickCounter;
    
    public EntityManager(int towerLevelPig, int towerLevelPolecat, int towerLevelPanda) {
        towers.add(new PigTower(towerLevelPig));
        towers.add(new PolecatTower(towerLevelPolecat));
        towers.add(new PandaTower(towerLevelPanda));
        tickCounter = 0;
    }
 
    ///Spawn/despawn
    public void spawnTower(Tower newTower) {
        towers.add(newTower);
    }
    public void despawnTower(Tower t) {
        towers.remove(t);
    }
    public void despawnMob(Mob m) {
        mobs.remove(m);
    }
    public void spawnMob(Mob m) {
        this.mobs.add(m);
    }
    
    @Override
    public void run () {
        
        while(Nexus.isAlive()) {
            
            ///Spawn mobs
            if(mobs.isEmpty()) {
                spawnWave();
            }
            
            for(int i=0;i<=towers.size()-1;i++) {
                towers.get(i).fire();
            }
            for(int i=0;i<=mobs.size()-1;i++) {
                mobs.get(i).act();
            }

            
        }
        
    }
    
}