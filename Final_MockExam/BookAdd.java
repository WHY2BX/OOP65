import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BookAdd implements ActionListener{
    private JFrame fr;
    private JPanel top, topLeft, topRight, bttm, overall;
    private JButton insert;
    private JComboBox selectT;
    private JLabel name, price, type;
    private JTextField nameSpace, priceSpace;
    private BookView bv;
    
    public BookAdd(){
         
        fr = new JFrame();
        
        top = new JPanel();
        topLeft = new JPanel();
        topRight = new JPanel();
        bttm = new JPanel();
        overall = new JPanel();
        
        insert = new JButton("Insert");
        
        name = new JLabel(" Name");
        price = new JLabel(" Price");
        type = new JLabel(" Type");
        
        nameSpace = new JTextField();
        priceSpace = new JTextField();
        
        selectT = new JComboBox();
        
        //button setting
        insert.addActionListener(this);
        
        //fr setting
        fr.setLayout(new BorderLayout());
        
        //top panel setting
        top.setLayout(new GridLayout(1, 2));
        
        topLeft.setLayout(new GridLayout(3,1));
        topLeft.add(name);
        topLeft.add(price);
        topLeft.add(type);
        
        topRight.setLayout(new GridLayout(3,1));
        topRight.add(nameSpace);
        topRight.add(priceSpace);
        topRight.add(selectT);
        
        top.add(topLeft);
        top.add(topRight);
        
        //bttm panel setting
        bttm.add(insert);
        
        
        //add on jframe
        fr.add(top, BorderLayout.CENTER);
        fr.add(bttm, BorderLayout.SOUTH);
        
        //setting combobox
        selectT.addItem("General");
        selectT.addItem("Computer");
        selectT.addItem("Math&Sci");
        selectT.addItem("Photo");
        
        //default setting
        fr.pack();
        fr.setLocation(3000, 250);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //psvm tester
    public static void main(String[] args) {
        //new BookAdd();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insert)){
            JOptionPane.showMessageDialog(fr, "Done it.");
            Book newbook = new Book(nameSpace.getText(), Double.valueOf(priceSpace.getText()), selectT.getSelectedItem()+"");
            BookView.addBook(newbook);
            fr.dispose();
        }
    }
    
    
}
