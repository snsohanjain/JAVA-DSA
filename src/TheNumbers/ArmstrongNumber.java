package TheNumbers;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;

        int temp = num;

        int result = 0;

        while (num > 0){
            int rem = num % 10;
            result = result + rem * rem * rem;
            num = num / 10;
        }

        if(result == temp){
            System.out.println("ArmstrongNumber");
        }
        else{
            System.out.println("Not ArmstrongNumber");
        }

    }
}
