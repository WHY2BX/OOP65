import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class MyFrame extends JFrame{
    private MyClock clock;
    private Thread t;
    private JFrame fr;

    public MyFrame() throws IOException{
        clock = new MyClock();
        t = new Thread(clock);
        fr = new JFrame();
        
        fr.setLayout(new GridLayout());
        fr.add(clock);
        
        fr.setLocation(3000, 200);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.start();
    }
    
    public static void main(String[] args) throws IOException {
        new MyFrame();
    }
}
