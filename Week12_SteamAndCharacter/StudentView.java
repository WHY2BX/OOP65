import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        moneyx = new JTextField();
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
        
        
        fr.addWindowListener(this);
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
            int result = s.getMoney()+100;
            s.setMoney(result);
            moneyx.setText(s.getMoney()+"");
            System.out.println(s.getMoney());
        }
        else if (e.getSource().equals(with)){
            int result = s.getMoney()-100;
            s.setMoney(result);
            moneyx.setText(s.getMoney()+"");
            System.out.println(s.getMoney());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File data = new File("StudentM.dat");
        if (s == null){
            s = new Student();
            try {
                data.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(StudentView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try{
            FileInputStream rd = new FileInputStream("StudentM.dat");
            ObjectInputStream OIn = new ObjectInputStream(rd);
            s = (Student)OIn.readObject();
            idx.setText(s.getID()+"");
            
            //s.setName(name);
            OIn.close();
            rd.close();
            }
        catch(IOException io){
            io.printStackTrace();
        }
        catch(ClassNotFoundException cl){
            cl.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            FileOutputStream f = new FileOutputStream("StudentM.dat");
            ObjectOutputStream OOut = new ObjectOutputStream(f);
            s.setID(Integer.parseInt(idx.getText()));
            OOut.writeObject(s);
            OOut.close();
            f.close();
        }
        catch(IOException io){
            io.printStackTrace();
        }
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
