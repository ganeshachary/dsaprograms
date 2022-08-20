package Sorts;

public class MergeSort {


    public static void main(String args[]){
        int A[] = {10,9,8,23,1,3,4,8};

        int l = 0;
        int r = A.length-1;
    
        mergesort(A,l,r);
        printArrays(A);
    }

   
    


    //t.c O(nlogn) s.c = O(N) as it divides in each step and for each step looped N time for n*logn
public static void mergesort(int A[],int l, int r){

    if(l<r){
        int mid = (l+r)/2;  // l is first index i.e 0 and r is last index i.e N-1;
        mergesort(A, l, mid); // first all call to this is done
        mergesort(A, mid+1, r); // then this
        merge(A, l, mid, r);// then this for each halfs
    }
   
}


public static void merge(int A[],int l,int mid,int r){


    int i =l; // for left side of array;
    int j = mid+1; // for right side of array
    int k = l; // this is used for arary B index count 
    int B[] = new int[A.length];
    
    while(i<=mid&&j<=r){  // here either any one side of array will get exhausted as size may be diff
        if(A[i]<A[j]){
            B[k] = A[i];
            i++;
        }else{
            B[k] = A[j];
            j++;
        }
        k++;
    }


    // below we check which side of array got exhausted and put the remaingin inside the B array
    if(i>l){  
        while(j<=r){
            B[k] = A[j];
            k++;
            j++;
        }
    }else{
        while(i<=mid){
            B[k] = A[i];
            k++;
            i++; 
        }
    }



    // here we simply loop and put value into the actual array;
    for(int a = l;a<=r;a++)
    {
        A[a] = B[a];
    }

}




public static void printArrays(int array[]){
        
    for(int i : array){
        System.out.println(i);
    }
}

}

