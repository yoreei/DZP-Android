package gameMechanics;

import java.awt.Rectangle;

public class NovaSpecialTower extends SpecialTower {

    public NovaSpecialTower(int range, Rectangle position, int level, int maxCharge) {
        super(range, position, level);
    }
    @Override
    public void fire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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