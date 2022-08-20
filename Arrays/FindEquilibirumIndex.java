public class FindEquilibirumIndex {



    // there can be multiple equilibirum point in arrays return k only returns the smallest index; i.e 3
    //if we loop below array till end it will retunr 6 index
    static int arr[] = {-7,1,5,2,-4,3,0};

    public static void main(String args[]){

        int preFixSum[] = findPrefixSum(arr);
        int suffixSum[] = createSuffixSum(arr);

        System.out.println(findEquilibirumIndex(arr, preFixSum, suffixSum));
        System.out.println(findEquilibirumIndexEasy(arr, preFixSum, suffixSum));

    

    }
    


    static int findEquilibirumIndexEasy(int arr[],int preFixSum[],int suffixSum[]){
       

        for(int k=0;k<arr.length;k++){

            if(preFixSum[k]==suffixSum[k]){
                return  k;
            }
        }

        return -1;
    }

    static int findEquilibirumIndex(int arr[],int preFixSum[],int suffixSum[]){
        

        for(int k=0;k<arr.length;k++){
            if(k==0){
                if(suffixSum[k+1]==0) {
                   return  k;
                }
                   
            }else if(k==arr.length-1){
                if(preFixSum[arr.length-2]==0){
                    return k;
                }
                   
            }
            else if(preFixSum[k-1]==suffixSum[k+1])
            {
                return  k;
            }

        }


        return -1;
    }



static int[] createSuffixSum(int arr[]){
        
    int suffixSum[] = new int[arr.length];

    if(arr.length>0){
        suffixSum[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1]+arr[i];
        }
     }

    return suffixSum;

     
}

static int[] findPrefixSum(int arr[]){

    int preFixSum[] = new int[arr.length];

    preFixSum[0] = arr[0];  // calculate the initial value as logic requires previous computated value in future logic 

    for(int i =1;i<preFixSum.length;i++)
    {
        preFixSum[i] = preFixSum[i-1]+arr[i];  // creating new array using old one and precalculated prefix index
    }

    return preFixSum;


}

}
