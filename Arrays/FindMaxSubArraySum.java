public class FindMaxSubArraySum {
    

    public static void main(String args[]){
        int arr1[] = {2,3,-8,7,-1,2,3};
        int arr2[] = {5,8,3};
        int arr3[] = {-6,-1,-8};

        System.out.println(maxSumSubArrayEfficient(arr1));
        System.out.println(maxSumSubArrayEfficient(arr2));
        System.out.println(maxSumSubArrayEfficient(arr3));
    }


    // here we calculate maximum previous value and use the calculated value 
    //and compare if current is bigger, then check if the maxsum is lesser or greater than new sum;
    // this is also called as Kadane's algorithm.

    //t.c O(N) s.cO(1)
    static int maxSumSubArrayEfficient(int arr[]){
         
        int maxPrevious = arr[0];
        int maxSum = arr[0];
         
        for(int i =1;i<arr.length;i++){
            
            maxPrevious = Math.max(maxPrevious+arr[i], arr[i]); 
            maxSum = Math.max(maxPrevious, maxSum);

        }

        return maxSum;
    }



    //t.c O(n^2) s.c O(1)
    static int maxSumSubArray(int arr[]){
         
        int maxSum = arr[0];

        for(int i =0;i<arr.length;i++){
            int currSum = 0;
            for(int j=i;j<arr.length;j++){
                currSum = arr[j]+ currSum;
                maxSum = Math.max(currSum, maxSum);
            }
        }


        return maxSum;

    }
}
