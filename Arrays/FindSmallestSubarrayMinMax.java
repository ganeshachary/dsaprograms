import javax.swing.text.StyledEditorKit;

public class FindSmallestSubarrayMinMax {

   //find the length of smallest subarray with min and max value;
   //T.c O(N), s.c (1);;


    public static void main(String args[]){

        int A[] = {2,6,4,5,1,2,6,4,6,6,3,2,5,1};


        int max = Math.max(A[0], A[1]);
        int min = Math.min(A[0], A[1]);
        for(int i=1;i<A.length;i++){
            if(max<A[i]){
                max = A[i];
            }else if(min>A[i]){
                min = A[i];
            }

        }


        System.out.println("Max is "+max+" Min is "+min);
        System.out.println(findSmallestSubarray(A,max,min));
    }


    static int findSmallestSubarray(int A[],int max, int min){
        

        if(min==max)
            return 1;

        int ans = A.length;
        int maxPos= -1;
        int minPos =-1;
        
        for(int i =0;i<A.length;i++){

            if(A[i]==max){
                maxPos = i;
                if(minPos!=-1){
                    ans = Math.min(ans, maxPos-minPos+1);
                }
            }
            else if(A[i] == min){
                minPos = i;
                if(maxPos!=-1){
                    ans = Math.min(ans,minPos-maxPos+1);
                }
            }
        }

        return ans;
    }

    
    
}
