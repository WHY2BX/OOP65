import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyTextEditer implements ActionListener{
    private JFrame fr;
    private JMenuBar mb;
    private JMenu file;
    private JMenuItem nnew, open, save, close;
    private JTextArea txt;
    private JSeparator sep;
    
    public MyTextEditer(){
        fr = new JFrame();
        txt = new JTextArea();
        sep = new JSeparator();
        mb = new JMenuBar();
        file = new JMenu("File");
        nnew = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        //add action listener
        nnew.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        close.addActionListener(this);
        
        //setting menu bar
        mb.add(file);
        file.add(nnew);
        file.add(open);
        file.add(save);
        file.add(sep);
        file.add(close);
        
        //jframe setting
        fr.setLayout(new BorderLayout());
        
        //add on jframe
        fr.add(mb, BorderLayout.NORTH);
        fr.add(txt, BorderLayout.CENTER);

        
        //defualt setting
        fr.setSize(500, 500);
        fr.setLocation(3000,250); //not nessesary --> i've multiple screens
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //psvm tester
    public static void main(String[] args) {
        new MyTextEditer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nnew)){
            txt.setText("");
        }
        else if (e.getSource().equals(open)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            String textLoad = "";
            try (FileReader fR = new FileReader(f);){
                int data = fR.read();
                while (data != -1){
                    textLoad += (char)data;
                    data = fR.read();
                }
                txt.setText(textLoad);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MyTextEditer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MyTextEditer.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        else if (e.getSource().equals(save)){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
            try(FileWriter fW = new FileWriter(f);){
                fW.write(txt.getText());
            } catch (IOException ex) {
                Logger.getLogger(MyTextEditer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
