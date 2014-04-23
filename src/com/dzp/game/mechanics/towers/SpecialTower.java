package com.dzp.game.mechanics.towers;


import java.awt.Rectangle;


public abstract class SpecialTower extends Tower {
    
    private int charge;
    private static final int SpecialMaxHP = 100;
    
    public SpecialTower(int range, Rectangle position, int level) {
        super(position, range, level, SpecialMaxHP);
    }
    
    ///Set parameters
    
    ///Get parameters

    @Override
    public abstract void upgrade();

    @Override
    public void fire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}