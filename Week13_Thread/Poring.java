import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring implements ActionListener, MouseListener, Runnable {
    private JFrame fr;
    private JLabel imageLabel;
    private JLabel count;
    private ImageIcon img;
    private int num;
    
    
    public Poring() {
        fr = new JFrame();
        count = new JLabel(num+"");
        img = new ImageIcon("D:\\IT_KMITL\\YEAR_1\\OOP\\Thread\\src\\poringpics.png");
        imageLabel = new JLabel(img);
        
        imageLabel.addMouseListener(this);
        
        fr.setLayout(new BorderLayout());
        fr.add(imageLabel, BorderLayout.CENTER);
        fr.add(count, BorderLayout.EAST);
        
        fr.setResizable(false);
        fr.pack();
        fr.setVisible(true);
        //fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public void plusNum(){
        num++;
    }
    
    @Override
    public void run() {
        while(true){
            count.setText(num+"");
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
