package TheArrays;

import java.util.Arrays;

public class TheArraysInteger {
    public static void main(String[] args) {
        int[] num = new int[6];
        num[0]= 1;
        num[1]= 2;
        num[2]= 3;
        num[3]= 0;
        num[4]= 7;
        num[5]= 5;

        System.out.println(Arrays.toString(num));
        int[] uniqueArr = removeDuplicates(num);
        System.out.println(Arrays.toString(uniqueArr));

    }
    public static int[] removeDuplicates(int[] arr){
        int[] result = new int[arr.length]; // create a new array to store the result
        int idx = 0; // initialize an index variable for the result array

        for (int i = 0; i < arr.length; i++) { // loop through the input array
            boolean isDuplicate = false; // initialize a flag to check for duplicates

            // loop through the result array up to the current index
            for (int j = 0; j < idx; j++) {
                if (arr[i] == result[j]) { // check if the current element is a duplicate
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) { // if it's not a duplicate, add it to the result array
                result[idx++] = arr[i];
            }
        }

        // create a new array with only the non-zero elements of the result array
        return Arrays.copyOf(result, idx);

    }
}
