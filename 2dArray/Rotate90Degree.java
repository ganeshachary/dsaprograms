public class Rotate90Degree {
    

    public static void main(String args[]){

        int A[][] = {  {1, 2, 3},{ 4,5,6},{7,8,9} };
        
        int rows = A.length;
        int cols = rows; // as sqaure matrix 

        printMatrix(rows, cols, A);
        System.out.println();
       
        solve(A);
        
        printMatrix(rows, cols, A);

        System.out.println();

        reverseEachRow(rows, cols, A);

        System.out.println();

        printMatrix(rows, cols, A);
    }


    public static  void solve(int[][] A) {

        int rows = A.length;
        int cols = rows; // as sqaure matrix 
       

        for(int i =0;i<rows;i++){
            for(int j =i+1;j<rows;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            } 
        }


        reverseEachRow(rows, cols, A);

      
        
    }



    static void printMatrix(int rows, int cols, int A[][]){

        for(int i =0;i<rows;i++){
            for(int j =0;j<rows;j++){
                    System.out.print(A[i][j]+" ");
            } 
            System.out.println();
        }
    
    }


    static void reverseEachRow(int rows, int cols, int A[][]){

        for(int i =0;i<rows;i++){

                int start = 0 ;
                int end  = cols-1;
                while(start<end){
                    int temp = A[i][start];
                    A[i][start] = A[i][end];
                    A[i][end] = temp;
                    start++;
                    end--;
                }
        }

    }
}
