package TheLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveTheDuplicatesInLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);

        int j = 0;
        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[j++] = list.get(i);
        }
        int [] finalResult = removeDuplicate(result);
        list.clear();

        for(int ch: finalResult){
            list.add(ch);
        }
        System.out.println(list);

    }
    public static int [] removeDuplicate(int [] arr){
        int [] result = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < idx; j++) {
                if(arr[i] == result[j]){
                   isDuplicate = true;
                   break;
                }
            }if(!isDuplicate){
                result[idx++] = arr[i];
            }
        }return Arrays.copyOf(result,idx);
    }
}
