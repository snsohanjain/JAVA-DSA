package TheArrays;

public class CheckIfArraySubsetAnotherArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {7,8,9,8,9,10,11};

        int count = 0;
        int idx = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < idx; j++) {
                if(arr1[i] == arr2[j]){
                    isDuplicate = true;
                    count++;
                }
            }if(!isDuplicate){
                arr2[idx++] = arr1[i];
            }
        }
        System.out.println(count);
    }
}
