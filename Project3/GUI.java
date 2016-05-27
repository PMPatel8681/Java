import javax.swing.*;
import java.awt.*;

public class GUI{

  public GUI(){
  
    JFrame frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1500, 900);
    
 // Set a background for JFrame
     frame.setContentPane(new JLabel(new ImageIcon("ci.jpg")));
    frame.setVisible(true);
  
  }


}