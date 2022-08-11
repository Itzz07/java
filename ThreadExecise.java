public class ThreadExecise{
   

   public static class MyThread extends Thread{
      
      public void run(){
         System.out.println("MyThread is running");
         System.out.println("MyThread is finished!");
      }
      
   }
   public static class MyRunnable implements Runnable{
    //  @override
      public void run(){
         System.out.println("MyRunnale is runnig!");
         System.out.println("MyRunnableis finished");
      }
   }
   
   public static void main(String[] args){
      Runnable yeye = new Runnable(){
      
         public void run(){
            System.out.println("MyRunnale is runnig!");
            System.out.println("MyRunnableis finished");
         }
      };
      
            yeye.sleep(1000);

      Thread take = new Thread(yeye);
      take.start();
   }
   
}