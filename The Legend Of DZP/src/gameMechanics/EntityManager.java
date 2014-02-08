package gameMechanics;

import java.util.ArrayList;

public class EntityManager extends Thread {
    
    private ArrayList<Tower> towers;
    private ArrayList<Mob> mobs;
    
    public EntityManager(ArrayList<MainTower> towers) {
        
        for(int i=0;i<=towers.size()-1;i++) {
            this.towers.add(towers.get(i));
        }
    }
    
    public void newTower(Tower newTower) {
        towers.add(newTower);
    }
    
    public void destroyTower(Tower t) {
        towers.remove(t);
    }
    
    public void destroyMob(Mob m) {
        mobs.remove(m);
    }
    
    public void newMob(Mob m) {
        this.mobs.add(m);
    }
    
    @Override
    public void run () {
        
        while(Nexus.isAlive()) {
            
            for(int i=0;i<=towers.size()-1;i++) {
                towers.get(i).fire();
            }
            
            
            for(int i=0;i<=mobs.size()-1;i++) {
                mobs.get(i).act();
            }
            
            
            
        }
        
    }
    
}