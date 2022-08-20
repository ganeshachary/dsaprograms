public class TrappingRainWater {
    

    public static void main(String args[]){
            int arr1[] = {3,0,1,2,5};
            int arr2[] = {5,1,6,3,4};
            int arr4[] = {5,1,3,4};
            System.out.println(trappedRain(arr1));
            System.out.println(trappedRain(arr2));
            System.out.println(trappedRain(arr4));
    }
    
    public static int trappedRain(int arr[]){
        int trappedWater =0;

          for(int i = 1;i<arr.length-1;i++)
          { 
            int leftmax = arr[i];
            for(int j=0;j<i;j++)
            {
                leftmax = Math.max(arr[j],leftmax);
            }
            int rightmax = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                rightmax = Math.max(rightmax,arr[j]);
            }

            trappedWater += (Math.min(leftmax, rightmax) - arr[i]);
          }

        return trappedWater;
            
    }
}
