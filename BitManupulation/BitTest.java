public class BitTest {



    public static void main(String args[]){

        int A = 5;
           int count  = 0;
          while(A > 0)
          {
             if((A&1)==1)
             {
                 count++;
             }
             
              A = A >> 1;
          }

          System.out.println(count);

          A = 5;

          int ans = 0;
        
          while(A>0){
  
              if((A&1)==1){
                   ans++;
              }
              A = A>>1;
          }
          

          System.out.println(ans);
        
  
         
  
    }
    
}
