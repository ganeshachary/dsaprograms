public class RemoveElemetToMakeOddandEvenIndexsumzero {


    public static void main(String args[]){

        int A[]= {2, 1, 6, 4};
        int B[] = {1, 1, 1}; 
        System.out.println(countIndex(A));
    }


    static int countIndxes(int A[])
    {
    
        int size = A.length;
        // If size of the array is 1
        if (size == 1)
        {
            return 1;
        }
     
        // If size of the array is 2
        if (size == 2)
            return 0;
     
        // Stores sum of even-indexed
        // elements of the given array
        int evenSum = 0;
     
        // Stores sum of odd-indexed
        // elements of the given array
        int oddS = 0;
     
        // Traverse the array
        for (int i = 0; i < size; i++)
        {
     
            // If i is an even number
            if (i % 2 == 0)
            {
     
                // Update evenSum
                evenSum += A[i];
            }
     
            // If i is an odd number
            else
            {
     
                // Update oddS
                oddS += A[i];
            }
        }
     
        // Stores sum of even-indexed
        // array elements till i-th index
        int currOdd = 0;
     
        // Stores sum of odd-indexed
        // array elements till i-th index
        int currEven = A[0];
     
        // Stores count of indices whose
        // removal makes sum of odd and
        // even indexed elements equal
        int countIndex = 0;
     
        // Stores sum of even-indexed elements
        // after removing the i-th element
        int newEvenSum = 0;
     
        // Stores sum of odd-indexed elements
        // after removing the i-th element
        int newOddSum = 0;
     
        // Traverse the array
        for (int i = 1; i < size - 1; i++)
        {
     
            // If i is an odd number
            if (i % 2 != 0)
            {
     
                // Update currOdd
                currOdd += A[i];
     
                // Update newEvenSum
                newEvenSum = currEven + oddS
                             - currOdd;
     
                // Update newOddSum
                newOddSum = currOdd + evenSum
                            - currEven - A[i];
            }
     
            // If i is an even number
            else
            {
     
                // Update currEven
                currEven += A[i];
     
                // Update newOddSum
                newOddSum = currOdd + evenSum
                            - currEven;
     
                // Update newEvenSum
                newEvenSum = currEven + oddS
                             - currOdd - A[i];
            }
     
            // If newEvenSum is equal to newOddSum
            if (newEvenSum == newOddSum)
            {
     
                // Increase the count
                countIndex
    ++;
            }
        }
     
        // If sum of even-indexed and odd-indexed
        // elements is equal by removing the first element
        if (oddS == evenSum - A[0])
        {
     
            // Increase the count
            countIndex
++;
        }
     
        // If length of the array
        // is an odd number
        if (size % 2 == 1)
        {
     
            // If sum of even-indexed and odd-indexed
            // elements is equal by removing the last element
            if (oddS == evenSum - A[size - 1])
            {
     
                // Increase the count
                countIndex
    ++;
            }
        }
     
        // If length of the array
        // is an even number
        else
        {
     
            // If sum of even-indexed and odd-indexed
            // elements is equal by removing the last element
            if (evenSum == oddS - A[size - 1])
            {
     
                // Increase the count
                countIndex
    ++;
            }
        }
     
        return countIndex;
    }


    static int countIndex(int A[])
    {
    
        int size = A.length;

        if (size == 1)
        {
            return 1;
        }
        if (size == 2)
            return 0;
     
       
        int evenSum = 0;
    
        int oddS = 0;
    
        for (int i = 0; i < size; i++)
        {
    
            if (i % 2 == 0)
            {
     
                evenSum += A[i];
            }
     
            else
            {
     
                oddS += A[i];
            }
        }
     
        int currOdd = 0;
     
        int currEven = A[0];
     
        int countIndex = 0;
     
        int newEvenSum = 0;
     
        int newOddSum = 0;
     
        for (int i = 1; i < size - 1; i++)
        {
     
            if (i % 2 != 0)
            {
     
                currOdd += A[i];
     
                newEvenSum = currEven + oddS
                             - currOdd;
     
                newOddSum = currOdd + evenSum
                            - currEven - A[i];
            }
     
            else
            {
     
                currEven += A[i];
     
                newOddSum = currOdd + evenSum
                            - currEven;
     
                newEvenSum = currEven + oddS
                             - currOdd - A[i];
            }
     
            if (newEvenSum == newOddSum)
            {
     
                countIndex++;
            }
        }
    
        if (oddS == evenSum - A[0])
        {
     
            countIndex++;
        }
    
        if (size % 2 == 1)
        {
     
    
            if (oddS == evenSum - A[size - 1])
            {
    
                countIndex++;
            }
        }
    
        else
        {
     
           
            if (evenSum == oddS - A[size - 1])
            {
     
            
                countIndex++;
            }
        }
     
        return countIndex;
    }
    
}
