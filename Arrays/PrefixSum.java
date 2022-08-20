public class PrefixSum {

    public static void main(String args[])
    {
        int arr[] =  {100,200,300,400,500};

       int preFixSum[] =  findPrefixSum(arr);
        printArray(preFixSum, preFixSum.length);
       System.out.println(" \n Sum in range 1 and 3 is "+findSumInRange(preFixSum,1,2));
        
    }


   static int findSumInRange(int preFixSum[], int start, int end)
    {

        if(start!=0)
            return preFixSum[end] - preFixSum[start-1];
        else return preFixSum[end];

    }

    static int[] findPrefixSum(int arr[]){

        int preFixSum[] = new int[arr.length];

        preFixSum[0] = arr[0];  // calculate the initial value as logic requires previous computated value in future logic 

        for(int i =1;i<preFixSum.length;i++)
        {
            preFixSum[i] = preFixSum[i-1]+arr[i];  // creating new array using old one and precalculated prefix index
        }

        return preFixSum;


    }


    static void printArray(int arr[],int size){
           
        System.out.println("");
        for(int i =0; i< size;i++){
                System.out.print(" "+arr[i]);
            }
    }



}
