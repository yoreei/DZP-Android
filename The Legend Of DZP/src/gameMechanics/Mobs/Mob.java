package gameMechanics.Mobs;

import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;

public abstract class Mob {

    private Point position;
    private Point prevPos;
    private final int maxHP;
    private int HP;
    private static ImageIcon skin;
    
    public Mob(int maxHP, Point position) {
        this.maxHP = maxHP;
        this.setPosition(position);
        this.prevPos = null;
    }
    
    public void act() {
        
    }
    
    private int findPath() {
        
    }
    
    private void setPosition(Point p) {
        this.position = p;
    }
    
    public static void setSkin(ImageIcon skin) {
        Mob.skin = skin;
    }
    
    private void setHP(int HP) {
        this.HP = HP;
    } 
            
    public static Image getSkin() {
        return Mob.skin.getImage();
    }
    
    public int getHP() {
        return this.HP;
    }
    
    public Point getPosition() {
        return this.position;
    }
}