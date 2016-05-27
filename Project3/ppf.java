// Description:
// Author: Pinal Mahesh Patel

public class ppf {
 
 String fName, jTitle, cName, seat, ccType, ccNum, cCell, cusNum, cell, billStatus, exp, empNum;
 int flightNum;
 
// My Constructor
 public ppf(String fName, String jTitle, String cName, String seat, String ccType, String ccNum, String cCell, String cusNum, String cell, String billStatus, String exp, 
      String empNum){
  
  this.fName=fName;
  this.jTitle=jTitle;
  this.cName=cName;
  this.seat=seat;
  this.ccType=ccType;
  this.ccNum=ccNum;
  this.cCell=cCell;
  this.cusNum=cusNum;
  this.cell=cell;
  this.billStatus=billStatus;
  this.exp=exp;
  this.empNum=empNum;

  
  }
 
public String toString(){
  return fName;
    
   // fName + "\t" + jTitle +"\t" + cName +"\t"+ seat+ "\t" + ccType+ "\t" + ccNum+ "\t" + cCell+ "\t" + cusNum + "\t" +  cell +"\t"+ billStatus+"\t" + exp+ "\t" + empNum+"\t" +  flightNum;
 
}



}
