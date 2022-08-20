package Sorts;

public class QuickSort {


    public static void main(String args[]){
        int A[] = {10,9,8,23,1,3,4,8};

        int l = 0;
        int r = A.length-1;
    
        quickSort(A, l, r);
        printArrays(A);
    }


    // t.c O(nlogn) s.c (n) as recurssion each step store n values in stack
    public static void quickSort(int A[],int l, int h){
        if(l<h){
            int pivot = paritionSort(A, l, h);
            quickSort(A,l, pivot-1);
            quickSort(A,pivot+1,h);
        }

      
    }

    public static int paritionSort(int A[],int l,int h){

        int pivot = A[l]; // taking pivot first may lead to O(npowe 2 ) t.c in worst case when array is already sorted so opt of mid or random index
        int i = l;
        int j = h;

        while(i<j){

            while(A[i]<=pivot) i++;
            while(A[j]>pivot)  j--;
            if(i<j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        // here we swap the pivot elemet at l to the conditon j where j <i;
        int temp = A[l];
        A[l] = A[j];
        A[j] = temp;  

        return j;
    }




public static void swap(int a , int b){
    int temp = a;
    a = b;
    b = temp;
}

public static void printArrays(int array[]){
        
    for(int i : array){
        System.out.println(i);
    }
}

}



   
    

