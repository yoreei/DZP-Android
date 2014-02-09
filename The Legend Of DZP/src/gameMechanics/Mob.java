package gameMechanics;

import java.awt.Point;

public class Mob {

    private Point position;
    private final int maxHP;
    private int HP;
    
    public Mob(int maxHP, Point position) {
        this.maxHP = maxHP;
    }
    
    void act() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}