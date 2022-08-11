/**
*
*@author Joel Katongo Zimba 2019052725
*/
import java.util.Scanner;

public class NewtonsMethod{

   public static void main(String args[]) {
      //Create scanner   
      Scanner input = new Scanner(System.in);
      
      //Prompt the user to enter the coeffients of the polynomial     
      System.out.print("Enter the number of the coeffients of the polynomial: ");
      int numberOfCoe = input.nextInt();
      
      //Create and initialize an array
      double[][] coe = new double[2][numberOfCoe];
            
      //Entering the variables in the array
      for(int i=0; i<2;i++){
         for(int j=0; j<numberOfCoe;j++){
            if(i==0){
            System.out.print("Enter the coeffient of the polynomial from Right To Left: ");
            coe[i][j] = input.nextDouble();
            }
            
            if(i==1){
            System.out.print("Enter the exponent Respectively: ");
            coe[i][j] = input.nextDouble();  
            }
         }
      }
      
      
      System.out.print("Enter the initial point of approximation: ");
      double x = input.nextDouble();
            
      System.out.print("Enter the intervel a: ");
      double a = input.nextDouble();
      
      System.out.print("Enter the intervel b: ");
      double b = input.nextDouble();
            
      System.out.print("tolerance Tol: ");
      double tol = input.nextDouble();
            
      System.out.print("maximum number of iterations: ");
      int numberOfIter = input.nextInt();
      
      //Invoking the method 
      newtonsMethod(coe,x,tol,numberOfIter,numberOfCoe,a,b);
   
   }
   
   //Method for finding the polynomial at x
   public static double polynomial(double[][] coe,double x){
      double ans = 0;
         
      for(int i=0; i<coe.length; i++){
              
         ans+= coe[0][i] * Math.pow(x,coe[1][i]);
               
      }
      return ans;
   }

   //Method for finding if the root exists in a polynomial
   public static boolean has_root(double[][] coe,double x,double a,double b){
      
      if((polynomial(coe,a)<0 && polynomial(coe,b)>0) || (polynomial(coe,a)>0 && polynomial(coe,b)<0)){
      
         System.out.println("By the IVT this polynomial has a root!");
         return true;
      }else{
         System.out.println("By the IVT this polynomial has no real root!");
         return false;
      }
   }

   //Method for finding the derivative of a polynomial
   public static double poly_derivative(double[][] coe,double x){
      double d_ans = 0;
      
      for(int i=0; i<coe.length; i++){
              
         d_ans+= coe[1][i] * coe[0][i] * Math.pow(x,(coe[1][i]-1));
      
      }
      return d_ans;
   }

   //Method for computing the Newton's Method
   public static double newtonsMethod(double[][] coe,double x,double tol,int numberOfIter,double numberOfCoe,double a,double b){
      boolean moveOn = has_root(coe,x,a,b);
      double p = 0;
      int i = 1;
      boolean t_continue = true;
      
      while(moveOn && t_continue &&  i<=numberOfIter){
         p = x - (polynomial(coe,x)/poly_derivative(coe,x));
         
         if(Math.abs(p-x) < tol){
            t_continue = false;
            System.out.println("The root is: " + p);
         }else if(i==numberOfIter && t_continue){
            t_continue = false;
            System.out.println("After "+ numberOfIter +" iterations, there was no root found within an accuracy of "+ tol +"!");
         }else{
            x = p;
            i++;
         }
      }
      return p;
   }


} 
   