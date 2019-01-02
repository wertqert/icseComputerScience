/*
 * Here, two numbers are inputted, and their LCM and HCF are 
 * found. The HCF is found by checking what is the largest number 
 * that divides both of the input numbers without any remainder
 * whil LCM is found using the following formula:
 *    LCM * HCF == Number1 * Number2
*/
import java.util.Scanner;
class classLcmHcf{
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        System.out.println("Enter a number");
        int varNum1 = objScan.nextInt();
        System.out.println("Enter another number");
        int varNum2 = objScan.nextInt();
        int varNumMax = Math.max(varNum1, varNum2);
        int varNumMin = Math.min(varNum1, varNum2);
        int varHCF = 0;
        int i;
        for (i = 1; i<=(varNumMin/2); i++){
            if (varNumMin%i == 0 && varNumMax%i == 0){
                varHCF = i;
            }
        }
        i = varNumMin;
        if (varNumMin%i == 0 && varNumMax%i == 0){
                varHCF = i;
            }
        int varLCM = (varNumMin*varNumMax)/varHCF;
        System.out.println("The HCF of " + varNumMin + " and " + varNumMax + " is " + varHCF);
        System.out.println("The LCM of " + varNumMin + " and " + varNumMax + " is " + varLCM);
    }
}

// ~schoolboyProgrammer v1.0.0
