import java.io.*;
class classGcdBuzz{
  public static void funcBuzzNum(int varNum) {
    if (varNum % 10 == 7 || varNum % 7 == 0){ // Checks if the number is divisible by 7 or ends in 7
      System.out.println(varNum + " is a Buzz Number");
    }
    else{
      System.out.println(varNum + " is not a Buzz number");
    }
  }
  public static void funcGCD(int varNum1, int varNum2) {
    int varNumMax = Math.max(varNum1, varNum2), varGcd = 1; 
    for (int i = 1; i < (int)(varNumMax/2); i++) { // Loop that runs until half the greater number
      if(varNum1 % i == 0 && varNum2 % i == 0){ // Checks if both the number leave no reaminder
        varGcd = i;
      }
    }
    System.out.println("The Greatest Common Divisor of " + varNum1 + " and " + varNum2 + " is " + varGcd);
  }
  public static void main(String[] args) throws IOException{
    BufferedReader objRead = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter two numbers: "); 
    int varNum1 = Integer.parseInt(objRead.readLine()); // Inputs first number
    int varNum2 = Integer.parseInt(objRead.readLine()); // Inputs second number
    // Creates a menu for user to choose
    System.out.println("Enter 1 for finding if the first number is a buzz number");
    System.out.println("Enter 2 for finding if the second number is a buzz number");
    System.out.println("Enter 3 for finding the Greatest Common Divisor of both the numbers");
    System.out.println("Enter any other number to know what is Greatest Common Divisor and Buzz Number");
    byte varInput = Byte.parseByte(objRead.readLine());
    switch (varInput) { // Matches the condition and executes accordingly
      case 1:
        funcBuzzNum(varNum1);
        break;
      case 2:
        funcBuzzNum(varNum2);
        break;    
      case 3:
        funcGCD(varNum1, varNum2);
        break;
      default:
        System.out.println("Greatest Common Divisor: The largest number that can divide two or more numbers perfectly, leaving no remainder Example: The GCD of: 2 & 3 is 1   25 & 35 is 5");
        System.out.println("Buzz Number: Any number which is a multiple of 7 (i.e. can be divided perfectly by 7 leaving no remainder) or which ends in 7  Example: 47, 14");
    }
  }
}