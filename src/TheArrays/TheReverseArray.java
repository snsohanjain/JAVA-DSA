package TheArrays;

import java.util.Arrays;

public class TheReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] reversedArr = new int[arr.length];
        int i, j = 0;
        for(i = arr.length - 1; i >= 0; i--){
            reversedArr[j++] = arr[i];
        }
        System.out.println(Arrays.toString(reversedArr));

    }
}
