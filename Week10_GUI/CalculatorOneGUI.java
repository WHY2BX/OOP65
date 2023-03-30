import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    //attributes --> any componants
    private JFrame fr;
    private JPanel p;
    private JPanel flow;
    private JPanel blank;
    private JTextField insert;
    private JTextField insert_2;
    private JTextField txt;
    private JButton btn_plus;
    private JButton btn_minus;
    private JButton btn_times;
    private JButton btn_divide;
    
    //comstructor
    public CalculatorOneGUI(){
        //Frame
        fr = new JFrame("CalculatorOneGUI");
        fr.setLayout(new GridLayout(4,1));
        fr.setResizable(false);
        
        insert = new JTextField();
        insert_2 = new JTextField();
        txt = new JTextField();
        
        //button field
        btn_plus = new JButton("+");
        btn_minus = new JButton("-");
        btn_times = new JButton("*");
        btn_divide = new JButton("/");
        
        flow = new JPanel();
        blank = new JPanel();
        //flow.setLayout(new GridLayout(1,6));
        flow.add(btn_plus);
        flow.add(btn_minus);
        flow.add(btn_times);
        flow.add(btn_divide);
        
        fr.add(insert);
        fr.add(insert_2);
        fr.add(flow);
        fr.add(txt);
        
        //setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
