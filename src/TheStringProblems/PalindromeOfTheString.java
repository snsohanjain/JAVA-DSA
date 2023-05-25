package TheStringProblems;


import java.sql.SQLOutput;

public class PalindromeOfTheString {
    public static void main(String[] args) {
        String str = "radar";

        char [] newStr = str.toCharArray();
        char [] reversedString = new char[str.length()];

        int i, j = 0;
        int flag = 0;

        for(i = newStr.length - 1; i >= 0; i--){
            reversedString[j++] = newStr[i];
        }

        for (int k = 0; k < str.length(); k++) {
            if(newStr[k] != reversedString[k]){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }

    }
}
