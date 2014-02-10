package gameMechanics;

import java.awt.Rectangle;

public abstract class Tower {

    protected static final Rectangle PolecatPosition = new Rectangle(3, 4, 5, 6);
    protected static final Rectangle PigPosition = new Rectangle(3, 4, 5, 6);
    protected static final Rectangle PandaPosition = new Rectangle(3, 4, 5, 6);
    protected int range;
    protected final Rectangle position;
    protected int level;
    protected final int maxLevel = 5;
    protected final int maxHP;
    protected int HP;

    protected Tower(Rectangle position, int range, int level, int maxHP) {
        this.position = position;
        setLevel(level);
        setRange(range);
        this.maxHP = maxHP;
        setHP(HP);
    }

    ///Set parameters
    protected final void setRange(int range) {
        this.range = range;
    }
    protected final void setLevel(int level) {
        this.level = level;
    }
    protected final void setHP(int HP) {
        this.HP = HP;
    }
    
    ///Get parameters
    public int getRange() {
        return this.range;
    }
    public Rectangle getPosition() {
        return this.position;
    }
    public int getHP() {
        return this.HP;
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

    
}