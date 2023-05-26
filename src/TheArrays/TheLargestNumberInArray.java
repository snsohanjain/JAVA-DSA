package TheArrays;

public class TheLargestNumberInArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int largest = 0;

        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        System.out.println(largest);

    }
}
