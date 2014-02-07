package ingame;

public interface Tower {

    public abstract boolean fire();
    public abstract void onHit();
    public abstract void doDamage(int amount);
    public abstract void repair(int amount);
    public abstract boolean destroy();
    public abstract void upgrade();
    
}