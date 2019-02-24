/*
Question: Write a class to overload a function num_calc() as follows:
(i) void num_calc(int num, char ch) with one integer and one character argument, computes the square of the integer argument if choice ch is 's' otherwise finds it's cube.
(ii) void num_calc(int a, int b, char ch) with two integer arguments and one character argument. It computes the product of the inetger arguments if ch is 'p' else adds the integers.
*/
import java.util.Scanner;
class classOverloadFunc{
  void num_calc(int num, char ch){
    if (ch == 's') {
      System.out.println("The square of " + num + " is " + Math.pow(num,2));
    } else {
      System.out.println("The cube of " + num + " is " + Math.pow(num,3));
    }
  }

  void num_calc(int a, int b, char ch){
    if(ch == 'p'){
      System.out.println("The product of " + a + " and " + b + " is "+ (a*b));
    }
    else {
      System.out.println("The sum of " + a + " and " + b + " is "+ (a+b));
    }
  }

  public static void main(String[] args) {
    Scanner objScan = new Scanner(System.in);
    classOverloadFunc objAccess = new classOverloadFunc();
    System.out.println("To find the sum/product of two numbers, enter #(octothrope)");
    System.out.println("Enter any other character to find the square or the cube of a number");
    System.out.println("Note: only the first character entered shall be considered, others will be truncated");
    char varInput = objScan.next().charAt(0);
    int varNum1 = 0, varNum2 = 0;
    char varLetter;
    if (varInput == '#') { // If-Else-1-If begins
      System.out.println("Enter the first number: ");
      if (objScan.hasNextInt() == true) { // If-Else-2-If begins
          varNum1 = objScan.nextInt();
          System.out.println("Enter the second number: ");
        if (objScan.hasNextInt() == true) { // If-Else-3-If begins
          varNum2 = objScan.nextInt();
          System.out.println("To find the product of these numbers, enter p.");
          System.out.println("To find the sum of these numbers, enter any other charecter");
          System.out.println("Note: only the first character entered shall be considered, others will be truncated");
          varLetter = objScan.next().charAt(0);
          objAccess.num_calc(varNum1, varNum2, varLetter);
        } // If-Else-3-If ends
        else { // If-Else-3-Else begins
          System.out.println("You have entered an illegal expression, due to which the program has terminated.");
        } // If-Else-3-Else ends
      } // If-Else-2-If ends
      else { // If-Else-2-Else ends
        System.out.println("You have entered an illegal expression, due to which the program has terminated.");
      } // If-Else-2-Else ends
    } // If-Else-1-If ends
    else { // If-Else-1-Else begins
      System.out.println("Enter a number: ");
      if (objScan.hasNextInt() == true) { // If-Else-2-If begins
        varNum1 = objScan.nextInt();
        System.out.println("Enter s for finding the square of the number");
        System.out.println("Enter any other character to find the cube of the number");
        System.out.println("Note: only the first character entered shall be considered, others will be truncated");
        varLetter = objScan.next().charAt(0);
        objAccess.num_calc(varNum1, varLetter);
      } // If-Else-2-If ends
      else { // If-Else-2-Else begins
        System.out.println("You have entered an illegal expression, due to which the program has terminated.");
      } // If-Else-2-Else ends
    } // If-Else-1-Else ends
  }
}