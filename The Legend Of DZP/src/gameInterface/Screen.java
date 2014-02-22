package gameInterface;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import pkgResources.CurrentGame;
import pkgResources.ResourceLoader;

public class Screen extends JFrame {

    private static final long serialVersionUID = 1L;
    private final Dimension size;
    private final JButton btnStart;
    private final JButton btnQuit;
    public final JProgressBar progress;
    private JPanel background;
    private Image bg;
    private CurrentGame current;

    public Screen(final Dimension size) throws InterruptedException {

        this.progress = new JProgressBar(0, 100);


        synchronized (ResourceLoader.loaded) {
            while (ResourceLoader.titleBackground == null) {
                ResourceLoader.loaded.wait();
            }
        }
        this.size = size;

        bg = ResourceLoader.titleBackground.getImage();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnStart = new JButton("Start Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    current = ResourceLoader.createGame(0, 0);
                } catch (IOException ex) {
                    Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
                bg = current.getLevel().getMapImage().getImage();
                btnStart.setVisible(false);
                btnQuit.setVisible(false);
                progress.setVisible(false);
                try {
                    current.getLevel().getMap().getMapImage();
                } catch (Exception ex) {
                    Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
                repaint();
            }
        });

        btnQuit = new JButton("Quit Game");
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        background = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x;
                x = (getSize().width - bg.getWidth(null)) / 2;
                int y;
                y = (getSize().height - bg.getHeight(null)) / 2;
                g.drawImage(bg, x, y, null);
            }
        };

        //Spring layout
        BoxLayout bgLayout;
        bgLayout = new BoxLayout(background, BoxLayout.Y_AXIS);

        background.setLayout(bgLayout);
        background.add(Box.createRigidArea(new Dimension(173, 300)));
        background.add(btnStart);
        background.add(btnQuit);

        background.add(progress);


        /*GroupLayout bgLayout = new GroupLayout(background);
         bgLayout.setAutoCreateGaps(true);
         background.setLayout(bgLayout);
         bgLayout.setHorizontalGroup(
         bgLayout.createParallelGroup(Alignment.CENTER)
         .addGroup(bgLayout.createSequentialGroup()
         .addComponent(btnStart)
         //.addGap(100)
         .addComponent(btnQuit))
         .addComponent(progress));
         //.addGap(600));

         bgLayout.setVerticalGroup(
         bgLayout.createSequentialGroup()
         .addGap(300)
         .addGroup(bgLayout.createParallelGroup(Alignment.CENTER)
         .addComponent(btnStart)
         .addComponent(btnQuit))
         .addGap(100)
         .addComponent(progress));
         */
        this.add(background);
        repaint();
    }
}
