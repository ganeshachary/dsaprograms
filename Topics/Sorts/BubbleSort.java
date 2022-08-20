package Sorts;

public class BubbleSort {

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

    // t.c O(n2)
    public static void sort(int A[]){
        

        // for each iteration it takes largest element to right
        for(int i=0;i<A.length;i++){
            for(int j =0;j<A.length-i-1;j++){ // we only check till length - i-1  as for i 1 element is shifted to the right so no need to check last 
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }



    
}
