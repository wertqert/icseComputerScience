/*  
 * This program is attempting to caluculate compoun interests 
 * for varying amounts and principals. Also, this is a program
 * that terminates only on a specific condition i.e. user inputs
 * 0.
*/
import java.util.Scanner;
class classDoWhileLoop{
  public static void main(String args[]){
    Scanner objScan = new Scanner(System.in);
    float varRate;
    int varContinue;
    do {
      System.out.println("Enter 1 for Cumilative Interest Scheme");
      System.out.println("Enter 2 for Annual Interest Scheme");
      int varScheme = objScan.nextInt();
      switch (varScheme) {
        case 1:
          System.out.println("For how many years should it continue for? (Min: 3; Max: 5)");
          int varNumYears = objScan.nextInt();
          if (varNumYears >= 3 && varNumYears <= 5){
            System.out.println("Enter the principal");
            float varPrincipal = objScan.nextInt();
            float varAmount = (float)(varPrincipal *(Math.pow(1+(0.1*11.5), varNumYears)));
            System.out.println("The amount at the end is " + varAmount);
          }
          else{
            System.out.println("The input entered is incorrect.");
          }
          break;
          case 2:
          System.out.print("For how many years should it continue for? (Min: 1; Max: 5)");
          varNumYears = objScan.nextInt();
          if (varNumYears >= 1 && varNumYears <= 5){
            System.out.println("Enter the principal");
            int varPrincipal = objScan.nextInt();
            varRate = 10;
            int varInterest = 0;
            for(int i = 1; i<= varNumYears; i++){
              varInterest +=  0.01*varPrincipal*varRate;
              if (i<= 2){
                varRate += 0.5;
              }
            }
            System.out.println("The interest acummalated = " + varInterest);
          }
          else{
              System.out.println("The input is incorrect.");
            }
          break;
        default:
          System.out.println("The input entered is wrong.");
          break;
      }
      System.out.println("Enter 0 to exit (to continue, enter a number)");
      varContinue = objScan.nextInt();
    } while (varContinue!=0);
  }
}


// ~schoolboyProgrammer v1.0.0