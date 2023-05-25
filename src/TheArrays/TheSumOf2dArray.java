package TheArrays;

public class TheSumOf2dArray {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4,5},{1,2,3,4,5}};

        int sum1 = 0;

        for (int i = 0; i < num.length ; i++)
            for (int j = 0; j < num.length; j++)
                sum1 += num[i][j];

        System.out.println(sum1);
    }
}
