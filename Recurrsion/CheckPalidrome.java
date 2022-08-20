class CheckPalidrome {


    public static void main(String args[])
    {
            String token = "malayalama";
            char[] tokenArray = token.toCharArray();
            if(tokenArray.length > 0)
            {
                int l = 0;
                int r = tokenArray.length -1;
                if(checkPalidrome(tokenArray, l, r))
                    System.out.println("Its palidrome");
                else 
                    System.out.println("Its not palidrome");
                 
            }
    }


    static boolean checkPalidrome(char arr[],int l, int r)
    {

            if(l==r)       // index is same then its only one elemet in the arrya or its the middle elemet , as index is same the char at the index will be same; 
                return true;

            if(arr[l]!=arr[r])
                return false;
            
            if(l<r)
                return checkPalidrome(arr, l+1, r-1);
            

            return true;
    }
}