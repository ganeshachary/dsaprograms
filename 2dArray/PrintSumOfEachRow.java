public abstract class PrintSumOfEachRow {



    public static void main(String args[]){

        int matrix[][] = {  {3,8,9,2},
                        {1,2,3,6},
                        {4,10,11,17} };

        printAllRowSum(matrix);

    }


    //T.c O(N^M) s.c O(1)  .not N^2 as N is row And M is col so N*M
    public static void printAllRowSum(int A[][]){   

        int rows = A.length;
        int cols = A[0].length;

        for(int i = 0;i<rows;i++){
            
            int sum =0;
            
            for(int j=0;j<cols;j++){
                sum+= A[i][j];
            }

            System.out.println("Sum of Row"+i+" = "+sum);
        }

    }

  
                    

    
}
