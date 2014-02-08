package gameInterface;

public class Run {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI main;
                main = new GUI();
                main.run();
            }
        });
    }
}