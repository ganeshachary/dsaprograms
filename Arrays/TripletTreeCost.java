public class TripletTreeCost {



    public static void main(String args[]){
        int  A[] = { 5, 9, 10, 4, 7, 8 };
        int B[] = { 5, 6, 4, 7, 2, 5};

       int A1[] = {1, 6, 4, 2, 6, 9};
       int   B1[] = {2, 5, 7, 3, 2, 7};

       int A2[] = {1, 3, 5};
       int B2[] = {1, 2, 3};
        System.out.println(solve(A,B));
    }


    public static int solve(int[] A, int[] B) {
        
        int n = A.length;
        int ans = 0;
       
        for(int i=0;i<n-2;i++){
            
            for(int j=i+1;j<n-1;j++){

                for(int k=j+1;k<n;k++){
                    
                    if(A[i]<A[j] && A[j]<A[k]){
                        
                        if(ans != 0){
                            ans = Math.min(ans,B[i]+B[j]+B[k]);
                        }else
                        {
                            ans = B[i]+B[j]+B[k]; 
                        }


                        System.out.println("A1 ="+A[i]+" A2 ="+A[j]+"  A3 ="+A[k]+" \n   B1 ="+B[i]+"  B2 ="+B[j]+" B3 ="+B[k]+" \n Ans ="+ans);
                        
                    }
                }
    
            
             }
    
        }
    
        return ans;

    }


    
}
