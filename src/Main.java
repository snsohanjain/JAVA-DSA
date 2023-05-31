
public class Main {
    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int result = 0;
        while (num > 0){
            int rem = num % 10;
            result = result * 10 + rem * rem * rem;
            num = num / 10;
        }
        if(temp == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not");
        }



    }

}