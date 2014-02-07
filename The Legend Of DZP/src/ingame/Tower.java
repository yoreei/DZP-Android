package ingame;

public interface Tower {

    public boolean fire();
    public void onHit();
    public void reduceHP(int amount);
    public void increaseHP(int amount);
    public boolean destroy();
    public void upgrade();
    
}