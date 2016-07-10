import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.*;   
import javax.swing.*;   

public class Project1_PinalPatel{
  
  public static void main(String[] args){
    
    int option, selected_seat = 0, bags = 1, toGUI = 0;
    String name = " ", selectedFlight = " ", origin = "ATL", destination = "MIA";
    String assignedGate = " ", assigned_depTime = " ", assigned_boaTime = " ", date = "Dec 30 2014";
    String bZone = "D3", fClass = "1ST CL";
    double price = 0.0;
    
    
    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    System.out.println("PLEASE ENTER YOUR FIRST AND LAST NAME: ");
    name = scan.nextLine();
    
    System.out.println("Hello " + name + "!" + "\n");
  
    Flight one = new Flight("QL456", "ATLANTA", "MIAMI", "3:10PM", "4:20PM", "FIRST", "A50", 988.75, 25.00);
    Flight two = new Flight("QL457", "ATLANTA", "MIAMI", "5:30PM", "6:40PM", "FIRST", "A10", 1000.76, 25.00);
    Flight three = new Flight("QL458", "ATLANTA", "MIAMI", "7:30AM", "8:40AM", "FIRST", "A5", 1100.56, 25.00);
    
    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
    
    System.out.println("\n" + "Please select option 1, 2, or 3 from the list above!");
    
    // The flight option picked by the user is stored in "option"!
    option = scan.nextInt();
    
    // Extra blank line statement
     System.out.println(); 
    
    // Seat option outputs based on flight selected!
    if (option == 1){                              
      System.out.println(one.QL456());
      selectedFlight = "QL456";
      assignedGate = "A50";
      assigned_boaTime = "3:10PM"; 
      assigned_depTime = "4:20PM";
      price = one.tPrice();
      }
    else
      if(option == 2){
      System.out.println(two.QL457());
      selectedFlight = "QL457";
      assignedGate = "A10";
      assigned_boaTime = "5:30PM"; 
      assigned_depTime = "6:40PM";
      price = two.tPrice();
    }
    else
      if(option == 3){
      System.out.println(three.QL458());
      selectedFlight = "QL458";
      assignedGate = "A5";
      assigned_boaTime = "7:30AM"; 
      assigned_depTime = "8:40AM";
      price = three.tPrice();
    }
    
    // Selected seat stored so that it can be used to display on the boarding pass!
    selected_seat = scan.nextInt(); 
    
    System.out.print("Thank You " + name + "." + " You have selected flight " + selectedFlight + " and your seat# is " + selected_seat + ".");
    System.out.println(" Your total price is " + fmt.format(price));
    System.out.println("Please press the number '1' to continue: ");
    toGUI = scan.nextInt();

    
    
//*************************************************************************************************************
// BOARDING PASS GUI CODE
//
//*************************************************************************************************************
    
 if(toGUI == 1){
   
    JFrame frame = new JFrame("BOARDING PASS");  
    
//Primary panel
    JPanel pPanel = new JPanel();
    FlowLayout fLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
    pPanel.setLayout(fLayout);
    pPanel.setBackground(Color.white);
    pPanel.setPreferredSize(new Dimension(1000, 250));
    
//Test Panel
    JPanel test = new JPanel();
    test.setBackground(Color.white);
    test.setPreferredSize(new Dimension(120, 35));
    JLabel flightDisplay = new JLabel("Flight : Delta  " + selectedFlight);
    test.add(flightDisplay);
    pPanel.add(test);
    
//Test Panel2
    JPanel test2 = new JPanel();
    test2.setBackground(Color.white);
    test2.setPreferredSize(new Dimension(600, 35));
    pPanel.add(test2);

    
//Test Panel 3
    JPanel test3 = new JPanel();
    test3.setBackground(Color.white);
    test3.setPreferredSize(new Dimension(230, 35));
    JLabel bPassString = new JLabel("BOARDING PASS");
    test3.add(bPassString);
    pPanel.add(test3);

//Test Panel 4
    JPanel test4 = new JPanel(new FlowLayout(FlowLayout.LEFT)); //The parameter here aligns the text to the left in the label
    test4.setBackground(Color.white);
    test4.setPreferredSize(new Dimension(200, 35));
    JLabel nameDisplay = new JLabel("Passenger: " + name); 
    test4.add(nameDisplay);
    pPanel.add(test4);
    
//Test Panel 5
    JPanel test5 = new JPanel();
    test5.setBackground(Color.white);
    test5.setPreferredSize(new Dimension(520, 35));
    JLabel originDisplay = new JLabel("Origin: " + origin);
    JLabel destDisplay = new JLabel("        Destination: " + destination);
    test5.add(originDisplay);
    test5.add(destDisplay);
    pPanel.add(test5);
    
//Test Panel 6
    JPanel test6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    test6.setBackground(Color.white);
    test6.setPreferredSize(new Dimension(225, 35));
    JLabel r_nameDisplay = new JLabel("Passenger: " + name);
    test6.add(r_nameDisplay);
    pPanel.add(test6);
    
//Test Panel 7
    JPanel test7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    test7.setBackground(Color.white);
    test7.setPreferredSize(new Dimension(730, 35));
    JLabel gateDisplay = new JLabel("Gate: " + assignedGate);
    
    JLabel boarding_time = new JLabel("               Boarding Time: " + assigned_boaTime + 
      "               Departure Time: " + assigned_depTime + "               Date: " + date + 
      "          Seat: " + selected_seat);
    
    test7.add(gateDisplay);
    test7.add(boarding_time);
    pPanel.add(test7);
    
//Test Panel 8
    JPanel test8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    test8.setBackground(Color.white);
    test8.setPreferredSize(new Dimension(230, 35));
    JLabel f2Display = new JLabel("Flight: " + selectedFlight + "         Date: " + date);
    test8.add(f2Display);
    pPanel.add(test8);
    
//Test Panel 9
    JPanel test9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    test9.setBackground(Color.white);
    test9.setPreferredSize(new Dimension(390, 35));
    
    JLabel bagDisplay = new JLabel("Bag(s): " + bags + 
       "                 Boarding Zone: " + bZone + "          Class: " + fClass);
    
    test9.add(bagDisplay);
    pPanel.add(test9);
    
//Upc Panel
    JPanel up = new JPanel(new FlowLayout(FlowLayout.LEFT));
    up.setBackground(Color.white);
    up.setPreferredSize(new Dimension(330, 35));
    ImageIcon dUpc = new ImageIcon("E:\\CSCI1301-Patel\\Project1\\Example\\upc.jpg");
    JLabel upcLabel = new JLabel(dUpc, SwingConstants.LEFT);
    up.add(upcLabel);
    pPanel.add(up); 
    
//Test Panel 10
    JPanel test10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    test10.setBackground(Color.white);
    test10.setPreferredSize(new Dimension(230, 35));
    JLabel o2Display = new JLabel("Org: " + origin + "   Des: " + destination + "  Seat: " + selected_seat + "  " + fClass);
    test10.add(o2Display);
    pPanel.add(test10);
    
// Test Panel 11
    JPanel test11 = new JPanel();
    test11.setBackground(Color.white);
    test11.setPreferredSize(new Dimension(730, 35));
    ImageIcon di = new ImageIcon("E:\\CSCI1301-Patel\\Project1\\Example\\Dstrip.jpg");
    JLabel dPic = new JLabel(di, SwingConstants.RIGHT);
    test11.add(dPic);
    pPanel.add(test11); 
    
// UPC2 Panel
    JPanel up2 = new JPanel();
    up2.setBackground(Color.white);
    up2.setPreferredSize(new Dimension(230, 35));
    ImageIcon upc2 = new ImageIcon("E:\\CSCI1301-Patel\\Project1\\Example\\upc2.jpg");
    JLabel rUpc = new JLabel(upc2, SwingConstants.RIGHT);
    up2.add(rUpc);
    pPanel.add(up2);

    frame.getContentPane().add(pPanel);//TEST
    frame.pack();
    frame.setVisible(true); 
    
      }
    
   }
  
}
