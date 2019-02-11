/*

 Create a function: void printDetails() - the function reads the name of the product (pname), unit price of the product (pr) and quantity of the product (qty). Calculate the total cost of the product, discount 20% if the total cost is more than Rs. 10000/- otherwise no discount and calculate the net price to be paid. Print all the details of the product.
  Write a main function to invoke the above function by passing suitable parameters to display the output.

*/
import java.util.Scanner;
class classFunctions{
  void printDetails(String pname, float pr, int qty){
    float varTotal = pr*qty;
    if(varTotal > 10000){
      varTotal *= 0.8;
    }
    System.out.println("Product Name: " + pname);
    System.out.println("Product Rate: " + pr);
    System.out.println("Product Quantity: " + qty);
    System.out.println("Total Cost :" + varTotal);
  }
  public static void main(String[] args) {
    Scanner objScan = new Scanner(System.in);
    classFunctions objPrint = new classFunctions();
    System.out.println("Enter the name of the Product");
    String varName = objScan.nextLine();
    System.out.println("Enter the rate of the product");
    float varRate = objScan.nextFloat();
    System.out.println("Enter the quantity of the product");
    int varQty = objScan.nextInt();
    printDetails(varName, varRate, varQty);
  }
}