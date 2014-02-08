package gameMechanics;

import java.awt.Point;

public class ShortRangeTower extends SpecialTower {

    public ShortRangeTower(int range, Point position, int level) {
        super(range, position, level);
    }

    @Override
    public void onHit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}