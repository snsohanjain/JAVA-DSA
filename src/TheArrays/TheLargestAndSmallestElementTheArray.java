package TheArrays;

public class TheLargestAndSmallestElementTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int smallestNumber = arr[0];
        int largestNumber = arr[0];

        for(int i: arr){

            if(smallestNumber > i){
                smallestNumber = i;
            }

            if(largestNumber < i){
                largestNumber = i;
            }
        }
        System.out.println("smallestNumber " + smallestNumber);
        System.out.println("largestNumber " + largestNumber);

    }
}
