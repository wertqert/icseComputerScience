/*
Define a class ParkingLot with the following desciption:
instance variables/data members:
int vno: to store the vehicle number
int hours: To store the number of hours the vehicle is parked in the parking lot
double bill: To store the bill amount
Member methods:
void input(): To input and store vno and hours
void calculate(): To compute the parking charges at the rate of Rs. 3 for the first hour or part thereof, and Rs. 1.50 for each additional hour or part thereof.
void display(): To display the detail
Write a main method to create an object of the class and call the above methods.
*/
import java.util.Scanner; // Preffered over BufferedReader due to error handling capabilities via boolean functions
class ParkingLot{
  // Creation of instance variables that will be called using call by reference method
  int vno = 0, hours = 0;
  double bill = 0;

  void input (ParkingLot objVar){
    Scanner objScan = new Scanner(System.in);
    System.out.println("Enter the last four digits of your vehicle number: Ex: If my vehicle number is DL 05 ID 7, I will enter 0007");
    // If-Else-1-If Begins
    if (objScan.hasNextInt() == true) {
      objVar.vno = objScan.nextInt();
      // If-Else-2-If Begins
      if (objVar.vno > 0) {
        System.out.println("Enter the time parked Ex: If you parked your car for 5 1/4 hours, you would enter: Hours --> 6");
        System.out.print("Hours --> ");
        // If-Else-3-If Begins
        if (objScan.hasNextInt() == true) {
          objVar.hours = objScan.nextInt();
          // If-Else-4-If Begins
          if (objVar.hours < 1) {
            System.out.println("You have entered an invalid input. Please enter a positive number only");
          } // If-Else-4-If Ends
        } // If-Else-3-If Ends
        else { // If-Else-3-Else Begins
          System.out.println("You have entered an invalid input. Please enter a number only");
        } // If-Else-3-Else Ends
      } // If-Else-2-If Ends
      else { // If-Else-2-Else Begins
        System.out.println("You have entered an invalid input. Please enter a positive number only");
      } // If-Else-2-Else Ends
    } // If-Else-1-If Ends
    else { // If-Else-1-Else Begins
      System.out.println("You have entered an invalid input. Please enter a number only");
    } // If-Else-1-Else Ends
  }

  void calculate(ParkingLot objVar){
    for (byte i = 1; i <= objVar.hours; i++) {
      if(i == 1){
        objVar.bill += 3.0;
      }
      else{
        objVar.bill += 1.50;
      }
    }
  }

  void display(ParkingLot objVar){
    System.out.println('\n');
    System.out.println("PARKING BILL");
    System.out.println("Vehicle Number: " + objVar.vno);
    System.out.println("No of Hours Parked: " + objVar.hours);
    System.out.println("Total Bill Amount: " + objVar.bill);
  }

  public static void main(String[] args) {
    ParkingLot objAccess = new ParkingLot();
    objAccess.input(objAccess);
    objAccess.calculate(objAccess);
    objAccess.display(objAccess);
  }
}
