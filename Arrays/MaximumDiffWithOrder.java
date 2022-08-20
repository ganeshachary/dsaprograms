public class MaximumDiffWithOrder {


    public static void main(String args[]){
        int arr1[] = {2,3,10,6,4,8,1};
        int arr2[] = {7,9,5,6,3,2};
        int arr3[] = {10,30,20};
        int arr4[] = {30,10,8,2};
         maximumDiffEfficient(arr1);
         maximumDiffEfficient(arr2);
         maximumDiffEfficient(arr3);
         maximumDiffEfficient(arr4);
    }


    // t.c O(N) s.cO(1)
    static void maximumDiffEfficient(int arr[]){

        int max = arr[1]-arr[0]; // calculate subraction with right element
        int minvalue = arr[0];  // store the left most min value

        for(int i =1;i<arr.length;i++){
            max = Math.max(max, arr[i]-minvalue); //calculate subraction with right element with minvalue till u get max sum;
            minvalue = Math.min(minvalue,arr[i]);
        }

        System.out.println(max);
    }




    // t.c O(n^2) s.c O(1)
    static void maximumDiff(int arr[]){

        int highestDiff = arr[1]-arr[0];
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>highestDiff)
                {
                    highestDiff = arr[j]-arr[i];
                }
            }
        }

        System.out.println(highestDiff);


    }
}
