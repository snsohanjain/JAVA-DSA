package TheArrays;

import java.util.Arrays;

public class TheBubbleSort {
    public static void main(String[] args) {
        int [] num = {1,3,4,2,1,3,4,5,6,7,8,9,8,7,4,2};

        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }



}
