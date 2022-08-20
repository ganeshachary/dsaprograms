import java.util.HashSet;

public class UnionOfUnsortedArray {



    // this program just finds the union cout 
    // algo used is create a set and add all elements in it, it will remove all repeating item.
    // t.c O(n+m) s.cO(n+m) 
    public static int union(int arr1[],int arr2[]){

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }

        return set.size();


    }
    
}
