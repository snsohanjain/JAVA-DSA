package TheArrays;

public class TheLargestElementInTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int largestNumber = 0;
        for(int i : arr){
            if(largestNumber < i){
                largestNumber = i;
            }
        }
        System.out.println(largestNumber);
    }
}
