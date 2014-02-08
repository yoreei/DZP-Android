package ingame;

public abstract class SpecialTower implements Tower {
    
    private int HP;
    private final int MAX_HP = 100;
    private int range;
    
    @Override
    public abstract void fire();
    
    @Override
    public void doDamage(int amount) {
        this.HP-=amount;
    }
    
    @Override
    public void repair(int amount) {
        HP = MAX_HP;
    }
    
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public abstract void onHit();
    
    @Override
    public abstract void upgrade();
    
}