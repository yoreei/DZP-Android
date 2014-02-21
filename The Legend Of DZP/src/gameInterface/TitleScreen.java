package gameInterface;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitleScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JButton btnStart;
    private final JButton btnQuit;
    private JPanel background;
    private ImageIcon bg;

    public TitleScreen() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnStart = new JButton("Start Game");
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
                g.drawImage(Run.resources.getTitleBackground(), 0, 0, null);

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
