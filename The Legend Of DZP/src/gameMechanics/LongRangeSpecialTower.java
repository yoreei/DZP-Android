package gameMechanics;

import java.awt.Point;

public class LongRangeSpecialTower extends SpecialTower {

    public LongRangeSpecialTower(int range, Point position, int level) {
        super(range, position, level);
    }
    
    @Override
    public void fire() {
        if(hasInRange());
    }
    
    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}