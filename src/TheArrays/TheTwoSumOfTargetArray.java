package TheArrays;

public class TheTwoSumOfTargetArray {
    public static void main(String[] args) {
        int [] num = {1,3,5,10};
        int idx = 0;
        int givenNumber = 15;

        boolean isAddAble = false;
        for(int i = 0; i < num.length; i++){

            for (int j = 0; j < idx; j++){
                if((num[i] + num[j]) == givenNumber){
                    isAddAble = true;
                    System.out.println(num[i] + " " + num[j]);
                    break;
                }
            }
            if (!isAddAble) {
                num[idx++] = num[i];
            }

        }
        System.out.println(isAddAble);
    }
}
