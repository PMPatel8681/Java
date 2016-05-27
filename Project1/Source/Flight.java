// This class includes a constructor and methods to make initial flight objects instaniated under the main method
// CREATED BY: Pinal M Patel
// DATE: 9/22/2014

import java.text.NumberFormat;


public class Flight{

private String flightNUM;
private String boardingT, departureT; 

private int S1 = 20, S2 = 32, S3 = 40, S4 = 22, S5 = 66, S6 = 33;
private int T1 = 12, T2 = 13, T3 = 68, T4 = 77, T5 = 31, T6 = 67;
private int U1 = 55, U2 = 65, U3 = 24, U4 = 29, U5 = 39, U6 = 19;

private String flight_class, flight_origin, flight_destination, gate;
private double ticket_price, bagFee;
private final double TAX = 0.15;

NumberFormat fmt = NumberFormat.getCurrencyInstance();



//****************************************************************************************************
// This is the constructor for the Flight class.
// No return value
// Same name as the class is used
//****************************************************************************************************

public Flight(String flight_number, String fOrigin, String fDestination, String boarding_time, String departure_time, 
              String fClass,  String fGate, double tPrice, double bFee)
  {
     flightNUM = flight_number;
     boardingT = boarding_time;
     departureT = departure_time;
     flight_class = fClass;
     flight_origin = fOrigin;
     flight_destination = fDestination;
     gate = fGate;
     ticket_price = tPrice;
     bagFee = bFee;
     

   }

//****************************************************************************************************
// Three methods below return a String output with seat options
//
//
//****************************************************************************************************

public String QL456()
     {
  return "PLEASE TYPE IN THE SEAT NUMBER THAT YOU WISH TO SELECT FROM THE LIST BELOW: " + "\n" + "\n" + "SEAT: " 
    + S1 + "\n" + "SEAT: " + S2 + "\n" + "SEAT: " + S3 + "\n"+ "SEAT: " + S4 + "\n"+ "SEAT: "  + S5 + "\n" + "SEAT: " 
    + S6 + "\n";
     }


public String QL457()
     {
  return "PLEASE TYPE IN THE SEAT NUMBER THAT YOU WISH TO SELECT FROM THE LIST BELOW: " + "\n" + "\n" + "SEAT: " 
    + T1 + "\n" + "SEAT: " + T2 + "\n" + "SEAT: " + T3 + "\n"+ "SEAT: " + T4 + "\n"+ "SEAT: " + T5 + "\n" + "SEAT: " 
    + T6 + "\n";
     }


public String QL458()
     {
  return  "PLEASE TYPE IN THE SEAT NUMBER THAT YOU WISH TO SELECT FROM THE LIST BELOW: " + "\n" + "\n" + "SEAT: " 
    + U1 + "\n" + "SEAT: " + U2 + "\n" + "SEAT: " + U3 + "\n"+ "SEAT: " + U4 + "\n"+ "SEAT: " + U5 + "\n" + "SEAT: " 
    + U6 + "\n";
     }


//****************************************************************************************************
// This method also returns a String.
/* This method allows us to output selected attributes of an object when used in the parameter of a
   a print statement! */
//****************************************************************************************************

public String toString()
   {
     return "FLIGHT: " + flightNUM + "     ORIGIN: " + flight_origin + "     DESTINATION: " + flight_destination 
       + "     BOARDING TIME: " + boardingT + "     DEPARUTRE TIME: " + departureT + "     CLASS: " + flight_class +
       "     GATE: " + gate + "     PRICE: " + fmt.format(ticket_price) + "     FEE/BAG: " + fmt.format(bagFee);
   }



//****************************************************************************************************
// Both of these methods return a double!
// tPrice() calculates the total price with tax and a bag fee!
//
//****************************************************************************************************
public double getPrice()
     {return ticket_price;}

public double tPrice()
     {return (ticket_price*TAX) + ticket_price + bagFee;}

}