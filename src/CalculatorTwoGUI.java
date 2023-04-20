import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class CalculatorTwoGUI implements ActionListener {
    private JTextField txt;
    
    private JPanel p2;
    
    private JFrame fr;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton equal;
    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton divide;
    private JButton clear;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("CalculatorTwoGUI");
        fr.setLayout(new BorderLayout());

        p2 = new JPanel();
        
        p2.setLayout(new GridLayout(4,4));
        
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        equal = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("x");
        divide = new JButton("/");
        clear = new JButton("c");
        
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        
        txt = new JTextField();
        txt.setHorizontalAlignment(JTextField.RIGHT);
      
        p2.add(seven);
        p2.add(eight);
        p2.add(nine);
        p2.add(plus);
        p2.add(four);
        p2.add(five);
        p2.add(six);
        p2.add(minus);
        p2.add(one);
        p2.add(two);
        p2.add(three);
        p2.add(times);
        p2.add(zero);
        p2.add(clear);
        p2.add(equal);
        p2.add(divide);
        
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p2);
        
        //setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    
    int num1;
    int num2;
    int result;
    String operator = "";
    
    public void actionPerformed(ActionEvent event){
        //numbers session
        ArrayList op = new ArrayList();
        op.add("+");
        op.add("x");
        op.add("/");
        op.add("-");
        op.add("=");
        op.add("c");

        if (!op.contains(event.getActionCommand())){
            System.out.println(event.getActionCommand());
            txt.setText(txt.getText()+event.getActionCommand());
            }
        
        //operators session
        else {
            if (event.getSource().equals(plus)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "+";
                txt.setText("");
            }
            
            else if (event.getSource().equals(minus)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "-";
                txt.setText("");
            }
            else if (event.getSource().equals(minus)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "-";
                txt.setText("");
            }
            else if (event.getSource().equals(times)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "*";
                txt.setText("");
            }
            else if (event.getSource().equals(divide)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "/";
                txt.setText("");
            }
            else if (event.getSource().equals(clear)) {
                txt.setText("");
            }
            else if (event.getSource().equals(equal)) {
                num2 = Integer.parseInt(txt.getText());
                if (operator.equals("+")){
                    result = num1 + num2;
                }
                else if (operator.equals("*")){
                    result = num1 * num2;
                }
                else if (operator.equals("-")){
                    result = num1 - num2;
                }
                else if (operator.equals("/")){
                    result = num1 / num2;
                }
                txt.setText(result+"");
            }
            
        }
    }    
}

