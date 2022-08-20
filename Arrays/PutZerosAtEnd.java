public class PutZerosAtEnd {

    public static void main(String args[]){

        int arr[] = {0,5,2,10,0,0};
        moveWithSwap(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }


    // t.c O(Max(n+m)) s.p(1);
    static void moveZeroToEnd(int arr[]){

        int i =0;
        for(int j =0;j<arr.length;j++)
        {
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
        }

        while(i<arr.length){
            arr[i]=0;
            i++;
        }


    }


    // t.c O(N) // geeks for geeks s.c O(1)
    static void moveWithSwap(int arr[]){
        int count= 0;
        for(int i =0;i<arr.length;i++){

            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    
}
