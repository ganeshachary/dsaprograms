import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindLeaders {


    // find count of leaders that is whose right all terms are less than it.

    public static void main(String args[]){
        int A[] = {15,-1,7,2,5,4,-2,3};

        int B[] = createLeaderArray(A);
        for(int i : B){
            System.out.println(i);
        }

       // System.out.println(leaderCount(B));
    }


    static int leaderCount(int A[]){

        int leaders = 1;
        int max = A[A.length-1];
        for(int i = A.length-2;i>=0;i--){
                if(A[i]>max){
                    leaders++;
                    max = A[i];
                }
            }

        return leaders;    

    }

    static int[] createLeaderArray(int A[]){
        

        ArrayList<Integer> list = new ArrayList<Integer>();

        int max = A[A.length-1];
        list.add(max);
        for(int i = A.length-2;i>=0;i--){
               
            if(A[i]>max){

                max = A[i];
                list.add(max);
            }
         }

         int newArray[] = new int[list.size()];

         for(int i=0;i<list.size();i++){
                newArray[i] = list.get(i).intValue();
         }

         return newArray;

    }


    
    
}
