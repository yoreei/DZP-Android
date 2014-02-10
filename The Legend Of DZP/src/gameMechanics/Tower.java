package gameMechanics;

import java.awt.Point;

public abstract class Tower {

    protected int range;
    protected final Point position;
    protected int level;
    protected final int maxLevel = 5;
    protected final int maxHP;
    protected int HP;

    protected Tower(Point position, int range, int level, int maxHP) {
        this.position = position;
        setLevel(level);
        setRange(range);
        this.maxHP = maxHP;
        setHP(HP);
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
        
        
        
        
        return false;
    }

    public abstract void fire();

    private void setHP(int HP) {
        this.HP = HP;
    }
}