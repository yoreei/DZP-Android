package gameMechanics;

import java.util.ArrayList;

public class EntityManager extends Thread {
    
    private ArrayList<Tower> towers;
    private ArrayList<Mob> mobs;
    private int tickCounter;
    private int spawnWave;
    
    public EntityManager(int towerLevelPig, int towerLevelPolecat, int towerLevelPanda) {
        towers.add(new PigMainTower(towerLevelPig));
        towers.add(new PolecatMainTower(towerLevelPolecat));
        towers.add(new PandaMainTower(towerLevelPanda));
        tickCounter = 0;
        spawnWave = 0;
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
    
    private void setSpawnWave(int wave) {
        this.spawnWave = wave;
    }
    
    @Override
    public void run () {
        
        /** 
         * Run code
         */
        
        
        while(Nexus.isAlive()) {
            
            /** MOBS **/
            if(mobs.isEmpty()) {
                setSpawnWave(gameInterface.Run.resources);
            }
            if(spawnWave) {
                
            }
            for(int i=0;i<=mobs.size()-1;i++) {
                mobs.get(i).act();
            }
            
            /** TOWERS **/        
            for(int i=0;i<=towers.size()-1;i++) {
                towers.get(i).fire();
            }

            /** GENERATOR **/
            
            
        }
        
    }
    
}