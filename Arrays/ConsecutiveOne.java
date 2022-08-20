public class ConsecutiveOne {

    public static void main(String args[]){
            int arr[] = {0,1,1,0,1,0};
            int arr1[] = {1,1,1,1};
            int arr2[] = {0,0,0,0};
            int arr3[] = {1,0,1,1,1,1,0,1,1};

            System.out.println(countConsecutiveOnes(arr));
            System.out.println(countConsecutiveOnes(arr1));
            System.out.println(countConsecutiveOnes(arr2));
            System.out.println(countConsecutiveOnes(arr3));
    }



        // t,c O(n) s.c O(1)
        static int countConsecutiveOnesEfficient(int arr[]){

            int maxCount = 0;
            int currCount =0;
          
            for(int i =0;i<arr.length;i++){
                
                if(arr[i]==1){
                    currCount++;
                }else{
                    maxCount = Math.max(maxCount, currCount);
                    currCount = 0;
                    
                }
                    
           
            }
            return maxCount;
        }



    // t,c O(n^2) s.c O(1)
    static int countConsecutiveOnes(int arr[]){

        int maxCount = 0;

        for(int i =0;i<arr.length;i++){
            
            int currCount =0;
                
            for(int j=i;j<arr.length;j++){
              
                if(arr[j]==1){
                    currCount++;
                }else{
                    break;
                }

            }

        maxCount = Math.max(maxCount, currCount);

        }
        return maxCount;
    }
    
}
