

public class LargestConsecutive1 {
    

    public static void main(String args[]){

        String s = "000000000000000";
        String s2 = "111111";

        System.out.println(solve2(s2));
    }


    public static  int solve(String A) {

        int prefixSum[] = new int[A.length()];
        int suffixSum[] = new int[A.length()];


        int countOfOne = 0;


        for(int i =0;i<A.length()-1;i++){

            if(A.charAt(i)=='1'){
                countOfOne++;
            }

            if(i==0){
                if(A.charAt(i)=='1')
                {
                    prefixSum[i] = 1;
                }else{
                    prefixSum[i] = 0;
                }
               
            }
            else if(A.charAt(i)=='0'){
                    prefixSum[i] = 0;
                }else{
                    prefixSum[i] = prefixSum[i-1] + 1;
                }
                  
              
           
          
        }

         for(int i =A.length()-1;i>=0;i--){
           

            if(i==A.length()-1){
                if(A.charAt(i)=='1')
                {
                    suffixSum[i] = 1;
                }else{
                    suffixSum[i] = 0;
                }
                
              }else if(A.charAt(i)=='0'){
                    suffixSum[i] = 0;
                }else{
                    suffixSum[i] = suffixSum[i+1] + 1;
                }
                  
              
           
        }

         int ans = 0;

         for(int i =A.length()-1;i>=0;i--){
            

               if(countOfOne==0||countOfOne==A.length()){
                    return countOfOne;
               }else{
                   // complete the logic
               }

         }

         return ans;


    }



    public static  int solve2(String A) {

        int count1s = 0;
        int ans = 0;

        int n = A.length();

        for(int i = 0;i<n;i++){
            
            if(A.charAt(i)=='1')
            {
                count1s++;
            }
               
        }

       

        for(int i=0;i<n;i++){

            if(A.charAt(i)=='0'){
             
                int l=0;
                for(int j = i-1;j>=0;j--){
                   
                    if(A.charAt(j)=='0'){
                        break;
                    }else{
                        l++;
                    }
                    
                   
                }

                int r=0;
                for(int j = i+1;j<n;j++){
                    
                    if(A.charAt(j)=='0'){
                        break;
                    }else{
                        r++;
                    }
                  
                }
                ans = Math.max(ans, l+1+r);
            }
            
        }


        if(count1s==n || count1s==0){
            return count1s;
        }

        if(ans>count1s){
             ans = ans-1;
        }

      

        return ans;
    }
}
