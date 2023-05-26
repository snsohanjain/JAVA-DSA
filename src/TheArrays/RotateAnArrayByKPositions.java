package TheArrays;

import java.util.Arrays;

public class RotateAnArrayByKPositions {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int [] newArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[j++] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
