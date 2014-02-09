package gameMechanics;

import java.awt.Point;

public class ShortRangeSpecialTower extends SpecialTower {

    public ShortRangeSpecialTower(int range, Point position, int level, int maxCharge) {
        super(range, position, level, maxCharge);
    }


    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}