import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesArrayElemets {

    public static void main(String args[]){
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        printFrequencies(arr);

    }

    // t.c O(n) s.c(n)
    static void printFrequencies(int arr[]){
        
        Map<Integer,Integer> hashmap = new LinkedHashMap<>(); // used linkedhashmap instead of hashmap to maintain the order of elements;
        for(int i =0;i<arr.length;i++){
            if(hashmap.containsKey(arr[i])){
                hashmap.put(arr[i], hashmap.get(arr[i])+1);
            }else{
                hashmap.put(arr[i], 1);
            }
            
        }

        for(Map.Entry<Integer,Integer> i : hashmap.entrySet()){
            System.out.println(i.getKey() + " "+i.getValue());
        }
    }



    
}
