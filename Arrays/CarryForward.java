class CarryForward{

    // find the pairs count (a,g) s.t i<j

    public static void main(String args[]){

        char A[] = {'b','a','a','g','d','c','a','g'};

        String s = "ABCGAG";
        String s1 = "GAB";
        char B[] = s.toCharArray();
        System.out.println(countpairs(B));

    }



    static int countpairs(char A[]){

        int modulo = ((int) Math.pow(10, 9)) + 7;

        if(A.length<=1){
            return 0;
        }
        
        
        int count = 0;
        int ans = 0;

        for(int i =A.length-1;i>=0;i--){
            
            if(A[i]=='G'){
                count = (count + 1)%modulo;
            }
            else if(A[i]=='A'){
                ans = (ans + count)%modulo;
            }
        }

    
        return ans;
    }




}