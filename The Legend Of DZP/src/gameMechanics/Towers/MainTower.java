package gameMechanics.Towers;

import gameMechanics.Towers.Tower;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class MainTower extends Tower{

    private static final int MainRange = 30;
    private static final int MainMaxHP = 200;
    
    public MainTower(Rectangle position, int level) {
        super(position, MainRange, level, MainMaxHP);
    }

    
}