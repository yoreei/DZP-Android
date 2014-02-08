package gameMechanics;

import java.awt.Point;

public interface Tower {
    
    ///Get parameters
    public int getRange();
    public int getHP();
    public int getMaxHP();
    public Point getPosition();
    
    ///Status updates
    public abstract void onHit();
    public void doDamage(int amount);
    public void repair(int amount);
    public void destroy();
    public abstract void upgrade();

    ///Action
    public void isInRange(int range);
    public abstract void fire();
}