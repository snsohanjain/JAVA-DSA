package TheStringProblems;

public class StringLength {
    public static void main(String[] args) {
        String str = "SOHANJAIN";
        char[] newStr = str.toCharArray();
        int stringLength = 0;
        for(char i : newStr){
            stringLength++;
        }
        System.out.println(stringLength);
    }
}
