package ingame;

import java.awt.Point;

public class LongRangeTower extends SpecialTower {

    public LongRangeTower(int range, Point position) {
        super(range, position);
    }
    
    @Override
    public void fire() {
        
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