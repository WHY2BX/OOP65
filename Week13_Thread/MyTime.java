import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyTime extends JPanel implements Runnable{
    private JLabel time;
    private Calendar d;
    int secS, minS, hourS ;
    
    public MyTime(){
        
        d = Calendar.getInstance();
        secS = d.get(Calendar.SECOND);
        minS = d.get(Calendar.MINUTE);
        hourS = d.get(Calendar.HOUR_OF_DAY);
        time = new JLabel();
        
        time.setFont(new Font("#ZF Terminal",Font.BOLD, 50));
        
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(time);
        this.setVisible(true);
    }
    public void run(){
        int secA, minA, hourA, sec, min, hour;
        while(true){
            
            d = Calendar.getInstance();
            secA = d.get(Calendar.SECOND);
            minA = d.get(Calendar.MINUTE);
            hourA = d.get(Calendar.HOUR_OF_DAY);
            
            sec = Math.abs(secS - secA);
            min = Math.abs(minS - minA);
            hour = Math.abs(hourS - hourA);

            System.out.println(sec);
            
            if ((hour<10)&&(sec<10)&&(min<10)){
                time.setText("0"+hour+":0"+min+":0"+sec);
            }
            else{
                if (hour>10){
                    time.setText(hour+":0"+min+":0"+sec);
                }
                if (min>10){
                    time.setText("0"+hour+":"+min+":0"+sec);
                }
                if (sec>10){
                    time.setText("0"+hour+":0"+min+":"+sec);
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
