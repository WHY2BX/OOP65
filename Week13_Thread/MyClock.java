import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    private JLabel time;
    private Calendar d;
    int sec;
    int min;
    int hour;
    
    public MyClock(){
        time = new JLabel(hour+":"+min+":"+sec);
        time.setFont(new Font("#ZF Terminal",Font.BOLD, 50));
        
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(time);
        this.setVisible(true);
    }
    
    public void run(){
        while(true){
                d = Calendar.getInstance();
                sec = d.get(Calendar.SECOND);
                min = d.get(Calendar.MINUTE);
                hour = d.get(Calendar.HOUR_OF_DAY);
                
                if ((hour>10)&&(sec>10)&&(min>10)){
                    time.setText(hour+":"+min+":"+sec);
                }
                else{
                    if (hour<10){
                        time.setText("0"+hour+":"+min+":"+sec);
                    }
                    if (min<10){
                        time.setText(hour+":"+"0"+min+":"+sec);
                    }
                    if (sec<10){
                        time.setText(hour+":"+min+":0"+sec);
                    }
                }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
