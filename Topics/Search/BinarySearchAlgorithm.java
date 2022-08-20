package Search;

public class BinarySearchAlgorithm {

    public static void main(String args[]){

        int A[] = {1,2,3,4,5,6,10,22,55,133};
        System.out.println("Index of element is "+binarySearch(A, 133));
    }

    // t.c O(logn)
    public static int binarySearch(int A[],int element){

        int start = 0;
        int end = A.length-1;
        int result = -1;
        int mid = 0;
         while(start<=end){
            mid = start+((end-start)/2);
            if(A[mid] == element)
                {
                    result =  mid;
                    return result;
                }
               
            if(A[mid]>element){
                end = mid-1;
            }   
            if(A[mid]<element){
                start = mid+1;
            }
         }

        return result;

    }



    
}
