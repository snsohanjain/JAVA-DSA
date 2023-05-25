package TheArrays;

public class CountOddAndEven {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("oddNumber " + oddCount);
        System.out.println("evenNumber " + evenCount);
    }
}
