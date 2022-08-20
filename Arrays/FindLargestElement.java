class FindLargestElement{


    public static void main(String args[]){
            int arr[] ={12,15,1,3,10,4};
            System.out.println("Index of Largest in the array is  "+findLargest(arr));
    }


    static int findLargest(int arr[]){
            
            if(arr.length==0)
                return -1;

            int max = arr[0];
            int idx = 0;

            for(int i = 1;i<arr.length;i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                    idx = i;
                }
                  

            }

            return idx;
            
    }
}
