package TheStringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String name = "SOHANJAIN";

        char [] str = name.toCharArray();

        char [] reversedString = new char[name.length()];

        int j = 0;

        for(int i = str.length - 1; i >= 0; i--){

            reversedString[j++] = str[i];
        }

        System.out.println(reversedString);
    }
}
