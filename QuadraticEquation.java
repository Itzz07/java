/**
*
*@author Joel Katongo Zimba 2019052725
*/
import java.util.Scanner;

public class QuadraticEquation{

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("This is a program that computes the roots of the quadratic equation ax^2 + bx + c.\nYou are required to enter the values of a, b and c.");
      
      //Prompt the user to enter a
      System.out.print("Please Enter the value of a: ");
      double a = s.nextDouble();
      
      //Prompt the user to enter b
      System.out.print("Please Enter the value of b: ");
      double b = s.nextDouble();
     
      //Prompt the user to enter c
      System.out.print("Please Enter the value of c: ");
      double c = s.nextDouble();
      
      //Compute the roots using the Compute class
      double [] x = Compute.computequadraticroots(a,b,c);
      
      //Display the results
      System.out.print("The roots of the quadratic equation are " + x[0] + " and " + x[1]);
   }
}


class Compute {
   
   //This method computes the roots of a quadratic equation
   public static double [] computequadraticroots(double a, double b, double c){
      //Declare and Create an array x
      double [] x = new double [2]; 
      //Computes the first root
      x[0] = (-b+Math.sqrt(Math.pow(-b,2) - 4*a*c))/2*a;
      //Computes the second root
      x[1] = (-b-Math.sqrt(Math.pow(-b,2) - 4*a*c))/2*a;
      //Returns the roots
      return x;
   }
}