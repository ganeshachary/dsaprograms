import java.util.Scanner;

public class RotateArrayByReverse {


    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
    
        int[] intArray = new int[N];
   
        for(int i=0;i<N;i++){
            intArray[i] = scan.nextInt();
        }

        int shifts = scan.nextInt()%N; // %n if the value is greater than the size it will remove reminder after it rotation still will be same

        rotate(intArray, shifts, N);
        printArray(intArray, N);

        scan.close();
        
    }

    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void reverse(int array[],int from,int to){
       
        while(from<to){
           int temp =  array[from];
           array[from] = array[to];
           array[to] = temp;
           from++;
           to--;
        }
    }

    static void rotate(int array[],int k,int N){

        // rotate this in paper can see the logic will get it
        reverse(array, 0, N-1);
        reverse(array, 0, k-1);
        reverse(array, k, N-1);
    }
    
    
}
