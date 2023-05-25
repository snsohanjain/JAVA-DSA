package TheStringProblems;

import java.util.Set;

public class StringCopy {
    public static void main(String[] args) {
        String str = "SOHANJAIN";
        String strCopy = "";
        for(char ch: str.toCharArray()){
            strCopy += ch;
        }
        System.out.println(strCopy);
    }
}
