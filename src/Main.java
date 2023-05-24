import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int num [] = {1,2,3,4,5,6,6,6,7,7,7,8,8,9,9,8,1,2,3,4,5,6};
        int [] result = duplicate(num);
        System.out.println(Arrays.toString(result));


    }
    public static int [] duplicate(int arr []){
        int [] result = new int[arr.length];
        int idx = 0;

        boolean isDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < idx; j++) {
                if(arr[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }if(!isDuplicate){
                result[idx++] = arr[i];
            }
        }
        return Arrays.copyOf(result,idx);
    }
}