package gameMechanics;

import java.awt.Point;

public abstract class Tower {

    protected int range;
    protected final Point position;
    protected int level;
    protected final int maxLevel = 5;

    protected Tower(Point position, int range, int level) {
        this.position = position;
        setLevel(level);
        setRange(range);
    }

    ///Set parameters
    private void setRange(int range) {
        this.range = range;
    }

    private void setLevel(int level) {
        this.level = level;
    }
    
    ///Get parameters
    public int getRange() {
        return this.range;
    }
    public Point getPosition() {
        return this.position;
    }

    ///Status updates
    public void despawn() {
        gameInterface.Run.manager.despawnTower(this);
    }

    public abstract void upgrade();

    ///Action
    public boolean hasInRange() {
        
        //for(int i=0;)
        
        return false;
    }

    public abstract void fire();
}