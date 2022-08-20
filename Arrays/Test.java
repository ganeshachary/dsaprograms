import java.util.Arrays;
import java.util.Scanner;

public class Test {
    


    public static void main(String args[]){

            int a[] = {5, 1, 10, 1};
            
            solveProduct(a);
            // int arr2[] = {-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333};
            // int B2 = 32;
            // int arr[] = {-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587 };
            // int B1 = 81;
            // System.out.println(solveMaxSumWindow(arr2, B2));
    
    }



    public static int solveMaxSumWindow(int[] A,int B){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
    
        for(int i=0;i<B;i++){
            currSum = currSum + A[i];
            
        }

        maxSum = Math.max(maxSum, currSum);

        int end = A.length-1;
        for(int i=B-1;i>=0;i--){
            currSum = currSum - A[i]+A[end];
            maxSum = Math.max(currSum, maxSum);
            end--;  
        }



       



        return maxSum;

    }


    public  static int[] solveProduct(int[] A) {

        int productArray[] = new int[A.length];
        
        int product = 1;
        
        for(int i =0;i<A.length;i++){
          product = product* A[i];     
        }

         for(int i =0;i<A.length;i++){
            
             productArray[i] =  (int)Math.exp(Math.log(product) -Math.log(A[i]));

             System.out.println(productArray[i]);

            }  
              


        return productArray;

    }


    public static long[] rangeSum(int A[], int[][] B) {
        
        long result[] = new long[B.length];
        int rows = B.length;
        int cols = B[0].length;
        long[] longA = Arrays.stream(A)
                        .mapToLong((i) -> (long) i)
                        .toArray();
        createPrefixSum(longA);
        int query[] = new int[cols];

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                query[j] = B[i][j];
            }
            result[i] = findRangeSum(query[0],query[1], longA);
          
        }
        
        return result;
    }

    static void createPrefixSum(long arr[]){
     
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i-1]+arr[i]; // creating new array using old one and precalculated prefix index
        }
        

    
    
    }
    

    static long findRangeSum(int L,int R,long arr[]){

        if(L==1){
           return arr[R-1];
        }else{
            return arr[R-1] - arr[L-1-1];
        }
    }

    public static int[][] solveMatrix(int[] A, int[] B) {
       
        int matrix[][] = new int[B.length][A.length];

        for(int i =0;i<B.length;i++){
            int newArr[] = A.clone();
            rotateLeftDtimes(newArr, A.length, B[i]);
            for(int j=0;j<A.length;j++){
                matrix[i][j] = newArr[j];
            }

        }


        return matrix;
    }


    public static void reverse(int A[],int from,int to ){

            while(from<to){
                int temp = A[from];
                A[from] = A[to];
                A[to] = temp;
                from++;
                to--;
            }
    }


    public static void printMatrix(int arr[][]){
      
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
    public static void printArray(int arr[]){
       
         for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)
            {
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(arr[i]+", ");
            }
            
        }
        System.out.println();
    }

    public static void rotateLeftDtimes(int A[],int N,int D){

        if(D!=0){
            D = D%N;
            reverse(A, 0, N-1);
            reverse(A, 0, N-1-D);
            reverse(A,N-D, N-1);
        
        }
           
    }


    public static void printOddEvenArray(){
        
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
       

        for(int j =0;j<testCases;j++){
            int N = scan.nextInt();
            int arr[] = new int[N];
            
            for(int i =0;i<N;i++){
                arr[i] = scan.nextInt();

            }

            int oddarr[] = new int[N];
            int oddSize = 0;
            int evenarr[] = new int[N];
            int evenSize = 0;

            for(int i =0;i<N;i++){
               if(arr[i]%2==0){
                   evenarr[evenSize] = arr[i];
                   evenSize++;
               }else{
                     oddarr[oddSize] = arr[i];
                     oddSize++;
               }
            }


            for(int i =0;i<oddSize;i++){
                System.out.print(oddarr[i]+" ");
            }
            
            
            System.out.println();

            for(int i =0;i<evenSize;i++){
                System.out.print(evenarr[i]+" ");
            }

            System.out.println();

           
            

        }
    }


    public static int secondLargestElement(int[] A) {

        
        if(A.length<2)
            return -1;

             int firstIndex = 0;
             int first = Integer.MIN_VALUE;
             int second = Integer.MIN_VALUE;


             for(int i=0;i<A.length;i++){
                
                if(A[i]>first){
                    firstIndex = i;
                    first = A[i];
                }
                
             }


             for(int i=0;i<A.length;i++){
                
                if(A[i]>second && i!=firstIndex){
                   second = A[i];
                }
                
             }
             
             return second;
        
 
 
     }

    public int solve(int[] A, int B) {

        for(int i = 0;i<A.length-1;i++){
           for(int j = i+1;j<A.length;i++){
               if(A[i]+A[j]==B){
                   return 1;
               }   
           }
        }

        return 0;

    }


    public static int[] solve2(final int[] A) {
        
        if(A.length==1){
            System.out.println(A[0]);
        }else
        {
            int i = 0;
            int j = A.length-1;
            while(i<j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }

        return A;
    }
}
