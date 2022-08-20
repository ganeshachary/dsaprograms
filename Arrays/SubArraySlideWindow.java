import java.util.ArrayList;

public class SubArraySlideWindow {




    public static void main(String args[]){

        // int A[] = {1, 0, 1, 0, 1};
        // int B = 1;

        // for second function
        // int A[] = { 3, 7, 90, 20, 10, 50, 40 };
        // int B = 3;

        // int A1[]={3, 7, 5, 20, -10, 0, 12};
        // int B1 = 2;     

        // int A2[] = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
        // int B2  = 9; 

        // System.out.println(leastAverageSubArrayWithKSize(A2, B2));


        // for binary center
        int A[] = {1, 0, 1, 0, 1};
        int B = 1 ;

        int A1[] = {0, 0, 0, 1, 1, 0, 1};
        int B1 = 0;
        
        int A2[] = {1, 1, 1, 1, 1, 1, 1};
        int B2 = 0;

        findItsBinaryCenter(A2, B2);
        

    }


      // efficient way O(N) space O(1)
      static  int[] findItsBinaryCenter(int A[],int B){

        int n = A.length; // Array length
        int k = (2 * B + 1); // Given in the question

        ArrayList<Integer> res = new ArrayList<Integer>();

        //(n-k) is  to get the subarray of length 2*B+1 otherwise u will get out of
        // bound error

         for(int i = 0 ; i <= (n-k)  ; i++)
        {
            int start = i; //start index of subarray
            int end = i + k -1; // end index of subarray
            boolean flag = true;

            //use 2 pointer method to check if the elements are alternative
            while(start < end)
            {
                if(A[start] == A[start+1] || A[end] == A[end-1] || A[start] != A[end])
                {
                    flag = false;
                    break;      
                }
                start++;
                end--;
            }

            // if the elements are alternative take the index and load it to the array list
            if(flag)
            {
                int center_element = (start + end ) / 2;
                res.add(center_element);
            }

        }
       

        int result[] = new int[res.size()];

        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
            System.out.println(result[i]);
        }


        return result;

        


      
        }




        // T.c O(N) s.c = O(1)
     static int leastAverageSubArrayWithKSize(int A[],int B){

        int index  = 0; // first subarray index
        float leastAverage = 0; // taking float value as the int will round the average and mutilple diff sum can have same int average
        float cursum = 0;
        for(int i =0;i<B;i++){
            cursum +=  A[i];
        }

        leastAverage = cursum/B; // first subarray average

        for(int i = B;i<A.length;i++){
            float curAverage = 0;
            cursum += A[i] - A[i-B];  
            curAverage = cursum/B;
            if(curAverage<leastAverage){
                leastAverage = curAverage; // check if next subarray has average below it
                index = i-B+1; // if yes change index to the start of subarray
            }
        }



        return index;

     }
    
}
