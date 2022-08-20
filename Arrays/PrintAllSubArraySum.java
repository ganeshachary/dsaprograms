public class PrintAllSubArraySum {




    public static void main(String args[]){
        int A[] = {2, 1, 3};
        veryoptimizedSubArraySum(A);

        //829496470932889354
    }


    static void veryoptimizedSubArraySum(int A[]){

    

        int N = A.length;
        long sum = 0;
        for(int i =0;i<N;i++){
                sum +=  (long)A[i] * (i+1) * (N-i);
        }

        System.out.println(sum);
    }



    static void optimizedSubArraySum(int A[]){

        int preFixSum[] = createprefixSum(A);

        int N = A.length;
        int sum = 0;
        for(int i =0;i<N;i++){
            for(int j=i;j<N;j++){   
            
                if(i==0){
                    sum += preFixSum[j];
                }else{
                    sum += preFixSum[j] - preFixSum[i-1];
                }
               
            }
   

        }

        System.out.println(sum);
    }


    public static int[] createprefixSum(int A[]){

        int prefixSum[] = new int[A.length];
        prefixSum[0] = A[0];
       
        for(int i =1;i<A.length;i++){
            prefixSum[i] = prefixSum[i-1]+A[i];
           
        }
       
        return prefixSum;

    }

     // T.c O(N^3) s.c O(1)
     static void subArraySum(int A[]){

        int N = A.length;

        int sum = 0;
        for(int i =0;i<N;i++){
            
            for(int j=i;j<N;j++){

               
                for(int k=i;k<=j;k++){
                
                    sum = sum + A[k];
                }

                System.out.println(sum);
            }

           

        }
    }
    
}
