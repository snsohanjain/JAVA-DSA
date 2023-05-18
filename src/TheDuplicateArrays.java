import java.util.Arrays;

public class TheDuplicateArrays {

    public static void main(String[] args) {
        int [] num = {1,2,2,3,4,5,5,6};
        int [] res = removeDuplicates(num);
        System.out.println(Arrays.toString(res));

    }
    public static int [] removeDuplicates(int [] arr){
        int [] result = new int[arr.length]; // initializing the new array
        int idx = 0;                         // initializing the index

        for(int i = 0; i < arr.length; i++){ // Looping through the input array
            boolean isDuplicate = false;     // initializing the flag

            for(int j = 0; j < idx; j++){    // Looping through the index
                if(arr[i] == result[j]){     // checking the arrays duplicates
                    isDuplicate = true;      // changing the flag to true
                    break;                   // break the loop
                }
            }
            if(!isDuplicate){                // if it is not duplicate
                result[idx++] = arr[i];      // result [ index == idx] == arr [i]
            }
        }
        return Arrays.copyOf(result,idx);    // returning the new result array
    }
}
