package Common;

import java.awt.Image;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CommonFuntions {
        
    public void setLogoIcon(JFrame jFrame) {
        
        try {
            
            Image image = ImageIO.read(getClass().getResource("/Images/Logo.png"));
            jFrame.setIconImage(image);
        
        }
        
        catch(Exception e) {
        
            System.out.println("Logo Icon loading fail... " + e);
        
        }
    }
    
    public void setPageSize(JFrame jFrame) {
    
        jFrame.setSize(900, 500);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
    }
    
    public void setDateTime(JLabel jLabel) {
           
        Thread DT = new Thread() {
             
            public void run() {
                
                try {
                
                    for(;;) {
                             
                        Date datetime = new Date();
                        
                        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm aa");
                        String time = timeformat.format(datetime);
                             
                        SimpleDateFormat dateformat = new SimpleDateFormat("E, dd MMM YYYY");
                        String date = dateformat.format(datetime);
                    
                        jLabel.setText(date + " - " + time);
                        
                        sleep(1000);
                    
                    }
                } 
                
                catch(Exception e) {
                    
                    System.out.println("Data & Time not work properly... " + e);
                
                }
            }
        };
        
        DT.start();
        
    }
    
    public String getTimeState() {
        
        Date datetime = new Date();
                        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
        String time = timeFormat.format(datetime);
        
        String [] timearr1 = time.split(" ");
        
        if(timearr1[1].equals("AM")) {
        
            return "Good Morning";
            
        }
        
        else if(timearr1[1].equals("PM")) {
        
            String [] timearr2 = timearr1[0].split(":");
            
            int hour = Integer.parseInt(timearr2[0]);
            
            if(hour < 5) {
            
                return "Good Afternoon";
            
            }
            
            else {
            
                return "Good Evening";
                
            }
        }
        
        return "Good Day";
        
    }
}