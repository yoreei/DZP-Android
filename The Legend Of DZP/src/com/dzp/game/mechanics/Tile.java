package com.dzp.game.mechanics;

import java.awt.Dimension;
import java.awt.Point;

public class Tile {

    public static final Dimension size = new Dimension(16, 16);
    private static final int TILE_ROAD = 1;
    private static final int TILE_MISC = 0;
    private static final int TILE_NEXUS = 2;
    private Occupator occupator;
    private boolean solid;
    private Point mapCoordinates;

    public Tile(int i) {
        switch (i) {
            case TILE_ROAD:
                setOccupator(Occupator.ROAD);
                break;
            case TILE_MISC:
                setOccupator(Occupator.MISC);
                break;
            case TILE_NEXUS:
                setOccupator(Occupator.NEXUS);
        }

    }

    public Occupator getOccupator() {
        return this.occupator;
    }

    ///Set parameters
    private void setOccupator(Occupator o) {
        this.occupator = o;
        if (o != Occupator.ROAD) {
            setSolid(true);
        }
    }

    private void setSolid(boolean s) {
        this.solid = s;
    }
}