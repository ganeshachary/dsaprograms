
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionOfArray {


    public static void main(String args[]){
        int arr1[] = {10,20,10,30};
        int arr2[] = {20,10,10,40};
        System.out.println(printIntersection(arr1, arr2));
    }


    // t.c O(n+m) s.c(max(n,m))
    public static int printIntersection(int arr1[],int arr2[]){
        
        int intersectionCount = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i =0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                set.remove(arr2[i]);
                intersectionCount++;
            }
        }

        return intersectionCount;
    }
    
}
