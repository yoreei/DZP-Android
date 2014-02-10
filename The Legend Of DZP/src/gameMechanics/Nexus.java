package gameMechanics;

public class Nexus {
    
    private static final int maxHP;
    private static int HP;
    
    static {
        maxHP = 500;
        HP = maxHP;
    }
    
    public static void initialize() {
        
    }
    
    public static boolean isAlive() {
        return HP>0;
    }
    
}