package gameMechanics;

import java.awt.Point;

public abstract class Tower {

    protected final int maxHP;
    protected int HP;
    protected int range;
    protected final Point position;
    protected int level;
    protected final int maxLevel = 5;

    protected Tower(int maxHP, Point position, int range, int level) {
        this.maxHP = maxHP;
        this.position = position;
        setLevel(level);
        setRange(range);
        setHP(maxHP);
    }

    ///Set parameters
    private void setHP(int HP) {
        if (HP <= this.maxHP) {
            this.HP = HP;
        }
    }

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

    public int getHP() {
        return this.HP;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public Point getPosition() {
        return this.position;
    }

    ///Status updates
    public abstract void onHit();

    public void doDamage(int amount) {
        this.HP -= amount;
        if (HP < 1) {
            this.destroy();
        }
    }

    public void repair(int amount) {
        this.HP += amount;
        if (HP > maxHP) {
            HP = maxHP;
        }
    }

    public void destroy() {
        gameInterface.Run.manager.destroyTower(this);
    }

    public abstract void upgrade();

    ///Action
    public boolean hasInRange() {
        
        for(int i=0;)
        
        return false;
    }

    public abstract void fire();
}