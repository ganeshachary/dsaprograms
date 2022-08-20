
import java.util.HashSet;
import java.util.Set;

public class CountOfDistinctElemet {


    public static void main(String args[]){

        int arr[] = {15,12,13,12,13,13,18};
        System.out.println(countOfDistinctElement(arr));
    }

    // t.c O(n) s.c (n)
    public static int countOfDistinctElement(int arr[]){

        Set<Integer> set = new HashSet<>();

        for(int i =0;i<arr.length;i++){
           set.add(arr[i]); // only adds the key onces and ignore the same value we will have only unique value in set.
        }

        return set.size();
    }


    
}
