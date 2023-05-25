package TheArrays;

public class TheSearchElementInTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        int flag = 0;
        for(int i: arr){
            if(i == key){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Key Found");
        }else {
            System.out.println("Key Not Found");
        }
    }
}
