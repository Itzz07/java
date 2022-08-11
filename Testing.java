



public class Testing{
   public static void main(String[] args){
  
  /* SimpleCircle circle1 = new SimpleCircle();
   System.out.println("The area of the circle of radius "+ circle1.radius + " is " + circle1.getArea());
    
   SimpleCircle circle2 = new SimpleCircle(25);
   System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
   
   SimpleCircle circle3 = new SimpleCircle(125);
   System.out.println("The area of the circle of radius "+ circle3.radius + " is " + circle3.getArea());
   
   circle2.setRadius(100);
   System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
   
   
   }

}

class SimpleCircle{

   double radius;
   
   SimpleCircle(){
      radius = 1;
   }
   
   SimpleCircle(double newRadius){
      radius = newRadius;
   }
   
   double getArea(){
      return radius * radius * Math.PI; 
   }
   
   double getPerimeter(){
      return 2 * radius * Math.PI; 
   }
   
   void setRadius(double newRadius){
      radius = newRadius;
   }




}*/

      char[] word = {'T','e','s','t','i','n','g'};
      char temp[] = new char[1];
      for(int i=0; i<=(word.length-1)/2; i++){
      
         for(int j=word.length-1-i; j >=(word.length-1)/2; j--){
            temp[0] = word[i];
            word[i] = word[j];
            word[j] = temp[0];
            break;
         }
      }
      
      System.out.print(word[0]+" "+word[1]+" "+word[2]+" "+word[3]+" "+word[4]+" "+word[5]+" "+word[6]);
   }
}
 
   /*Scanner input = new Scanner(System.in);
      
      System.out.print("initial approximation p0: ");
      double p0 = input.nextDouble();
      
      System.out.print("tolerance Tol: ");
      double tol = input.nextDouble();
      
      System.out.print("maximum number of iterations n0: ");
      int n0 = input.nextInt();
      
      double p;
      int i = 0;
      while(i<n0){
         
         p = p0 - ((2-(3/p0))/(3/Math.pow(p0,2)));
         if(Math.abs(p-p0) < tol){
            System.out.println(p);
            break;
         }else{
            p0 = p;
            i++;
         }
         
      }
   }
} */ 