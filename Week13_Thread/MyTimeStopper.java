import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;

public class MyTimeStopper extends JPanel implements Runnable{
    private JLabel time;
    private Calendar d;
    private JButton stop, resume;
    private boolean isStop;
    int secS, minS, hourS ;
    
    public MyTimeStopper(){

        time = new JLabel();
        
        time.setFont(new Font("#ZF Terminal",Font.BOLD, 50));
        
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(time);
        this.setVisible(true);
    }
    
    private synchronized void checkStop() throws InterruptedException{
        while(isStop){
            this.wait();
        }
    }
    
    public synchronized void resumeTime(){
        isStop = false;
        this.notify();
    }
    
    public synchronized void stopTime(){
        isStop = true;
    }
    
    public void run(){
        int sec=0, min=0, hour=0;
        while(true){
            
            sec++;
            if (sec == 60){
                min++;
                sec = 0;
            }
            if (min == 60){
                hour++;
                min = 0;
            }

            System.out.println(isStop);
            
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
                checkStop();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
}
