public class FrequencyInSortedArray {


        public static void main(String args[]){
            int arr1[] = {10,10,10,25,30,30};
            int arr2[] = {10,10,10,10};
            int arr3[] = {10,20,30};
            printFrequency(arr1);
            System.out.println();
            printFrequency(arr2);
            System.out.println();
            printFrequency(arr3);
        }



    static void printFrequency(int arr[]){

        int element = arr[0];
        int frequency = 0;
        
        for(int i = 0;i<arr.length;i++){
            
            if(arr[i] == element){
                frequency++;
            }else{
                System.out.println(arr[i-1]+" "+frequency);
                element = arr[i];
                frequency = 1; 
            }
        }
        
        System.out.println(element+" "+frequency);
    }
    
}
