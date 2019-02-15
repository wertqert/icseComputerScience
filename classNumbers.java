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
        int varSquare = (int)varNum * varNum;
        int varSum = 0;
        while (varSquare > 0) {
            int varDigit = varSquare % 10;
            varSum += varDigit;
            varSquare /= 10;
        }
        if (varSum == varNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean funcPalindromeNum(int varNum){
        int varReverse = 0;
        int varDigit;
        int varTemp = varNum;
        while (varTemp != 0) {
            varDigit = varTemp % 10;
            varReverse *= 10;
            varReverse += varDigit;
            varTemp /= 10;
        }
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
        while (varTemp > 0) {
            int varDigit = varTemp % 10;
            varSumCubes += (int)Math.pow(varDigit, 3);
            varTemp = varTemp / 10;
        }
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
        for (int i = 1; i <= (int)(varNum/2); i++) {
            if ((varNum % i) == 0) {
                varSum += i;
            } 
        }
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
        while (varNum > 0) {
            byte varDigit = (byte)(varNum % 10);
            varNum /= 10;
            varSum += varDigit;
            varProduct *= varDigit;
        }
        if (varSum == varProduct) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean funcPronicNum(int varNum) {
        boolean varAns = false;
        for (int i = 1; i <= (int)(varNum/2); i++) {
            if (i*(i+1) == varNum) { 
                varAns = true;
            }
        }
        return varAns;
    }

    public static boolean funcNivenNum(int varNum) {
        int varTemp = varNum, varSum = 0;
        while (varTemp > 0) {
            byte varDigit = (byte)(varTemp % 10);
            varSum += varDigit;
            varTemp /= 10;
        }
        if (varNum % varSum == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean funcEmirpNum(int varNum) {
        int varFactors = 1, varFactors1 = 1, varReverse = 0, varTemp = varNum;        
        for (int i = 1; i < (int)(varNum/2); i++) {
            if(varNum % i == 0){
                varFactors++;
            }
        } 
        while (varTemp > 0) {
            byte varDigit = (byte)varTemp % 10;
            varReverse *= 10;
            varReverse += varDigit;
            varTemp /= 10;
        }       
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
        for (; varTemp1 > 0; varTemp1 /= 10) {
            varCount++;
        }
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

    public static void funcPrint(int varNum, String varType, boolean varCheck){
        if (varCheck == true) {
            System.out.println(varNum + " is a " + varType + " number");
        }
        else {
            System.out.println(varNum + " is not a " + varType + " number");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader objRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int varNum = Integer.parseInt(objRead.readLine());
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
