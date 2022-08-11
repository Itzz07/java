import java.util.Scanner;

public class GradingSystem{
   //Main method
   public static void main(String[] args){
   
      //User is prompt to enter the mark
      Scanner input = new Scanner(System.in);
      System.out.println("Enter The Mark: ");
      double mark = input.nextDouble();
     
   
      //The grade system
      //About 90 is an A+
      if(mark>=90)
      System.out.println( mark +"  "+ "A+");
      
      //Between 80 - 89 is an A     
      else if(mark>=80) 
      System.out.println( mark +"  "+ "A");
      
      //Between 70 - 79 is a B+        
      else if(mark>=70)
      System.out.println( mark +"  "+ "B+");
      
      //Between 60 -69 is a B        
      else if(mark>=60)
      System.out.println( mark +"  "+ "B");
      
      //Between 50 - 59 is a C+
      else if(mark>=50)
      System.out.println( mark +"  "+ "C+");
      
      //Between 45 - 49 is a C
      else if(mark>=45) 
      System.out.println( mark +"  "+ "C");
      
      //Below 40 is a D
      else
      System.out.println( mark +"  "+ "D");
   }
      
}
