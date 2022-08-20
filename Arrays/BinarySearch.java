import java.util.Scanner;

public class BinarySearch {



    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
       
        int testCases = scan.nextInt();
    

        for(int i=0;i<testCases;i++){
         
            int inputSize = scan.nextInt();
    
            int[] intArray = new int[inputSize];
            for(int j=0;j<inputSize;j++){
                intArray[j] = scan.nextInt();
            }

            int element = scan.nextInt();
            System.out.println(search(intArray, element));

        }



        scan.close();
        

       
   
       

        


        }

    static int search(int arr[],int element){
           
        for(int i =0;i<arr.length;i++){
                if(arr[i]==element){
                    return 1;
                }
            }

            return 0;
    }
    
}
