import java.util.Scanner;
public class averageAcceleration{
   public static void main(String[] args){
   //Inputing the values
   Scanner input = new Scanner(System.in);
   System.out.print("Please Enter the value of v0 in m/s: ");
   double v0 = input.nextDouble();
   
   System.out.print("Please Enter the value of v1 in m/s: ");
   double v1 = input.nextDouble();
   
   System.out.print("Please Enter the value of t in s: ");
   double t = input.nextDouble();
   //calculating a
   double a = (v1-v0)/t;
   
   System.out.println("The Average Acceleration is: "+ a +"m/s^2");
   }
}