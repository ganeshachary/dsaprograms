class SearchArrayBasic {
    


    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};
        int x = 9;
        if(arr.length>0){
            int l = 0;  // setting the lower bound index
            int r = arr.length - 1; // setting the upper  bound index
            if(searchRecurrsive(arr, l, r, x)){
                System.out.println(x+" is present in the array");
            }else{
                System.out.println(x+" is  absent in the array");
            }
        }

    }


    static boolean searchRecurrsive(int arr[],int l,int r,int x){

        if(r<l)
            return false; // this case happend when all indexes are checked and no match happened
        if(arr[l] == x)    
            return true;
        if(arr[r] == x)
            return true;  
        
        return searchRecurrsive(arr, l+1, r-1, x);    
    }
}
