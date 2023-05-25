package TheStringProblems;

public class CompareTwoString {
    public static void main(String[] args) {
        String str1 = "SOHANJAIN";
        String str2 = "SOHANJAIN";

        char [] newStr1 = str1.toCharArray();
        char [] newStr2 = str2.toCharArray();

        int status = 0;

        if (str1.length() == str2.length()){
            for (int i = 0; i < newStr1.length; i++) {
                    if(newStr1[i] != newStr2[i]){
                        status = 1;
                        break;
                    }
            }

        }
        if(status == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
