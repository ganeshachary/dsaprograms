

public class InsertAtPos {
    
    static int size = 0;
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,0,0,0};
        size = 6;
        System.out.println("\n"+size);
        funInsertAt(arr, 3, arr.length, 10);
        System.out.println("\n"+size);
        funInsertAt(arr, 4, arr.length,20);
        System.out.println("\n"+size);
        funInsertAt(arr, 6, arr.length,50);
        System.out.println("\n"+size);
        funInsertAt(arr, 6, arr.length,80);
        System.out.println("\n"+size);

        fundeleteAt(arr,3, arr.length);
        System.out.println("\n"+size);

        fundeleteAt(arr,3, arr.length);
        System.out.println("\n"+size);

        fundeleteAt(arr,4, arr.length);
        System.out.println("\n"+size);

            
    }




    static void fundeleteAt(int arr[],int position, int capacity){
      
        if(size == 0)
        {
                System.out.println("Array is empty");
                return;
        }
        else if(position>size){
                System.out.println("Position is greater than size of Array");
                return;
        }

        for(int i = position;i<=size-1;i++ )
        {
                arr[i-1] = arr[i];
        }

        size--;
        
        printArray(arr, size);
    }


    

    static void  funInsertAt(int arr[],int position, int capacity,int value){
       



        if(size>=capacity) {
            System.out.println("\nArray is full");
            return;
            }

            for(int i = size-1;i>=position-1;i--){
                arr[i+1] = arr[i];
            }

            arr[position-1] = value;
            size++;
           

            printArray(arr, size);


            
    }


    static void printArray(int arr[],int size){
           
        System.out.println("");
        for(int i =0; i< size;i++){
                System.out.print(" "+arr[i]);
            }
    }
}
