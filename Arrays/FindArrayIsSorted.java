public class FindArrayIsSorted {

    public static void main(String args[]){
            int arr[] = {1,2,3,4,5,6};
            int arr2[] = {3,1,4,5,9};
            int arr3[] = {1,2};

            System.out.println(isSorted(arr));
            System.out.println(isSorted(arr2));
            System.out.println(isSorted(arr3));
    }

    static boolean isSorted(int arr[])
    {

        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    
}
