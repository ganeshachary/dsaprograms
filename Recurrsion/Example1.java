class Example1 {

    public static void main(String args[])
    {
            func(3);
    }


    static void func(int n){

        if(n==0)
            return;
        
        func(n-1);

        System.out.println(n);

        func(n-1);
        
    }
}