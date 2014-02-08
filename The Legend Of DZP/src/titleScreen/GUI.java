
package titleScreen;

import java.awt.Dimension;
import java.awt.Rectangle;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        setMinimumSize(new Dimension(1280, 768));
        setExtendedState(MAXIMIZED_BOTH);
        revalidate();
        initComponents();
        /*loadingScreen.setBounds(new Rectangle(0, 0, getSize().width, getSize().height));
        revalidate();
        int x, y;
        x = loadingScreen.getSize().width;
        y = loadingScreen.getSize().height;
        loadingProgress.setLocation(x/2-loadingProgress.getSize().width/2, y/2-loadingProgress.getSize().height/2);
        revalidate();*/
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
