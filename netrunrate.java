import java.util.Scanner;
public class netrunrate{
    public static void cricket(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter scores for");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double d=sc.nextDouble();
    double e=sc.nextDouble();
    double f=sc.nextDouble();
    double g=sc.nextDouble();
    System.out.println("Enter overs for");
    double a1=sc.nextDouble();
    double b1=sc.nextDouble();
    double c1=sc.nextDouble();
    double d1=sc.nextDouble();
    double e1=sc.nextDouble();
    double f1=sc.nextDouble();
    double g1=sc.nextDouble();
    System.out.println("Enter scores against");
    double a2=sc.nextDouble();
    double b2=sc.nextDouble();
    double c2=sc.nextDouble();
    double d2=sc.nextDouble();
    double e2=sc.nextDouble();
    double f2=sc.nextDouble();
    double g2=sc.nextDouble();
    System.out.println("Enter overs against");
    double a3=sc.nextDouble();
    double b3=sc.nextDouble();
    double c3=sc.nextDouble();
    double d3=sc.nextDouble();
    double e3=sc.nextDouble();
    double f3=sc.nextDouble();
    double g3=sc.nextDouble();
    double runrate_for,runrate_against,nrr;
    runrate_for=(a+b+c+d+e+f+g)/(a1+b1+c1+d1+e1+f1+g1);
    runrate_against=(a2+b2+c2+d2+e2+f2+g2)/(a3+b3+c3+d3+e3+f3+g3);
    nrr=runrate_for-runrate_against;
    System.out.println("The average run rate is "+runrate_for);
    System.out.println("The net run rate is "+nrr);
}
}
    
    
   