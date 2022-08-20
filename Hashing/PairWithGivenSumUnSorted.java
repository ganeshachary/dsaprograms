import java.util.Set;
import java.util.HashSet;

public class PairWithGivenSumUnSorted {

    


    //here we need to find pair whose sum is equal to the given sum
    //add item to the set and check if sum-new value is there in the set if yes return true else continue for next value
    // t.c O(n) s.c(n)
    public static boolean findPairSumExist(int arr[],int sum){

        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(set.contains(sum-arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }

        }





        return false;

    }
    
}
