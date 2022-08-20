public class FindOROfAllSubarra {



    public static void main(String argss[]){
        int A = 3;
        int B[] = {1, 0, 1};
        solve(A, B);
    }


    public static  long solve(int A, int[] B) {

        long count  =0;
       int N = A;
       for(int i =0;i<N;i++){
           for(int j=i;j<N;j++){
               int ans = 0;
               for(int k =i;k<=j;k++){
                   ans |= B[k];
               }
               System.out.println();
               
               if(ans == 1){
                   count++;
               }
           }

       }

       return count;

   }
    
}
