public class FindMaxColSum {



    public static void main(String args[]){

        int matrix[][] = {  {3,8,9,2},
                        {1,2,3,6},
                        {4,10,11,17} };

        int result[] = findMaxColSums(matrix);
        
        for(int i : result){
            System.out.println(i);
        }

    }


    //T.c O(N^M) s.c O(1)  .not N^2 as N is row And M is col so N*M
    public static void findMaxColSum(int A[][]){   

        int rows = A.length;
        int cols = A[0].length;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<cols;i++){
            
            int sum =0;
            
            for(int j=0;j<rows;j++){
                sum+= A[j][i];
                max = Math.max(sum, max);
            }

            //System.out.println("Sum of Row"+i+" = "+sum);
        }


        System.out.println("Max col sum is "+max);

    }



    //T.c O(N^M) s.c O(1)  .not N^2 as N is row And M is col so N*M
    public static int[] findMaxColSums(int A[][]){   

        
        int rows = A.length;
        int cols = A[0].length;
        int colsSum[] = new int[cols];

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<cols;i++){
            
            int sum =0;
            
            for(int j=0;j<rows;j++){
                sum+= A[j][i];
                colsSum[i] = sum; 
            }

        
        }


        return colsSum;

    }
    
}
