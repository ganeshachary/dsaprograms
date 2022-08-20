public class Example4 {
    
    
    public static void main(String args[]){

        fun(5);

        System.err.println("");
        fun2(5);
    }

    // print num from n to 1 in recusrion
    static void fun(int n){
        if(n==0)
            return;
        System.out.print(n);
        fun(n-1);    
    }


    //print num from 1 to N in recursion
    static void fun2(int n){
       
        if(n==0)
            return;
        
        fun2(n-1);
        System.out.print(n);    
    }
}
