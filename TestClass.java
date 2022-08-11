/**
*
*@author Joel Katongo Zimba 2019052725
*/


class Utility{

   //Create method that computes the mean of the numbers in any array
   public static double calculateMean(double[] array){
   
      //Declare and assign a variable
      double total = 0;
      
      //Find the sum
      for(int i = 0; i < array.length; i++){
         total += array[i];
      }
      //Returns the mean
      return total / array.length;
   }
   
   //Create method that computes the standard deviation of the array
   public static double calculateStandardDeviation(double[] arr){
      
      //Declare and assign variables
      double total = 0;
      double standard = 0;
      
      //find the sum
      for(int i = 0; i < arr.length; i++){
         total += arr[i];
      }
      //Get mean
      double mean = total / arr.length;
      
      //Initialize the sum of standard
      for(int i = 0; i < arr.length; i++){
      standard +=  Math.pow((arr[i] - mean),2);
      }
      //Returns the standard deviation
      return Math.sqrt(standard/arr.length);
   }
   
   //Create method that computes mean and standard deviation of the array
   public static double [] calculateMeanStandardDeviation(double array[], double arr[]){
      
      //Declare and Create an array ans
      double [] ans = new double [2];
      //Computes the mean of an array
      ans[0] = Utility.calculateMean(array);
      //Computes the standard deviation of an array
      ans[1] = Utility.calculateStandardDeviation(arr);
      // Returns the mean and standard deviation of an array
      return ans;
      
   }
}


public class TestClass{
   public static void main(String[] args){
      
      //Initialize array
      double [] array = {4, 5, 6, 8, 1, 2, 6, 1};
      double [] arr = {4, 5, 9, 8, 1, 22, 6, 11};
      
      //Compute mean using Utility class
      double mean = Utility.calculateMean(array);
      //Compute standard deviation using Utility class
      double standardDeviation = Utility.calculateStandardDeviation(arr);
      //Compute mean and standard deviation using Utility class
      double [] ans = Utility.calculateMeanStandardDeviation(array, arr);
      
   }
}