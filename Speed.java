public class Speed{
     public static void main(String[] args) {
         
          double miles = 100;
          final double KILOMETER_PER_MILE = 1.609;
      
          double kilometers = miles*KILOMETER_PER_MILE;
      
          System.out.print("kilometer: "+ kilometers); 
     }
}

}public class DispalyTime{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   Sutem.out.print("Enter an integer for seconds");
   int seconds = input.nextInt();
   
   int minutes = seconds / 60;
   int remainingSeconds = seconds % 60;
   System.out.println(seconds + "seconds is = " + minutes + "minutes" + remainingSeconds + "seconds")
    
   }     
}