

class ArrayRotation{

    static int arr[] = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String args[]){
        

            // tip to remember rotatation is greater than lenght then rotation can be reduced by newrotation = (rotation - length of arr)

            rotateDTimesWithReverse(2, arr);
            // rotateArray(2);
            // rotateArray(2);
            // rotateArray(3);


        }



        //Efficient way using reversal t.c(N) and s.c (1)

        //time complexity 
        // time = d+n-d+n = 2n = O(N)
        // space = O(1)


        static void reverse(int arr[],int low, int high){
           
            while(low<high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
           
        }

        static void rotateDTimesWithReverse(int d,int arr[]){
            int n = arr.length;

            reverse(arr, 0, d-1);
            reverse(arr, d, n-1);
            reverse(arr, 0, n-1);

            printArray(arr,arr.length);
        }








        // using a temp array time O(N) and space O(N)
        static void rotateArray(int k){
            int temp[] = new int[k];
           
            for(int i = 0;i<k;i++)
            {
                temp[i] = arr[i];
            }

            for(int i = k;i<= arr.length-1;i++ ){
                arr[i-k] = arr[i]; 
             }


             for(int i = 0;i<k;i++)
             {
                 arr[arr.length-(k-i)] = temp[i];
             }

            printArray(arr, arr.length);

        }


        
        // rather than using auxillary space as above use constant space of O(1) and time N(d) where d is no of times u rotate the array

        static void rotateDtimes(int d,int arr[]){

            if(arr.length>=1)
            {
                int rotation = 0;
                int last = arr.length-1;
                int first = (arr.length-1)-last;
                
                while(rotation<d){
                   
                    int firstElement = arr[first];
                   
                    for(int i= 0 ; i< last;i++)
                    {
                        arr[i] = arr[i+1];
                    }

                    arr[last] = firstElement;
                    
                    rotation++;
                    printArray(arr, arr.length);
                }
            }

            
           
    
          
        }

        static void printArray(int arr[],int size){
           
            System.out.println("");
            for(int i =0; i< size;i++){
                    System.out.print(" "+arr[i]);
                }
        }

}