/*
 * Question: Print an Infinite loop
 * If you try i!=1, you would still get an inifinte loop. 
 * But on trying i>=1, you will get a series only from 1 to 127
 * 
 * Also, try changing the datatypes and executing the program.
*/
class classInfiniteLoop{
    public static void main(String args[]){
        for (byte i = 1; i >= -128; i++) // try i != 1
            System.out.println(i);
    }
}

// ~schoolboyProgrammer v1.0.1