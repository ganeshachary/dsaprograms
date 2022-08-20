public class Palidrome {


    public static void main(String args[])
    {
            String str = "malayalm";
           
            if(isPalidrome("malayalamm",0 , str.length()-1))
                 System.out.println("Its Palidrome");
            else System.out.println("Its not Palidrome"); 
                      
    }

    static boolean isPalidrome(String s, int start, int end){

        if(start>=end)
            return true;

        return((s.charAt(start) == s.charAt(end)) &&  isPalidrome(s, start+1, end-1));    
    }
    
}
