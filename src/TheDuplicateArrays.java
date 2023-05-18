import java.util.Arrays;

public class TheDuplicateArrays {

    public static void main(String[] args) {
        int [] num = {1,2,2,3,4,5,5,6};
        int [] res = removeDuplicates(num);
        System.out.println(Arrays.toString(res));


    }
    public static int[] removeDuplicates(int arr []){
        int [] result = new  int[arr.length]; // initializing the new array
        int idx = 0;

        for (int i = 0; i < arr.length; i++){ // Loop through the input array
            boolean isDuplicate = false;      // add a flag

            // Loop through the result array up-to the current index
            for(int j = 0; j < idx; j++){
                if(arr[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[idx++] = arr[i];
            }

        }
        return Arrays.copyOf(result,idx);
    }
}
