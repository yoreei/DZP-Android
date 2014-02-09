package gameMechanics;

import java.awt.Point;

public abstract class MainTower extends Tower{

    private static final int MainMaxHP = 200;
    private static final int MainRange = 30;
    
    public MainTower(Point position, int level) {
        super(position, MainRange, level);
    }

    
}