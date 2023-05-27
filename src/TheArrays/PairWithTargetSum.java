package TheArrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int [] num = {10,20,30,40,50};
        int n = 30;
        pair(num,n);

    }
    public static void pair(int [] arr, int n){
        int [] result = new int[arr.length];
        int idx = 0;
        int status = 0;


        for (int i = 0; i < arr.length; i++) {
            boolean isPossible = false;
            for (int j = 0; j < idx; j++) {
                if(arr[i] + result[j] == n){
                    isPossible = true;
                    status = 1;
                }
            }if(!isPossible){
                result[idx++] = arr[i];
            }
        }
        if(status == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
