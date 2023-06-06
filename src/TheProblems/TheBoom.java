package TheProblems;

public class TheBoom {
    public static void main(String[] args) {
        String boom = "X00XXXXX000";
        int xCount = 0;
        int zeroCount = 0;
        for (char ch: boom.toCharArray()){
            if(ch == 'X'){
                xCount++;
            }
            if(ch == '0'){
                zeroCount++;
            }
        }
        if(xCount > zeroCount){
            System.out.println("Boom Blasted");
        }else {
            System.out.println("All are Safe");
        }
    }
}
