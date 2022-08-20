public class FaultyBulbProblem {


    public static void main(String args[]){
        
        int A[] = {1, 1, 1, 1};
        int press = 0;

        for(int i=0;i<A.length;i++){
            
            if(A[i]==0&&press%2==0){
                press++;
            }
            else if(A[i]==1&&press%2!=0){
                press++;

            }
        }

        System.out.println(press);



    
    }



    
}
