import java.util.*;
import java.text.*;
import javax.swing.border.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;


public class Project3_SecondTEST{



  public static void main(String[] args)
  {

    
    

    
//Creating a JFrame
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new JLabel(new ImageIcon("MOS2.jpg")));
    
//layout
    frame.setLayout(new FlowLayout());
    


    
//Creation of a header JPanel
 /*   JPanel header=new JPanel();
    header.setPreferredSize(new Dimension(1300, 450));
    header.setBackground(new Color(0,0,0,50));
    frame.add(header); */
    
// Adding an instance of the Spaceship class in the header panel    
    frame.add(new Spaceship());  
    
/*
 //Creation of a first JPanel
    JPanel first=new JPanel();
    first.setPreferredSize(new Dimension(1000, 30));
    first.setBackground(new Color(0,0,0,100));
    frame.add(first);
    

//Creation of a second JPanel
    JPanel second=new JPanel();
    second.setPreferredSize(new Dimension(1000, 30));
    second.setBackground(new Color(0,0,0,100));
    frame.add(second);
    
//Creation of a third JPanel
    JPanel third=new JPanel();
    third.setPreferredSize(new Dimension(1000, 30));
    third.setBackground(new Color(0,0,0,100));
    frame.add(third);
    
//Creation of a fourth JPanel
    JPanel fourth=new JPanel();
    fourth.setPreferredSize(new Dimension(1000, 30));
    fourth.setBackground(new Color(0,0,0,100));
    frame.add(fourth);
 
//Creation of a fifth JPanel
    JPanel fifth=new JPanel();
    fifth.setPreferredSize(new Dimension(1000, 30));
    fifth.setBackground(new Color(0,0,0,100));
    frame.add(fifth);
    
//Creation of a sixth JPanel
    JPanel sixth=new JPanel();
    sixth.setPreferredSize(new Dimension(1000, 30));
    sixth.setBackground(new Color(0,0,0,100));
    frame.add(sixth); 
    
//p1 label
    JLabel headerLabel=new JLabel();
    Font font = new Font("Times New Roman", Font.BOLD, 15);
    headerLabel.setFont(font);
    headerLabel.setText(Arrays.toString(p1Array));//Printing the people in a flight to this JLabel!
    headerLabel.setForeground(Color.WHITE);
    first.add(headerLabel);
        
//p2 label
        JLabel p2Label=new JLabel();
        p2Label.setFont(font);
        p2Label.setText(Arrays.toString(p2Array));  //Printing the people in a flight to this JLabel!
        p2Label.setForeground(Color.WHITE);
        second.add(p2Label);     
        
//p3 label
        JLabel p3Label=new JLabel();
        p3Label.setFont(font);
        p3Label.setText(Arrays.toString(p3Array));  //Printing the people in a flight to this JLabel!
        p3Label.setForeground(Color.WHITE);
        third.add(p3Label); 
        
//p4 label
        JLabel p4Label=new JLabel();
        p4Label.setFont(font);
        p4Label.setText(Arrays.toString(p4Array));  //Printing the people in a flight to this JLabel!
        p4Label.setForeground(Color.WHITE);
        fourth.add(p4Label); 
        
//p5 label
        JLabel p5Label=new JLabel();
        p5Label.setFont(font);
        p5Label.setText(Arrays.toString(p5Array));  //Printing the people in a flight to this JLabel!
        p5Label.setForeground(Color.WHITE);
        fifth.add(p5Label); 
        
//p6 label
        JLabel p6Label=new JLabel();
        p6Label.setFont(font);
        p6Label.setText(Arrays.toString(p6Array));  //Printing the people in a flight to this JLabel!
        p6Label.setForeground(Color.WHITE);
        sixth.add(p6Label); 
        
//Test code for mouseListener*********************************************************
  /*      private class mList implements MouseListener{
          
          public void mousePressed (MouseEvent event){}
          public void mouseClicked (MouseEvent event){}
          public void mouseReleased (MouseEvent event){} 
          public void mouseEntered (MouseEvent event){} 
          public void mouseExited (MouseEvent event){} 
        
        } */
    
 
    frame.pack();
    frame.setSize(1300, 700);
    frame.setResizable(false);
    frame.setVisible(true);
    
    
  /*  for(String w : secondArray)
    {
     System.out.println(w);
    } */
  
  }


}