package Sorts;

public class InsertionSort {


    public static void main(String args[]){

        int A[] = {10,9,8,23,1,3,4,8};
        sort(A);
        printArrays(A);
    }



    public static void printArrays(int array[]){
        
        for(int i : array){
            System.out.println(i);
        }
    }

    // t.c O(Npow2) // s.c O(1);
    public static void sort(int A[])
    {   
        
        for(int i = 1;i<A.length;i++){
            int key = A[i];
            int j = i-1;
           
            while(j>=0&&A[j]>key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
    
}
