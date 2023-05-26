package TheArrays;

public class TheReverseNumber {
    public static void main(String[] args) {
       int num = 123456;
       int reversed = 0;
       while (num != 0){
           int rem = num % 10;
           reversed = reversed * 10 + rem;
           num = num / 10;
       }
        System.out.println(reversed);

    }
}
