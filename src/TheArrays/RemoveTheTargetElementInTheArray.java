package TheArrays;

import java.util.Arrays;

public class RemoveTheTargetElementInTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = 5;
        int [] result = removeTarget(arr,n);
        System.out.println(Arrays.toString(result));

    }
    public static int [] removeTarget(int arr [], int n){
        int [] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != n) {
                result[j++] = arr[i];
            }
        }
        return result;

    }
}
