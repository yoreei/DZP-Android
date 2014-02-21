package gameInterface;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pkgResources.CurrentGame;

public class TitleScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JButton btnStart;
    private final JButton btnQuit;
    private JPanel background;
    private Image bg;
    private CurrentGame current;

    public TitleScreen() {
        
        bg = Run.resources.getTitleBackground();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnStart = new JButton("Start Game");
        btnStart.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                current = Run.resources.createGame(0, 0);
                bg = current.getMap().getMapImage();
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
                g.drawImage(bg, 0, 0, null);
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
