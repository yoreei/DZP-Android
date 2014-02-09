package gameMechanics;

import java.awt.Point;

public class PolecatMainTower extends MainTower {

    private static final Point polecatPosition = new Point(3, 4);
    
    public PolecatMainTower(int level) {
        super(polecatPosition, level);
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