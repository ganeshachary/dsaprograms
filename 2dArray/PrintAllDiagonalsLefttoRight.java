import java.util.ArrayList;

public class PrintAllDiagonalsLefttoRight {


    public static void main(String args[]){

        //int matrix[][] = {  {2,4,6},{1,3,5} };

        //int matrix[][] = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

        int matrix[][] = { {1, 2, 3},{ 4, 5, 6}, {7, 8, 9}};
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        printAntiDiagonal(rows, cols, matrix);

        


    }

    static int[][] printAntiDiagonal(int rows,int cols, int matrix[][]){


    
        
        int res[][] = new int[2*rows-1][cols];


        int count = 0;

       
        for(int k =0;k<cols;k++){

            int a[] = new int[2*cols-1];
            int rowcount = 0;

            int i =0; 
            int j =k;
            while(i<rows && j>=0){
                a[rowcount] =  matrix[i][j];
                rowcount++;
                i++;
                j--;
            }

            for(int p=0;p<rowcount;p++){
                 res[count][p] = a[p];
            }

            count++;
            
         


       }

     

        for(int k = 1;k<rows;k++){

            int a[] = new int[2*cols-1];
            int rowcount = 0;
            int i = k;
            int j = cols-1;
            while(j>=0&&i<rows){
                a[rowcount] =  matrix[i][j];
                rowcount++;
                i++;    
                j--;
            }

            for(int p=0;p<rowcount;p++){
                res[count][p] = a[p];
           }

           count++;
    

            
        }

        return res;

    }    


    //t.c O(N*M) and s.c o(1)
    static void printDiagonalsTopLefttoRight(int rows,int cols, int matrix[][]){





        // first printing the cols diagonal left to right;
        // loop takes cols as outter loop as we print cols left to right and go down by rows
       
        for(int k =0;k<cols;k++){
            int i =0; // as every cols starts from first row and go down i.e increment the value of i;
            int j =k;// as we will decrease k every time to print only cols of each row below, we need separate j as not to update the k;
            while(i<rows && j>=0){
                System.out.print(matrix[i][j]+ " ");
                i++;
                j--;
            }

            System.out.println();


       }

       // for printing the last col items top to bottom and with left diagonal items.

        for(int k = 1;k<rows;k++){
            int i = k;
            int j = cols-1;
            while(j>=0&&i<rows){
                System.out.print(matrix[i][j]+ " ");
                i++;    
                j--;
            }
            System.out.println();

            
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
