public class SumOfArrayElemets {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,7};

        int sum =0;
        
        for(int i = 0; i< array.length; i++)
        {
                sum = sum + array[i];
        }

        System.out.println("Sum of the arrays item is "+sum);
    }
    
    
}
