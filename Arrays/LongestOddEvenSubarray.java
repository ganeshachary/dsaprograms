public class LongestOddEvenSubarray {


    public static void main(String args[]){
        int arr1[] = {5,10,20,6,3,8};
        System.out.println(longestSubArray(arr1));
    }





    // program to find the longest subarray with odd and even consecutive series.
    // t.c O(n) sc O(1) can also be done in O(n^2) naive
    static int longestSubArray(int arr[]){
        int maxSub = 0;
        int currSub = 0;
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i-1]%2!=0 || arr[i]%2!=0&&arr[i-1]%2==0){
                currSub++;
                maxSub = Math.max(currSub, maxSub);
            }else{
                currSub = 1;
            }
        }

        return maxSub;
    }
    
}
