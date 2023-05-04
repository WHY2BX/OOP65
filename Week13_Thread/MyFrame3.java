import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.*;

public class MyFrame3 implements MouseListener{
    private MyTimeStopper timeStop;
    private Thread t;
    private JFrame fr;
    private boolean isStop;
    
    public MyFrame3() throws IOException{
        timeStop = new MyTimeStopper();
        t = new Thread(timeStop);
        fr = new JFrame();
        
        fr.setLayout(new GridLayout());
        fr.add(timeStop);
        
        fr.addMouseListener(this);
        
        fr.setLocation(3000, 200);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.start();
    }
    
    public void stopTime(){
        
    }
    
    public static void main(String[] args) throws IOException {
        new MyFrame3();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (isStop == false){
            isStop = true;
            timeStop.stopTime();
        }
        else if (isStop == true){
            isStop = false;
            timeStop.resumeTime();
        }
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
