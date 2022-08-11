import java.util.Scanner;

public class Binary
 {  

      public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            int count = 0;
            
            while(count == 0)
                 {
                     System.out.print("\nEnter Decimal digit<enter -1 to exit>: ");
                     int number = input.nextInt();

                     if(number == -1)
                       {
                            count++;
                       }else
                            {
                                Compute.toBinary(number);
                            }
                 }
        }

  }
  
  class Compute
   {
      public static void toBinary(int decimal)
        {
            if(decimal == 0 || decimal == 1)
              { 
                  System.out.print(decimal);
              }else
                   {
                      toBinary(decimal / 2);
                      System.out.print(decimal % 2);
                   }
        } 
    }