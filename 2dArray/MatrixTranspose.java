public class MatrixTranspose {



    public static void main(String args[]){

        int B[][] = {  {1, 2, 3},{ 5,6,7},{9,10,11} };


        int A[][] = transposeAnyMatrix(B);

        for(int i =0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

      


    }


    public static int[][] transposeUsingSwap(int A[][]){

        for(int i =0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(j>i){ // this condition comes due to swap operaton only only be done one square matrix
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp; 
                }
            }
        }

        return A;
    }

    public static  int[][] transposeAnyMatrix(int A[][]){

        int rows = A.length;
        int cols = A[0].length;

        int transpose[][] = new int[cols][rows];

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] = A[i][j];
            }
        }

        return transpose;
        
        

    }
}



    

