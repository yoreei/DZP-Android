package gameMechanics;

import java.awt.Point;


public abstract class SpecialTower extends Tower {
    
    private int charge;
    private static final int SpecialMaxHP = 100;
    
    public SpecialTower(int range, Point position, int level) {
        super(position, range, level, SpecialMaxHP);
    }
    
    ///Set parameters
    protected void setCharge(int charge) {
        this.charge = charge;
    }
    
    ///Get parameters
    protected int getCharge() {
        return this.charge;
    }
    @Override
    public abstract void upgrade();

    @Override
    public void fire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}