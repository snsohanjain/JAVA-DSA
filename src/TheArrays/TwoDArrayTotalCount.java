package TheArrays;

public class TwoDArrayTotalCount {
    public static void main(String[] args) {
        int [][] num = {{5,6,7,8,9},{1,2,3,4,5}};
        int totalCount = totalCount(num);
        System.out.println(totalCount);
        int totalCalculate = totalCalculate(num);
        System.out.println(totalCalculate);
        int secondRowTotal = totalOfSecondRow(num,1);
        System.out.println(secondRowTotal);
    }
    // CALCULATE TOTAL COUNT OF THE 2D ARRAY
    public static int totalCount(int [] [] arr){
        int total = 0;
        for(int [] num: arr){
            total += num.length;
        }
        return total;
    }
    // CALCULATE TOTAL OF THE 2D ARRAY
    public static int totalCalculate(int [][] arr){
        int total = 0;
        for(int [] num: arr){
            for(int element: num){
                total += element;
            }
        }
        return total;
    }
    //CALCULATE 2ND ROW OF THE 2D ARRAY
    public static int totalOfSecondRow(int [][] arr, int rowIndex){
        int total = 0;
        if(rowIndex >=0 && rowIndex <= arr.length) {
            for (int element : arr[rowIndex]) {
                total += element;
            }
        }
        return total;
    }
}
