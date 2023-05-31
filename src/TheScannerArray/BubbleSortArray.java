package TheScannerArray;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] num = new int[n];
        for (int i = 0; i < n; i++) {
            num [i] = scanner.nextInt();
        }
        bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
