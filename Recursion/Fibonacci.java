public class Fibonacci{
/**
    // The recursive method
    public static void main(String[] arg){
        // Print out the answer
        System.out.print(fibo(1000));
    }

    //the fibo method
    static int fibo(int n){
        // base condition
        if (n < 2)
            return n;
        else
            return fibo(n-1) + fibo(n-2);
    }
}**/ 

    // The iteration method 
    public static void main(String[] arg){

        // Prints out the returned method
        System.out.print(fibo(1000000));

    }

    // The fibo method 
    public static int fibo(int n){
        
        int f_0 = 0, f_1 = 1;

        for(int i = 1; i <= n; i++){
            
                int f = f_1 + f_0;
                f_0 = f_1;
                f_1 = f;
            
        }
        return f_0;
    }
    
}