package ingame;

public abstract class SpecialTower implements Tower {
    
    @Override
    public abstract boolean fire();
    @Override
    public void doDamage(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void repair(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public abstract void onHit();
    @Override
    public abstract void upgrade();
    
}