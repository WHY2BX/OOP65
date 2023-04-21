import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class StudentView extends Student implements ActionListener, WindowListener {
    private Student s;
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JTextField idx, namex, moneyx;
    private JLabel id, name, money;
    private JButton dep, with;
    
    public StudentView(){
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        idx = new JTextField();
        namex = new JTextField();
        moneyx = new JTextField("0");
        moneyx.setEditable(false);
        
        id = new JLabel("ID : ");
        name = new JLabel("Name :");
        money = new JLabel("Money : ");
        
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        dep.addActionListener(this);
        with.addActionListener(this);
        
        fr.setLayout(new BorderLayout());
        
        p1.setLayout(new GridLayout(3,2));
        p1.add(id);
        p1.add(idx);
        p1.add(name);
        p1.add(namex);
        p1.add(money);
        p1.add(moneyx);
        
        p2.setLayout(new GridLayout(1, 2));
        p2.add(p3);
        p2.add(p4);
        
        //p3.setLayout(new BorderLayout());
        p3.add(dep);
        //p4.setLayout(new BorderLayout());
        p4.add(with);
        
        
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        
        //defultSetting
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(dep)){
            s.setMoney(s.getMoney()+(double)moneyx.getText());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
