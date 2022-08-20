public class RemoveDuplicates {

    public static void main(String args[]){

        int arr[] = {10,10, 20, 20, 30, 30, 30,35}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();


       n = removeDuplicate(arr);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    }

    static int removeDuplicate(int arr[]){
        int i =1;
         for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[j-1]){
                arr[i] = arr[j];
                i++;
            }

        }

    
        return i;
    }
    
}
