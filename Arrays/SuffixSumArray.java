

public class SuffixSumArray {

    public static void main(String args[]){
        int arr[] = {-7,1,5,2,-4,3,0};
        int suffix[] = createSuffixSum(arr);

        for(int i : suffix){
            System.out.print(i+" ");
        }
    }


    static int[] createSuffixSum(int arr[]){
        
        int suffixSum[] = new int[arr.length];

        if(arr.length>0){
            suffixSum[arr.length-1] = arr[arr.length-1];
            for(int i = arr.length-2;i>=0;i--){
                suffixSum[i] = suffixSum[i+1]+arr[i];
            }
         }

        return suffixSum;

         
    }
    
}
