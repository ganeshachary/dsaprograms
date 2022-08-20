public class PrintLeader {


    public static void main(String args[])
    {

            int arr[] = {7,10,4,3,6,5,2};
            printLeader2(arr);
           

    }

    // t.c O(N) s.c (1);
    static void printLeader2(int arr[]){
        int largestRightPos = arr.length-1;
        System.out.print(arr[largestRightPos]+" ");
        for(int i = largestRightPos-1;i>0;i-- ){
            if(arr[i]>arr[largestRightPos]){
                largestRightPos =  i;
                System.out.print(arr[largestRightPos]+" ");
            }
        }
        // u can use stack here to store and print in reverse order
        

    }

    //t.c O(n^2) s.c O(1)  //Naive
    static void printLeader(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            boolean leader = true;

            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<arr[j])
                    {
                        leader = false;
                    }
            }
            if(leader)
                System.out.print(arr[i]+" ");
        }
    }

    
}
