public class SumOfMatrix {


    public static void main(String args[]){
        
        int A[][] = {  {1, 2, 3},{4, 5, 6},{7, 8, 9} };

        int B[][] = {  {9, 8, 7},{6, 5, 4},{3, 2, 1} };


        int sum[][] = sumMatrix(A, B);  
        

        for(int i =0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    
    }



    public static int[][]  sumMatrix(int A[][],int B[][]){

        int rows = A.length;
        int cols = A[0].length;
        int c[][] = new int[rows][cols];

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j] = A[i][j] + B[i][j];
            }
        }

        return c;
        
    }


    
}
