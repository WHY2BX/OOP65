import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.Random;

public class Poring implements ActionListener, MouseListener, Runnable {
    private JFrame fr;
    private JLabel imageLabel;
    private JLabel count;
    private ImageIcon img;
    private static int num;
    
    
    public Poring() {
        num++;
        fr = new JFrame();
        count = new JLabel(num+"");
        img = new ImageIcon("C:\\Users\\LAB203-01\\Downloads\\poringpics.png");
        imageLabel = new JLabel(img);
        
        imageLabel.addMouseListener(this);
        
        fr.setLayout(new BorderLayout());
        fr.add(imageLabel, BorderLayout.CENTER);
        fr.add(count, BorderLayout.EAST);
        
        fr.setResizable(false);
        fr.pack();
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        
    }
    
    @Override
    public void run() {
        while(true){
            try {
                fr.setLocation(new Random().nextInt(800), new Random().nextInt(800));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Poring.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        fr.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
