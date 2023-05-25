package TheStringProblems;

public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        String str1 = "SOHAN";
        String str2 = "JAIN";
        String newStr = "";
        for (char ch: str1.toCharArray()) {
            newStr += ch;
        }
        for(char ch: str2.toCharArray()){
            newStr += ch;
        }
        System.out.println(newStr);
     }
}
