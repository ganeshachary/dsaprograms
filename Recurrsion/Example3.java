public class Example3 {
    
    public static void main(String args[]){


        fun(7);
    }

    // this fun in general prints binary represenation of n if n>0 
    static void fun(int n){
        if(n==0)
            return;
        fun(n/2);
        System.out.print(n%2);
    }
}
