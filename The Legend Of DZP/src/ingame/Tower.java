package ingame;

public interface Tower {

    public abstract void onHit();
    public abstract void doDamage(int amount);
    public abstract void repair(int amount);
    public abstract void destroy();
    public abstract void upgrade();

    public abstract void fire();
}