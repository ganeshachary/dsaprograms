public class StockBuySell {
    


    public static void main(String args[]){

        int arr1[] =  {1,5,3,8,12};
        int arr2[] =  {30,20,10};
        int arr3[] =  {10,20,30};
        int arr4[] =  {1,5,3,1,2,8};

        System.out.println(buySell(arr1));
        System.out.println(buySell(arr2));
        System.out.println(buySell(arr3));
        System.out.println(buySell(arr4));
    }


    // t.c O(n) s.c O(1) most efficient solutions
    // the basic logic is to buy at low and sell at high price 
    // logic is to subract low value with next high value keep adding diff i.e profit and total is the answer.

    public static int buySell(int arr[]){

        int profit = 0;
        for(int i=1;i<arr.length;i++){

           if(arr[i]>arr[i-1])
           {
             profit+=(arr[i]-arr[i-1]);  // hear you compare previous with next if next is higher sell that diff is profit or hold till price hike;
           }

        }

        return profit;
    }

   
}
