package TheStringProblems;

public class RemoveTheTargetElementOfString {
    public static void main(String[] args) {
        String str = "SOHANJAIN";
        char n = 'N';
        char [] newStr = str.toCharArray();
        Character [] ch = removeTargetString(newStr, n);
        String result = "";
        for(Character i: ch){
            result += i;
        }
        System.out.println(result);

    }
    public static Character [] removeTargetString(char [] arr, char n){

        Character [] result = new Character[arr.length - 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != n){
                result[j++] = arr[j];
            }
        }
        return result;
    }

}
