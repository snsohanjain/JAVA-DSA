package ThePrintPattren;

public class PrintHollowNxNBox {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
