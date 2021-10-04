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
        setSize(1000, 740);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        setLocationRelativeTo(null);
        setUndecorated(true);
        img = new ImageIcon(getClass().getResource("/img/ss.jpg"));
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(10);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.GRAY);
        pbar.setToolTipText("Loading Please Wait");
        imglabel.setBounds(0, 0, 1000, 740);
        add(pbar);
            pbar.setForeground(Color.WHITE);
         pbar.setBackground(Color.black);
        pbar.setPreferredSize(new Dimension(310, 30));
        pbar.setBounds(0, 680, 1000, 30);
        

        Thread t = new Thread() {

            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                   
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        
                    }
                    i+=2;
                }
            }
        };
        t.start();
    }
}
