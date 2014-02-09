package gameMechanics;

import java.awt.Point;

public class PigMainTower extends MainTower {

    private static final Point pigPosition = new Point(3, 4);
    
    public PigMainTower(int level) {
        super(pigPosition, level);
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