import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p31;
    private JPanel p32;
    private JPanel p33;
    private JPanel blank;
    private JButton dep;
    private JButton with;
    private JButton exit;
    private JTextArea txt1;
    private JTextArea txt2;
    private JTextField bl;
    private JTextField am;
    
    public TellerGUI(){
        fr = new JFrame("TellerGUI");
        fr.setLayout(new GridLayout(4,1));
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        txt1 = new JTextArea("Balance");
        txt1.setEditable(false);
        bl = new JTextField("6000");
        bl.setEditable(false);
        p1.add(txt1);
        p1.add(bl);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        txt2 = new JTextArea("Amount");
        txt2.setEditable(false);
        am = new JTextField();
        p2.add(txt2);
        p2.add(am);
        
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,3));
        p31 = new JPanel();
        p32 = new JPanel();
        p33 = new JPanel();
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        p31.add(dep);
        p32.add(with);
        p33.add(exit);
        p3.add(p31);
        p3.add(p32);
        p3.add(p33);
        
        blank = new JPanel();
        
        //Jframe add
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(blank);
        
        
        //setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
}
