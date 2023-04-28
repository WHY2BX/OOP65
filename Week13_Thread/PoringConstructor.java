import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    private Poring poring;
    private JFrame fr;
    private JButton add;
    private Thread t1;
    private JPanel pn;

    public PoringConstructor(){
        fr = new JFrame();
        add = new JButton("Add");
        pn = new JPanel();
        //t1 = new Thread(poring);

        add.addActionListener(this);

        pn.add(add);
        
        fr.add(pn);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //t1.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        (new Thread(new Poring())).start();
        //poring.run();
        
//    public static void main(String[] args) {
//    (new Thread(new Poring())).start();
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
