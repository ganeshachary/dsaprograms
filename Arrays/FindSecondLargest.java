public class FindSecondLargest {



    public static void main(String args[]){
        int arr[] ={2,11,1,13,10,4};
        System.out.println("Index of Second Largest in the array is  "+findSecondLargest(arr));
}


static int findSecondLargest(int arr[]){
        
        if(arr.length==0)
            return -1;
        if(arr.length==1)
            return 0;


        int max1 =0;
        int max2 =1;

        if(arr[max2]>arr[max1]){
            int temp = max1;
            max1 = max2;
            max2 = temp;

        }

        for(int i = 2;i<arr.length;i++)
        {
           if(arr[max2]<arr[i])
            {
                if(arr[max1]<arr[i])
                {
                   max2 = max1; 
                   max1 = i; 
                }else{
                    max2 = i;
                }
            }
              

        }

        System.out.println("second largest element is "+arr[max2]);

        return max2;
        
}
    
}
