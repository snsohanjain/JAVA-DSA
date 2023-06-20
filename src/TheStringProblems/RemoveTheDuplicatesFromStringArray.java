package TheStringProblems;

import java.util.Arrays;

public class RemoveTheDuplicatesFromStringArray {
    public static void main(String[] args) {
        String [] names = {"SOHAN","JAIN","SOHAN","SOHAN"};
        String [] result = removeDuplicate(names);
        System.out.println(Arrays.toString(result));
    }
    public static String [] removeDuplicate(String [] names){
        String [] result = new String[names.length];
        int idx = 0;
        for (int i = 0; i < names.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < idx; j++) {
                if(names[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }if(!isDuplicate){
                result[idx++] =  names[i];
            }
        }return Arrays.copyOf(result,idx);
    }
}
