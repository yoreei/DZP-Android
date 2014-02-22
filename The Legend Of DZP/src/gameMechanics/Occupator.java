/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameMechanics;

/**
 *
 * @author Madara1233
 */
 public enum Occupator {
    ROAD(1), MISC(2), NEXUS(3);
    private int v;

    private Occupator(int i) {
        this.v = i;
    }
    
}
