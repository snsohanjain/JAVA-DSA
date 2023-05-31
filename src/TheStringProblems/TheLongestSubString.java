package TheStringProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class TheLongestSubString {
    public static void main(String[] args) {
        String name = "SOHANJAIN";
        char [] arr = name.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                if(arr[i] == arr[i + 1]){
                    set.clear();
                }
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
