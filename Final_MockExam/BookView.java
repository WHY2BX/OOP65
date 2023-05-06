import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BookView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel top, down, top_left, top_right, down_up, down_low, namepan, pricepan,typepan, blank, top_leftAgain ;
    private JButton prev, next, add, update, del;
    private JLabel name, price, type;
    private JComboBox select;
    private JTextField num, nameSpace, priceSpace;
    private Book book;
    private static ArrayList<Book> colBook;
    private int numOfBooks;
    private int page;
    
    public BookView(){

        colBook = new ArrayList();
        
        book = new Book();
        fr = new JFrame();
        
        top = new JPanel();
        down = new JPanel();
        top_left = new JPanel();
        top_right = new JPanel();
        down_up = new JPanel();
        down_low = new JPanel();
        namepan = new JPanel(); 
        pricepan = new JPanel();
        typepan = new JPanel();
        blank = new JPanel();
        top_leftAgain = new JPanel();
        
        prev = new JButton("<<<");
        next = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        del = new JButton("Delete");
        
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        
        select = new JComboBox();
        
        nameSpace = new JTextField(book.getName()+"", 5);
        priceSpace = new JTextField(book.getPrice()+"", 5);
        num = new JTextField(page+"", 3);
        
        //button setting
        prev.addActionListener(this);
        next.addActionListener(this);
        add.addActionListener(this);
        update.addActionListener(this);
        del.addActionListener(this);
        
        //setting pan
        namepan.add(name);
        pricepan.add(price);
        typepan.add(type);
        
        //fr setting
        fr.setLayout(new BorderLayout());
        
        //top of jframe --> panel top
        top.setLayout(new GridLayout(1, 2));

        top_leftAgain.setLayout(new BorderLayout());
        top_leftAgain.add(top_left, BorderLayout.WEST);
        top_leftAgain.add(blank, BorderLayout.CENTER);
        
        top_left.setLayout(new GridLayout(3, 1));
        
        top_left.add(namepan);
        top_left.add(pricepan);
        top_left.add(typepan);
        
        top_right.setLayout(new GridLayout(3, 1));
        top_right.add(nameSpace);
        top_right.add(priceSpace);
        top_right.add(select);
        
        top.add(top_leftAgain);
        top.add(top_right);
        
        //down of jframe --> panel down
        down.setLayout(new GridLayout(2, 1));
        down_up.add(prev);
        num.setHorizontalAlignment(JTextField.LEFT);
        down_up.add(num);
        down_up.add(next);
        
        down_low.add(add);
        down_low.add(update);
        down_low.add(del);
        
        down.add(down_up);
        down.add(down_low);
        
        //add to jframe
        fr.add(top, BorderLayout.CENTER);
        fr.add(down, BorderLayout.SOUTH);

        //setting combobox
        select.addItem("General");
        select.addItem("Computer");
        select.addItem("Math&Sci");
        select.addItem("Photo");
        
        //defualt setting
        fr.addWindowListener(this);
        fr.pack();
        fr.setLocation(3000, 250);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    //psvm tester
    public static void main(String[] args) {
        new BookView();
    }
    
    public static void addBook(Book newBook){
        colBook.add(newBook);
        System.out.println(colBook.get(0).getType());
    }
    
    public void getJF(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)){
            numOfBooks++;
            new BookAdd();

        }
        else if (e.getSource().equals(update)){
            colBook.get(Integer.parseInt(num.getText())-1).setName(nameSpace.getText());
            colBook.get(Integer.parseInt(num.getText())-1).setPrice(Double.valueOf(priceSpace.getText()));
            colBook.get(Integer.parseInt(num.getText())-1).setType(select.getSelectedItem()+"");
            JOptionPane.showMessageDialog(fr, "Done it.");
        }
        else if (e.getSource().equals(prev)){
            if ((page == 0)&&(numOfBooks == 0)){
                nameSpace.setText("");
                priceSpace.setText(0.0+"");
                select.setSelectedItem( "");
            }
            else if ((page-1)<= 0){
                
            }
            else{
                page -= 1;
                num.setText(page+"");
                nameSpace.setText(colBook.get(page-1).getName());
                priceSpace.setText(Double.toString(colBook.get(page-1).getPrice()));
                select.setSelectedItem( colBook.get(page-1).getType());
            }
        }
        else if (e.getSource().equals(next)){
            if ((page == 0)&&(colBook.isEmpty())){
                page = 0;
                nameSpace.setText("");
                priceSpace.setText(0.0+"");   
                select.setSelectedItem( "");
                System.out.println("s1");
            }
            else if ((colBook.size())<(page+1)){
                System.out.println("s2");
            }
            else{
                page += 1;
                num.setText(page+"");
                nameSpace.setText(colBook.get(page-1).getName());
                priceSpace.setText(Double.toString(colBook.get(page-1).getPrice()));   
                select.setSelectedItem( colBook.get(page-1).getType());
                System.out.println("s3");
            }
        }
        else if (e.getSource().equals(del)){
        
            colBook.remove(page-1);
            numOfBooks--;
            
            System.out.println(page);
            
            if (numOfBooks==0){
                
                num.setText("0");
                nameSpace.setText("");
                priceSpace.setText(0.0+"");
                select.setSelectedItem( "General");
                System.out.println("1");
            }
            else if (numOfBooks<0){
 
                System.out.println("2");
            }
            else{

                page -= 1;
                num.setText(page+"");
                nameSpace.setText(colBook.get(page-1).getName());
                priceSpace.setText(Double.toString(colBook.get(page-1).getPrice()));
                select.setSelectedItem( colBook.get(page-1).getType());
                JOptionPane.showMessageDialog(fr, "Done it."); 
                System.out.println("3");
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File data = new File("Book.data");
        if (data.exists()){
            try {
                data.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
            try{
                FileInputStream rd = new FileInputStream("Book.data");
                ObjectInputStream oin = new ObjectInputStream(rd);

                colBook = (ArrayList<Book>)oin.readObject();
                numOfBooks = colBook.size();
                num.setText(numOfBooks+"");
                nameSpace.setText(colBook.get(numOfBooks-1).getName());
                priceSpace.setText(Double.toString(colBook.get(numOfBooks-1).getPrice()));   
                select.setSelectedItem( colBook.get(numOfBooks-1).getType());

                rd.close();
                oin.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            if(!colBook.isEmpty()){
                FileOutputStream fo = new FileOutputStream("Book.data");
                ObjectOutputStream oout = new ObjectOutputStream(fo);
                oout.writeObject(colBook);
                
                oout.close();
                fo.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
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
