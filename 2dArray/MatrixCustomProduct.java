import javax.xml.transform.SourceLocator;

public class MatrixCustomProduct {

    public static void main(String args[]){
        int A[][] = {  {1, 2, 3},{ 5,6,7},{9,10,11} };
        int B = 2;

        solve(A, B);
        
    }

    public static  int[][] solve(int[][] A, int B) {

        int rows = A.length;
        int cols = A[0].length;
        int result[][] = new int[A.length][A[0].length];

        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                result[i][j] = A[i][j] * B;
            }

        }

       

        return result;
        
    }


    static void printMatrix(int rows, int cols, int A[][]){

        for(int i =0;i<rows;i++){
            for(int j =0;j<rows;j++){
                    System.out.print(A[i][j]+" ");
            } 
            System.out.println();
        }
    
    }


    

    
}
