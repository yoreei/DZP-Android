package gameMechanics;

import java.awt.Point;

public class PigTower extends MainTower {

    private static final Point pigPosition = new Point(3, 4);
    
    public PigTower(int level) {
        super(pigPosition, level);
    }
    
    @Override
    public void onHit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}