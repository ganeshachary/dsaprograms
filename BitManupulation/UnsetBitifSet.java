public class UnsetBitifSet {

    public static void main(String args[]){

    
        unsetTheSet();

    }

    // t.c O(logN) s.c O(1)
    public static void countSetBits(){

        int N = 10; // 1010 in binary 
        int ans = 0;
        while(N>0){ // as the >> divides number by 2 in binary t.c is T.c (LogN)
            if((N&1) == 1){  // anding any number with 1 is 1 if its set or 0 
                ans++;
            }
            N = N>>1; // we are shift each bit of N to right to and with 1 to count the set bits
        }

        System.out.println("Number of set bits are "+ans);


    }


    // this function is used to just unset the set bit;
    public static void unsetTheSet(){

       

        int N = 5;
        int i  = 2; // consider indexing right to left and from 0 the 2 is third position

        int bitCheck = 1;
        bitCheck = bitCheck<<(i);
        int result = N&bitCheck;
        if(result == bitCheck){ // if we do OR | then we will check if result == N;
            N = N^bitCheck;
            System.out.println("Bit is set and changed to unset result is "+N);
           
        }else{
            System.out.println("Bit is unSet");
        }
      
    }

    
}
