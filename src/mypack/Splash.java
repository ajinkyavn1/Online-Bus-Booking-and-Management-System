package mypack;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends JFrame {

    private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    private int time = 0;
    Thread t = null;

    public Splash() {
        super("System is Booting ");
        setSize(404, 340);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
     
        img = new ImageIcon(getClass().getResource("/img/splash.png"));
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(10);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.GRAY);
        pbar.setToolTipText("Loading Please Wait");
        imglabel.setBounds(0, 0, 404, 310);
        add(pbar);
        pbar.setPreferredSize(new Dimension(310, 30));
        pbar.setBounds(0, 290, 404, 20);
        

        Thread t = new Thread() {

            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        
                    }
                    i+=5;
                }
            }
        };
        t.start();
    }
}
