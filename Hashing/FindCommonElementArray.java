import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindCommonElementArray {

    public static void main(String args[]){

            int arr1[] =  {1, 2, 2, 1};
            int arr2[] =  {2, 3, 1, 2};
            findCommon(arr1, arr2);

        
    }


    public static void  findCommon(int arr1[],int arr2[]){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashMap<Integer,Integer> hp = new LinkedHashMap<>();

        for(int i = 0;i<arr1.length;i++)
        {
                if(hp.containsKey(arr1[i]))
                {
                    hp.put(arr1[i], hp.get(arr1[i])+1);
                }else{
                    hp.put(arr1[i],1);
                }
              
        }

    
        for(int i = 0;i<arr2.length;i++)
        {
                if(hp.containsKey(arr2[i]) && hp.get(arr2[i])>0)
                {
                    hp.put(arr2[i], hp.get(arr2[i]-1));
                    arrayList.add(arr2[i]);
                }
              
        }

        Collections.sort(arrayList);   



        System.out.println(arrayList);
    }
    
}
