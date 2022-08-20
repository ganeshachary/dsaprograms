package Search;

public class TernerySearchAlgo {


    public static void main(String args[]){

        int A[] = {1,2,3,4,5,6,10,22,55,133};
        System.out.println("Index of element is "+ternarySearch(A, 133));
    }


    public static int ternarySearch(int ar[], int key){
        int r = ar.length-1;
        int l = 0;
       

        while (r >= l) {
  
            // Find the mid1  mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
  
            // Check if key is present at any mid
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }
  
            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region
  
            if (key < ar[mid1]) {
  
                // The key lies in between l and mid1
                r = mid1 - 1;
            }
            else if (key > ar[mid2]) {
  
                // The key lies in between mid2 and r
                l = mid2 + 1;
            }
            else {
  
                // The key lies in between mid1 and mid2
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
  
        // Key not found
        return -1;
  

    }
    
}
