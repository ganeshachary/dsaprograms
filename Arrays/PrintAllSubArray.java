public class PrintAllSubArray {


    public static void main(String args[]){
       // int A1[] = {8,6,5,7};
       // printAllSubarray(A1);

        // int A[] = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        // int B = 65;
        // printAllSubarraySumLessThanB(A, B);
    }


    // T.c O(N^3) s.c O(1)
    static void printAllSubarray(int A[]){

        int N = A.length;
        for(int i =0;i<N;i++){
            for(int j=i;j<N;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }

           

        }
    }

    // T.c O(N^3) s.c O(1)
    static void printAllSubarraySumLessThanB(int A[],int B){

        int count = 0;
       
        int N = A.length;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int sum = 0;
                int length = 0;
                for(int k=i;k<=j;k++){
                   sum += A[k];
                    length++;
                }
                if(sum!=0&&sum<B&&length%2==0){
                    count++;
                }else if(sum>B&&length%2!=0){
                    count++;
                }
                
            }

        }
        System.out.println(count);
    }


    
}
