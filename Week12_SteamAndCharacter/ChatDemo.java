import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JTextArea chat;
    private JTextField type;
    private JButton submit, reset;
    
    public ChatDemo(){
        
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        chat = new JTextArea();
        type = new JTextField();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
       
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        //layout
        
        p1.setLayout(new BorderLayout());
        p1.add(chat);
        chat.setEditable(false);
        
        p2.setLayout(new BorderLayout());
        p2.add(type, BorderLayout.NORTH);
        p2.add(p3, BorderLayout.SOUTH);
        
        p3.add(submit);
        p3.add(reset);
        
        fr.setLayout(new BorderLayout());
        fr.add(p1);
        fr.add(p2, BorderLayout.SOUTH);
        fr.addWindowListener(this);
        
        //defultSetting
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent event){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
        if (event.getSource().equals(submit)){
            String txt = type.getText();
            type.setText("");
            chat.append(dtf.format(LocalDateTime.now()) + " : " + txt);
        }
        else if (event.getSource().equals(reset)) {
            chat.setText("");
        }
    }
    
    public void windowOpened(WindowEvent e){
        if (e.getSource().equals(fr)){
            try (FileReader f = new FileReader("ChatDemo.txt");){
                int data = f.read();
                while(data!=-1){
                    System.out.println((char)data);
                    chat.setText((char)data+"");
                }
            }
            catch(IOException io){
                io.printStackTrace();
                }
            }
        }
    
    public void windowClosing(WindowEvent e){
        if (e.getSource().equals(fr)){
            try(FileWriter f = new FileWriter("ChatDemo.txt");){
                f.write(chat.getText());
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

}
