package gameMechanics;

import java.awt.Point;

public class PandaTower extends MainTower {
    
    private static final Point pandaPosition = new Point(3, 4);
    
    public PandaTower(int level) {
        super(pandaPosition, 1);
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