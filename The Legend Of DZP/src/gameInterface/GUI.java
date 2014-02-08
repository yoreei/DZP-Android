
package gameInterface;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    private Loader l;
    private JPanel titleScreen;
    private JButton Start;
    
    public void run () {
        this.setVisible(true);
        l.start();
        while(true) {
            if(loadingProgress.getValue()==100) break;
        }
        
        loadingScreen.setVisible(false);
        titleScreen.setVisible(true);
    }
    
    public GUI() {
        setMinimumSize(new Dimension(1280, 768));
        setExtendedState(MAXIMIZED_BOTH);
        revalidate();
        initComponents();
        l = new Loader(loadingProgress);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingScreen = new javax.swing.JPanel();
        loadingProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadingScreen.setLayout(new java.awt.GridBagLayout());
        loadingScreen.add(loadingProgress, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar loadingProgress;
    private javax.swing.JPanel loadingScreen;
    // End of variables declaration//GEN-END:variables
}
