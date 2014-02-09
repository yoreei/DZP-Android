package gameMechanics;

import java.awt.Point;

public class LongRangeSpecialTower extends SpecialTower {

    public LongRangeSpecialTower(int range, Point position, int level, int maxCharge) {
        super(range, position, level, maxCharge);
    }
    
    @Override
    public void fire() {
        
    }
    
    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasInRange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}