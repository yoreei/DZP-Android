package gameMechanics;

import java.awt.Point;


public abstract class SpecialTower extends Tower {
    
    private static final int SpecialMaxHP = 100;
    
    public SpecialTower(int range, Point position, int level) {
        super(SpecialMaxHP, position, range, level);
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
    public boolean hasInRange() {
        return false;
        
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