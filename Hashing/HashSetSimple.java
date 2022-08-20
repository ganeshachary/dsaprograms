import java.util.HashSet;
import java.util.Iterator;

public class HashSetSimple {

    public static void main(String args[]){

        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);

        for(Integer i : h){
            System.out.println(i);
        }
        System.out.println();

        h.remove(30);
       
        Iterator<Integer> i = h.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }


    }    
}
