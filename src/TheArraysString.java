import java.util.Arrays;

public class TheArraysString {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "black";
        colors[3] = "green";
        colors[4] = "pink";

        //1
        System.out.println(colors[0]);

        //2
        System.out.println(Arrays.toString(colors));

        //3
        for(int i =0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        //4
        for(int i = colors.length - 1; i >= 0; i--){
            System.out.println(colors[i]);
        }
        //5
        for(String color : colors){
            System.out.println(color);
        }
        //6
        Arrays.stream(colors).forEach(System.out::println);
    }
}
