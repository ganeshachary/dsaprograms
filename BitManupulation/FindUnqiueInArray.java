public class FindUnqiueInArray {

    public static void main(String args[]){

        int A[] = {1, 2, 2, 3, 1};

       //System.out.println(singleNumber(A));


        String s1 =  "100";
        String s2 = "11";

        addBinary(s1,s2);


    }

    public static int singleNumber(final int[] A) {
       int ans  =0;

       for(int i =0;i<A.length;i++){
            ans ^= A[i]; 
       }

       return ans;
        
    
    }

    public static  void addBinary(String A, String B) {

        int carry = 0;

        StringBuffer ABuffer = new StringBuffer(A);
        StringBuffer BBuffer = new StringBuffer(B);
        StringBuffer resultString = new StringBuffer();

        int sizeDiff = Math.abs(A.length()-B.length());
        
        if(sizeDiff!=0){
            
            while(sizeDiff>0){

                if(A.length()<B.length()){
                    ABuffer.insert(0,"0");
               }else{
                    BBuffer.insert(0,"0");
               }
               sizeDiff--;
            }
            

            }

            for(int i =ABuffer.length()-1;i>=0;i--){

                int result = 0;
                int a = Integer.parseInt(String.valueOf(ABuffer.charAt(i)));
                int b = Integer.parseInt(String.valueOf(BBuffer.charAt(i)));
                
                if(carry==0){
                     result = a+b;
                }else{
                     result = a+b+carry;
                }
               
                if(result==2){
                    carry = 1;
                    result = 0;
                }else if(result == 3){
                    carry = 1;
                    result = 1;
                }else{
                    carry = 0;
                }


                resultString.insert(0, result);
                
        
            }
            if(carry==1){
                resultString.insert(0, "1");
            }

            System.out.println(resultString);
        




        


        
        

    }

    
}
