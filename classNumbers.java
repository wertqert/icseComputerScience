import java.io.*;
import java.lang.Math;

/* This Program will explore the following types of numbers: 
   * 1. Neon Number: The sum of the digits of the square is equal to the number itself. Example: 9 
   * 2. Palindrome Number: The number is equal to the reversed number. Example: 121, 11 
   * 3. Armstrong Number: The cube of the digits of the number is equal to the number itself. Example: 153 
   * 4. Automorphile number: The square of a number contains the number as its last digits. Example: 25 
   * 5. Perfect Number: The sum of its factors (apart from the number itself) is equal to the number.           Example: 6 
   * 6. Buzz Number: The units digit of the number is 7 or the number itself is a multiple of 7 Example: 47, 14 
   * 7. Spy Number: The sum of the digits is equal to its products. Example: 1124 
   * 8. Pronic Number: The number is a product of two consecutive numbers Example: 42 
   * 9. Niven Number: The number is divisible by the sum of its digits. Example: 21
   * 10. Emirp Number: The number is prime both front and back wards. Example: 13 (Both 13 and 31 are primes)
   * 11. Disarium Number: The sum of the digits powered to it's position if equal to the number. Example: 89 (8^1 + 9^2 = 89)
*/
import java.util.Scanner;   
class classNumbers{
  
    public static boolean funcNeonNum(int varNum){
        int varSquare = (int)varNum * varNum; // Find the square 
        int varSum = 0;
        // Loop for extracting digits and adding them
        while (varSquare > 0) {
            byte varDigit = (byte)(varSquare % 10); // Extracts the last digit
            varSum += varDigit; // Adds the digit to a common variable
            varSquare /= 10; // Truncates the last digit (or) decrements
        }
        // Return Values
        if (varSum == varNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean funcPalindromeNum(int varNum){
        int varReverse = 0;
        byte varDigit;
        int varTemp = varNum;
      
        //Loop for reversing the number
        while (varTemp != 0) { 
            varDigit = (byte)(varTemp % 10); // Extracts last digit
            varReverse *= 10 // Multiplies the current value of varReverse with 10
            varReverse += varDigit; // Adds current value of varReverse to varDigit
            varTemp /= 10; // Decrements value
        }
      
        // Returns value
        if (varReverse == varNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean funcArmstrongNum(int varNum){
        int varSumCubes = 0;
        int varTemp = varNum;
        // Extracts the cube of the last digit (Refer to first and second function for details on this
        while (varTemp > 0) {
            byte varDigit = (byte)(varTemp % 10);
            varSumCubes += (int)Math.pow(varDigit, 3); // Finds cube of last digit
            varTemp = varTemp / 10;
        }
        // Returns value
        if (varSumCubes == varNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean funcAutomorphileNum(int varNum) {
        int varSquare, varTemp = varNum;
        byte varPower= 0;
        varSquare = (int)Math.pow(varNum, 2);
        while (varTemp > 0){
            varTemp /= 10;
            varPower++;
        }
        int varCheck = varSquare % (int)Math.pow(10, varPower);
        if(varCheck == varNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean funcPerfectNum(int varNum) {
        int varSum = 0;
        // Finds if the number is a prime number or not
        for (int i = 1; i <= (int)(varNum/2); i++) {
            if ((varNum % i) == 0) { // Checks if the number is divisible or not (Whether remainder is 0 or not)
                varSum += i; // If it is a factor, adds it to the current value of varSum
            } 
        }
        // Returns value
        if (varSum == varNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean funcBuzzNum(int varNum){
        if (varNum % 10 == 7 || varNum % 7 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean funcSpyNum(int varNum) {
        short varSum = 0;
        long varProduct = 1;
        // Calculating sum and product of digits
        while (varNum > 0) { 
            byte varDigit = (byte)(varNum % 10); // Extracts last digit
            varNum /= 10; // Decrements
            varSum += varDigit; // Sum of digits
            varProduct *= varDigit; // Product of Digits
        }
        // Return value
        if (varSum == varProduct) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean funcPronicNum(int varNum) {
        boolean varAns = false;
        // Loop for checking 
        for (int i = 1; i <= (int)(varNum/2); i++) {
            if (i*(i+1) == varNum) { // Checks if it is a product of two consecutive numbers
                varAns = true;
            }
        }
        return varAns;
    }

    public static boolean funcNivenNum(int varNum) {
        int varTemp = varNum, varSum = 0; 
        // Loop for finding sum of digits
        while (varTemp > 0) {
            byte varDigit = (byte)(varTemp % 10);
            varSum += varDigit;
            varTemp /= 10;
        }
        if (varNum % varSum == 0){ // Checks if the number is divisible by the sum of letters
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean funcEmirpNum(int varNum) {
        int varFactors = 1, varFactors1 = 1, varReverse = 0, varTemp = varNum;    
        //Loop for finding if a number is prime or not
        for (int i = 1; i < (int)(varNum/2); i++) {
            if(varNum % i == 0){ // Checks if number is divisible by the loop variable
                varFactors++; // Increments varFactors by 1
            }
        } 
        // Reverses number (Refer to funcPalindromeNum() for details)
        while (varTemp > 0) {
            byte varDigit = (byte)varTemp % 10;
            varReverse *= 10;
            varReverse += varDigit;
            varTemp /= 10;
        }       
        // Loop for finding if reverse num is also prime
        for (int i = 1; i < (int)(varNum/2); i++) {
            if(varReverse % i == 0){
                varFactors1++;
            }
        }
        if (varFactors == varFactors1 && varFactors == 2){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean funcDisariumNum(int varNum) {
        int varTemp1 = varNum, varTemp2 = varNum, varSum = 0;
        byte varCount = 0;
        // Finds out number of digits in a number
        for (; varTemp1 > 0; varTemp1 /= 10) {
            varCount++;
        }
        // Finds the sum of the digits powered positionally
        for(; varCount > 0; varCount--, varTemp2 /= 10){
            byte varDigit = (byte)(varTemp2 % 10);
            varSum += Math.pow(varDigit, varCount);
        }
        if (varNum == varSum) {
            return true;
        } else {
            return false;
        }
    }

    // Function to print without repeating the statement
    public static void funcPrint(int varNum, String varType, boolean varCheck){
        if (varCheck == true) {
            System.out.println(varNum + " is a " + varType + " number");
        }
        else {
            System.out.println(varNum + " is not a " + varType + " number");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader objRead = new BufferedReader(new InputStreamReader(System.in)); // Creates object for BufferedReader
        System.out.println("Enter a number : ");
        int varNum = Integer.parseInt(objRead.readLine()); // Inputs number
        funcPrint(varNum, "Neon", funcNeonNum(varNum));
        funcPrint(varNum, "Palindrome", funcPalindromeNum(varNum));
        funcPrint(varNum, "Armstrong", funcArmstrongNum(varNum));
        funcPrint(varNum, "Automorphile", funcAutomorphileNum(varNum));
        funcPrint(varNum, "Perfect", funcPerfectNum(varNum));
        funcPrint(varNum, "Buzz", funcBuzzNum(varNum));
        funcPrint(varNum, "Spy", funcSpyNum(varNum));
        funcPrint(varNum, "Pronic", funcPronicNum(varNum));
        funcPrint(varNum, "Niven", funcNivenNum(varNum));
        funcPrint(varNum, "Emirp", funcEmirpNum(varNum));
        funcPrint(varNum, "Disarium", funcDisariumNum(varNum));
    }
}
//~ schoolboyProgrammer v1.0.1
