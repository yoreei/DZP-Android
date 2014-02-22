package pkgResources;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class GameEpoch {

    private ArrayList<GameLevel> levels;
    private ImageIcon characterSkin;
    private ImageIcon towerSkin;

    public GameEpoch(ImageIcon towerSkin, ArrayList<GameLevel> levels) {

        this.towerSkin = towerSkin;
        this.levels = levels;
    }

    public ImageIcon getTowerSkin() {
        return this.towerSkin;
    }

    public GameLevel getLevel(int n) {
        return levels.get(n);
    }
}