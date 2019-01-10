/*
 * Description: This deals with the basics of Java. I would not be dealing with tokens, datatypes and OOPs 
 * concepts, as they come under the theory, and can't be explained as a program. I would request you to look
 * up any decent website for the same, or you can also DM me on Quora (Monish Singhal) or Hangouts
 * (monishsinghal7@gmail.com)
 * 
 * This would be explaining the different methods for printing, and variable declaration and 
 * initailisation.
 */

class classBasics{
   public static void main(String args[]){ 
       //main function is compulsary in Java, without which a program throws up an error
       
       // Variable Declaration and initialisation is an important thing in Java. In general, a variable is a 
       // non-constant value that it stored by it. The steps can be done in multiple steps or a single step.
       
       /* This is known as Declaration, wherein the variable is named and given a datatype. Rules for naming 
       the variable can be seen here: 
        1. All variable names must begin with a letter of the  alphabet, an underscore, or ( _ ), or a 
          dollar sign ($). The convention is to always use a letter of the alphabet. The dollar sign and the
          underscore are discouraged.
        2. After the first initial letter, variable names may also contain letters and the digits 0 to 9.  
          No spaces or special characters are allowed. 
        3. The name can be of any length, but don't get carried away.  Remember that you will have to type 
          this name.
        4. Uppercase characters are distinct from lowercase characters.  Using ALL uppercase letters are 
          primarily used to identify constant variables.  Remember that variable names are case-sensitive.
        5. You cannot use a java keyword (reserved word) for a variable name.*/
        
        //Examples of good variable names:
        int varName, DateAndTime, temporary, var_num_2, i /*In case of loops*/;
        
        // Examples of bad variable names:
        int hello, goodMorning, a, b, mhdcbudcb;
        
        
       // We will also deal with the printing mechanism in Java. 
       //     In Java, Prining is usually done in two ways:
       //  1. System.out.print(): This prints whatever is given to it and DOES NOT shift to the next line.
       //  2. System.out.println(): This prints whatever is given to it and SHIFTS to the next line. 
       // Let us check out a practical exmaple of the same.
       System.out.print("This is a sentence");
       System.out.println("This is another sentence");
       /* The output will come like this:
          This is a sentenceThis is another sentence
          
          Try executing the same program once more, with switching SOP() and SOPln()
          
          Printing variables is easier. Take a look:
          */
         int varTest = 5;
         System.out.println(varTest);
         // Output = 5
                 
    } 
}
//~schoolboyProgrammer