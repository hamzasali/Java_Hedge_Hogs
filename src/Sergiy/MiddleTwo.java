package Sergiy;

public class MiddleTwo {

    public static String middleTwoChars(String str){
        String two = "" +str.substring(str.length()/2-1, str.length()/2+1);
        return two;
    }

    public static void main(String[] args) {

        System.out.println(middleTwoChars("aass"));

    }

}
