package TheStringProblems;

public class CountVowels {
    public static void main(String[] args) {

        String str = "SOHANJAIN";
        char [] newStr = str.toCharArray();
        int count = 0;

        for(char i : newStr){
            if(i == 'a' || i == 'e'|| i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U'){
                count++;
            }
        }
        System.out.println(count);

    }
}
