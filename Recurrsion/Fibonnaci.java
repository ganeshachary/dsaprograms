public class Fibonnaci {


    // program to find the nth fibonacci number
    

    public static void main(String args[]){
    
        System.out.println(fib(8));

    }

    
    // finding the nth fibonacci num indexing from 0
    static int fib(int n){
    
        if(n<=1) // for 0 and 1 return n only that is 0 and 1
            return n;
        
        return fib(n-1) + fib(n-2);
    }
}



