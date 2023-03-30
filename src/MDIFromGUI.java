import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JPanel p;
    private JMenuBar mb;
    private JMenu m1;
    private JMenu m2;
    private JMenu m3;
    private JMenu New;
    private JMenuItem Open;
    private JMenuItem Save;
    private JMenuItem Exit;
    private JMenuItem Window;
    private JMenuItem Message;
    private JInternalFrame frame1;
    private JInternalFrame frame2;
    private JInternalFrame frame3;
    
    public MDIFromGUI(){
        fr = new JFrame("MDIFromGUI");
        fr.setLayout(new BorderLayout());
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        New = new JMenu("New");
        
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Exit = new JMenuItem("Exit");
        Window = new JMenuItem("Window");
        Message = new JMenuItem("Message");
        
        p = new JPanel();
        p.setLayout(new FlowLayout());
        
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame1.setSize(250,100);
        frame1.setVisible(true);
        frame1.setLocation(10, 50);
        
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame2.setSize(250,100);
        frame2.setVisible(true);
        frame2.setLocation(150, 175);
        
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        frame3.setSize(250,100);
        frame3.setVisible(true);
        frame3.setLocation(200, 300);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        m1.add(New);
        m1.add(Open);
        m1.addSeparator();
        m1.add(Save);
        m1.addSeparator();
        m1.add(Exit);
        
        New.add(Window);
        New.addSeparator();
        New.add(Message);
        
        fr.add(frame1);
        fr.add(frame2);
        fr.add(frame3);
        
        //add on JFrame
        fr.add(mb,BorderLayout.NORTH);
        fr.add(p,BorderLayout.CENTER);
        
        //setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setLocation(0, 0);
    }
    
}
 