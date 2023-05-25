package TheStringProblems;

public class LowerAndUpperProblem {
    public static void main(String[] args) {

        String name = "sohanjain";

        char [] str = name.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if(str[i] >= 'a' && str[i] <= 'z'){
                str[i] -= 32;
            }else if(str[i] >='A'&& str[i] <= 'Z'){
                str[i] += 32;
            }
        }
        System.out.println(str);
    }
}
