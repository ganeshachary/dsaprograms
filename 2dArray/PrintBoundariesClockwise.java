public class PrintBoundariesClockwise {


    public static void main(String args[]){

        int matrix[][] = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        printBoundaries(matrix);

    }
    

    static void printBoundaries(int A[][]){

        int n = A.length; // n is rows
        int m = A[0].length; // m is rows

        // print top left to n-2
         int i = 0;
         for(int j =0;j<m-1;j++)  {
            System.out.print(A[i][j]+" ");
         } 

         // print top to down right border to n-2
         int  b = m-1;
         for(int a=0;a<n-1;a++)  {
            System.out.print(A[a][b]+" ");
         } 


         // and so for all borders can be written
         



    }
    
}
