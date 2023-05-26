package TheNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitNumberIntoDigits {
    public static void main(String[] args) {
        int num = 123456789;

        List<Integer> list = new ArrayList<>();
        while (num != 0){
            int rem = num % 10;
            list.add(rem);
            num = num / 10;
        }

        int listArr [] = new int[list.size()];

        int j = 0;

        for (int i = 0; i < listArr.length; i++) {
            listArr[j++] = list.get(i);
        }

        // IN REVERSE ORDER
        System.out.println(Arrays.toString(listArr));

        int resultArr[] = new int[listArr.length];

        int k = 0;
        for (int i = listArr.length - 1; i >= 0; i--) {
            resultArr[k++] = listArr[i];
        }

        // IN CORRECT ORDER
        System.out.println(Arrays.toString(resultArr));

    }
}
