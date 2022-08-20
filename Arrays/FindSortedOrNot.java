public class FindSortedOrNot {
    

    public static void main(String args[]){

            int arr[] = {1,2,5,6,8};
            System.out.println(findSorted(arr));
    }

    static boolean findSorted(int arr[]){

        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i]){
                return false;
            }
                
        }
        return true;
    }
}
