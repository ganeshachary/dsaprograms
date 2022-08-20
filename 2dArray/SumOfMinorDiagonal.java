public class SumOfMinorDiagonal {




    public static void main(String args[]){

        int B[][] = {{1, -2, -3}, {-4, 5, -6},{-7, -8, 9}};

        int  A[][] = {{3, 2}, {2, 3}};

        System.out.println(solve(B));
    }



    public static int solve(final int[][] A) {

    // this is also called minor diagonal
     int j = A.length-1; // its square matrix row and col are same
     int sum = 0;
     for(int i = 0;i<A.length;i++){
        sum += A[i][j];
         j--;
     }

     return sum;


    }

    
    
}
