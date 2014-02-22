package gameInterface;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pkgResources.CurrentGame;

public class Screen extends JFrame {

    private static final long serialVersionUID = 1L;
    private final Dimension size;
    private final JButton btnStart;
    private final JButton btnQuit;
    private JPanel background;
    private Image bg;
    private CurrentGame current;

    public Screen(final Dimension size) {

        this.size = size;
        bg = Run.resources.getTitleBackground();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnStart = new JButton("Start Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    current = Run.resources.createGame(0, 0);
                } catch (IOException ex) {
                    Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
                bg = current.getLevel().getMapImage().getImage();
                btnStart.setVisible(false);
                btnQuit.setVisible(false);
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


        //bg = Run.resources.getTitleBackground();
        background = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x;
                x = (getSize().width - bg.getWidth(null)) / 2;
                int y;
                y = (getSize().height - bg.getHeight(null)) / 2;
                //System.out.println(getSize().height - bg.getHeight(null) / 2);
                g.drawImage(bg, x, y, null);
            }
        };
        this.add(background);

        GroupLayout bgLayout = new GroupLayout(background);
        bgLayout.setHorizontalGroup(
                bgLayout.createSequentialGroup()
                .addComponent(btnStart)
                .addComponent(btnQuit));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup()
                .addComponent(btnStart)
                .addComponent(btnQuit));


    }
}
