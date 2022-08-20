
import java.util.Arrays;
import java.util.List;

public class OddAndEvenIndexSum {




    public static void main(String args[]){
            int arr[]  = {8, -3,5,-7,1,4,2};
            int preFixEven[] = new int[arr.length];
            int preFixOdd[] = new int[arr.length];

            createOddEvenPrefixSum(arr, preFixEven, preFixOdd);

            int types[] = {1,2,2,1}; // 1 is for even and 2 is for odd 
            int L[] = {1,2,4,3};
            int R[] = {4,6,5,3};

            int queryLength = types.length;


            System.out.println();
            for(int i =0;i<queryLength;i++){
                
                if(types[i]%2==0){
                    System.out.print(findQueries(L[i], R[i], preFixOdd) +" ");
                }else{
                    System.out.print(findQueries(L[i], R[i], preFixEven) +" ");
                }
            }

    }


   

       
           


       
        static int findQueries(int L,int R,int preSum[]){

            if(L==0){
                return preSum[R];
            }else{
                return preSum[R]-preSum[L-1];
            }
        }


    






    static void createOddEvenPrefixSum(int arr[],int preFixEven[],int preFixOdd[]){
    
        int N = arr.length;

        preFixEven[0] = arr[0];
        preFixOdd[0] = 0;
        
        for(int i =1;i<N;i++)
            {
                if(i%2==0){
                    preFixEven[i] = preFixEven[i-1]+arr[i];
                    preFixOdd[i] = preFixOdd[i-1];
                }else{
                    preFixEven[i] = preFixEven[i-1];
                    preFixOdd[i] = preFixOdd[i-1]+arr[i];
                }
            }


            System.out.println();
            for(int i =0;i<N;i++)
            {
                System.out.print(preFixEven[i]+" ");
            }

            System.out.println();
            for(int i =0;i<N;i++)
            {
                System.out.print(preFixOdd[i]+" ");
            }

        

 
    }

    

}



