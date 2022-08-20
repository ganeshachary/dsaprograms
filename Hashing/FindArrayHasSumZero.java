import java.util.HashSet;
import java.util.Set;

public class FindArrayHasSumZero {
   
    public static void main(String args[]){ 
        int arr[] = {1,2,-3,4,5};
        if(findSumZero(arr))
            System.out.println(1);
        else System.out.println(0);       
    }


    static boolean findSumZero(int arr[]){
    
        Set<Integer> set = new HashSet<Integer>();

        int sum =0;
        
        for(int i =0;i<arr.length;i++)
            {
                sum += arr[i];
                if(sum==0 || set.contains(sum) || arr[i] == 0)
                    return true;
                set.add(i);
            }
        
        return false;
    }




}
