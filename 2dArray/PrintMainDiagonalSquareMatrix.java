class PrintMainDiagonalSquareMatrix{

    public static void main(String args[]){

        int matrix[][] = {  {3,8,9},
                        {1,2,3},
                        {4,10,11} };

        printDiagonal(matrix);

    }


    public static void printDiagonal(int A[][]){



        // this is called main diagonal
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i][i]+" ");
        }

        System.out.println();


        // this is also called minor diagonal
        int j = A.length-1;
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i][j]+" ");
            j--;
        }


    }


}