import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI extends Account implements ActionListener{
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
    private JLabel txt1;
    private JLabel txt2;
    private JLabel balance;
    private JTextField amount;
    private Account acct;
    
    public TellerGUI(){
        super(6000,"2B");
        acct = new Account(6000,"2B");
        
        fr = new JFrame("TellerGUI");
        fr.setLayout(new GridLayout(4,1));
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        txt1 = new JLabel("Balance");
        balance = new JLabel(acct.getBalance()+"");
        p1.add(txt1);
        p1.add(balance);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        txt2 = new JLabel("Amount");
        amount = new JTextField();
        p2.add(txt2);
        p2.add(amount);
        
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,3));
        p31 = new JPanel();
        p32 = new JPanel();
        p33 = new JPanel();
        
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        
        dep.addActionListener(this);
        with.addActionListener(this);
        exit.addActionListener(this);
        
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
    
    public void actionPerformed(ActionEvent event){
        if(event.getSource().equals(dep)){
            acct.deposit(Integer.parseInt(amount.getText()));
            balance.setText(acct.getBalance()+"");
        }
        else if(event.getSource().equals(with) && acct.getBalance() >= Integer.parseInt(amount.getText())){
            acct.withdraw(Integer.parseInt(amount.getText()));
            balance.setText(acct.getBalance()+"");
        }
        else if(event.getSource().equals(exit)){
            System.exit(0);
        }
    }
    
}
