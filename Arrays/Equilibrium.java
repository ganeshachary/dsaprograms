public class Equilibrium {
    
    //part of prefirsum technique
    public static void main(String args[])
    {
        int arr[] = {3, 4, 8, -9, 20, 6,1};

        System.out.println(checkEquilibrium(arr));

    }
    
    //efficient way time O(N) space O(1)
    // to check if the sum of left and right of any specific postion is equal at a position
    static boolean checkEquilibrium(int arr[])
    {
        int sum = 0;
        for(int i =0;i<arr.length;i++)
        {
                sum += arr[i];
        }

        int l_sum=0;

        for(int i =0;i<arr.length;i++)
        {
            if(l_sum == sum-arr[i])
                return true;
            else {
                l_sum +=    arr[i];
                sum -=arr[i]; 
            }
        }

        return false;




    }

    // naive approach time O(N*N) space O(1)
    static boolean checkEquilibrium1(int arr[], int n)
    {
    	for(int i  = 0; i < n; i++)
    	{
    		int l_sum = 0, r_sum = 0;

    		for(int j = 0; j < i; j++)
    			l_sum += arr[j];

    		for(int j = i + 1; j < n; j++)
    			r_sum += arr[j];

    		if(l_sum == r_sum)
    			return true;
    	}

    	return false;
    }


}


