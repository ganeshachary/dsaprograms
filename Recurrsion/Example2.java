public class Example2 {
    public static void main(String args[]){

        System.out.println(fun(16));
    }


    //  this function in genereal print log base 2 for n whern n > 1 and is power of 2;
    static int fun(int n){
        if(n==1)
            return 0;

        return 1+ fun(n/2);    

    }
}
