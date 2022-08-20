public class MakeRowColZero {



    public static void main(String args[]){
       
        int A[][] = {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
        
        solve(A);
    }
   



    public static  int[][] solve(int[][] A) {

        int rows = A.length;
        int cols = A[0].length;
        int res[][] = new int[rows][cols];

        for(int i =0;i<rows;i++){
            
            for(int j=0;j<cols;j++){

                res[i][j] = A[i][j];
            }
        }

        for(int i =0;i<rows;i++){
            
            for(int j=0;j<cols;j++){

                if(A[i][j]==0){
                    setZeroRowsCols(rows, cols, i, j, res);
                }
            }
        }




       

        return res;
    }


    public static void setZeroRowsCols(int rowsCount,int colsCount, int row,int col ,int res[][]){

        
        for(int i=0;i<rowsCount;i++){
            res[i][col] = 0;
        }


        for(int j=0;j<colsCount;j++){
            res[row][j] = 0;
        }
    }
    

    static void printMatrix(int rows, int cols, int A[][]){

        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                    System.out.print(A[i][j]+" ");
            } 
            System.out.println();
        }
    
    }
}
