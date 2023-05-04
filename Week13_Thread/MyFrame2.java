import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class MyFrame2 extends JFrame{
    private MyTime time;
    private Thread t;
    private JFrame fr;

    public MyFrame2() throws IOException{
        time = new MyTime();
        t = new Thread(time);
        fr = new JFrame();
        
        fr.setLayout(new GridLayout());
        fr.add(time);
        
        fr.setLocation(3000, 200);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.start();
    }
    
    public static void main(String[] args) throws IOException {
        new MyFrame2();
    }
}

