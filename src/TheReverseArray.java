import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheReverseArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        reverse(num);
    }
    public static void reverse(int [] arr){
        int [] result = new int[arr.length];           //O1
        List<Integer> list = new ArrayList();          //O1

        for(int i = result.length - 1; i >= 0; i--){   //On
            list.add(arr[i]);
        }

        int [] reversedArr = new int[list.size()];     //O1
        for(int i = 0; i < list.size(); i++){          //On
            reversedArr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(reversedArr));
        // The time complexity is On2
    }
}
