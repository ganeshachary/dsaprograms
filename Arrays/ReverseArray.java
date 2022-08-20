public class ReverseArray {

    public static void main(String args[])
    {
        
            int arr[] = {1,2,3,5,6,7};
            if(arr.length>0){
                int first = 0;
                int last = arr.length-1;
             int result[] =   recursiveReverse(arr, first, last);
             printArray(result, result.length);

            }else{
                System.out.println("Array is empty so cannot perform the actions");
            }
    }


    static int[] recursiveReverse(int arr[], int first, int last)
    {
       
           
            if(last<=first)
                return arr;
        
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        
           return recursiveReverse(arr, first+1, last-1);
                

    }


    static void reverese(int arr[],int first, int last)
    {
        while(last>first){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        printArray(arr, arr.length);
    }


    static void printArray(int arr[],int size){
           
        System.out.println("");
        for(int i =0; i< size;i++){
                System.out.print(" "+arr[i]);
            }
    }
    
}
