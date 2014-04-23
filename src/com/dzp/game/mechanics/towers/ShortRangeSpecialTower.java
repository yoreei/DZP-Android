package com.dzp.game.mechanics.towers;

import com.dzp.game.mechanics.towers.SpecialTower;
import java.awt.Point;
import java.awt.Rectangle;

public class ShortRangeSpecialTower extends SpecialTower {

    public ShortRangeSpecialTower(int range, Rectangle position, int level) {
        super(range, position, level);
    }


    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}