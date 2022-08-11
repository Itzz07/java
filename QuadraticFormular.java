import java.util.Scanner;

public class QuadraticFormular {
   public static void main(String[] args){
   
   //Declaring Variables
   double x;
   double x1;
   
   //Enter Variables
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the value of a: ");
   double a = input.nextDouble();
   
   System.out.print("Enter the value of b: ");
   double b = input.nextDouble();
   
   System.out.print("Enter the value of c: ");
   double c = input.nextDouble();
   
   //Compute x
   x = (-b+Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
   x1 = (-b-Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
   
   System.out.println("The Roots Of The Quadratic Equation Are: " + x + " and " + x1);
   
   }
}