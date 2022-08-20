package Sorts;

public class SelectionSort {
    

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


    //t.c O(N2) this algorithem find the smallest in array and put in the first
    public static void sort(int A[]){


        for(int i =0;i<A.length-1;i++){ // 
            
            int minIndex = i;
            
            for(int j = i+1;j<A.length;j++){
                if(A[j]<A[minIndex]){
                    minIndex = j;
                }
                  
            }

            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

    }

}
