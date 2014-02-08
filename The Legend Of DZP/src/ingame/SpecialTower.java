package ingame;

import java.awt.Point;


public abstract class SpecialTower implements Tower {
    
    private int HP;
    private final int maxHP = 100;
    private int range;
    private final Point position;
    
    public SpecialTower(int range, Point position) {
        HP = maxHP;
        this.range = range;
        this.position = position;
    }
    
    @Override
    public int getRange() {
        return this.range;
    }

    @Override
    public int getHP() {
        return this.HP;
    }

    @Override
    public int getMaxHP() {
        return this.maxHP;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }
    
    
    
    @Override
    public void isInRange(int range) {
        
    }
    
    @Override
    public void doDamage(int amount) {
        this.HP-=amount;
    }
    
    @Override
    public void repair(int amount) {
        HP = maxHP;
    }
    
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public abstract void onHit();
    
    @Override
    public abstract void upgrade();

    

    @Override
    public void fire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}