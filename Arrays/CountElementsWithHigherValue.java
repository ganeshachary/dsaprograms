public class CountElementsWithHigherValue {



    public static void main(String args[]){

        int a[] = {10,3,10,8,2,10,10,8};
        int a2[] = {-3,-2,6,8,4,8,5};
        System.out.println(elementsCount(a));
        System.out.println(elementsCount(a2));
        
    }


    static int elementsCount(int a[]){

        int count = 0;
        int max =a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]==max){
                count++;
            }else if(a[i]>max){
                max = a[i];
                 count = 1;
            }
        }


        return  a.length-count;
    }
    
}
