import java.lang.Math;

public class SlidingWindowSum {

    public static void main(String args[]){

        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;
        System.out.println("Max sum in consecutive block of "+k+" is "+funSumEfficient2(arr,k)); 
    }

    // naive approach has time O(Npow2) space O(1)
    static int findSum(int arr[], int block){
        
        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for(int i = 0; i+block-1 < arr.length;i++)
        {
            int newSum = 0;
            for(int j = i;j<=i+block-1;j++)  // for(int j = 0; j < k; j++) other simple way of writing
            {
               newSum = newSum + arr[j];     // arr[i+j];
                max = Math.max(max, newSum);
            }
        }

        return max;
    }



    // efficient way O(N) space O(1)
    static int funSumEfficient(int arr[],int windowSize){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0 ;i< windowSize;i++) // we need to find the sum of the first window to match with the next loop
        {
            currSum += arr[i];
        }

        maxSum = Math.max(maxSum, currSum);

        for(int i = windowSize;i<arr.length;i++)
        {
            currSum +=(arr[i] - arr[i-windowSize]);
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }

    // efficient way O(N) space O(1) // just written better code in the below fucnion than the above
    static int funSumEfficient2(int arr[],int windowSize){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
    

        for(int i = 0;i<arr.length;i++)
        {
            if(i<windowSize)
            {
                currSum += arr[i];
            }else{
        
                currSum +=(arr[i] - arr[i-windowSize]);
                 maxSum = Math.max(maxSum,currSum);
            }
        }

        return maxSum;
    }





}
