public class RemoveItemSortedArray {



    public static void main(String args[]){
        int arr[] = {3,2,2,3};
        int n = removeElement(arr, 2);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     }


    public static int removeElement(int[] nums, int val) {
        
        int i = 0;
        
        for(int j =0;j< nums.length;j++){
           
            if(nums[j] != val)
            {
                 nums[i] = nums[j];
                 i++;  
            }
        }
        
        
        return i;
        
    }
    
}
