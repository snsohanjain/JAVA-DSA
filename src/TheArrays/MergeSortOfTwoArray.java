package TheArrays;

import java.util.Arrays;

public class MergeSortOfTwoArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9};
        int [] num2 = {1,3,4,2,1,3,4,5,6,7,8,9,8,7,4,2};

        int [] mergedArray = mergeArray(num1,num2);
        bubbleSort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));


    }
    public static int [] mergeArray(int [] arr1, int [] arr2){
        int [] newArray = new int[arr1.length + arr2.length];

        // copy the existing element to the new Array
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        int newIndex = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            newArray[newIndex] = arr2[i];
            newIndex++;
        }
        return newArray;
    }

    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[ j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[ j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
