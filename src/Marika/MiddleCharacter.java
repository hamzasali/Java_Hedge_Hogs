package Marika;

public class MiddleCharacter {
    public static String middleCharacter(String word){
        int middleLetter = (word.length()/2);

        return (word.length() % 2 == 0) ? word.charAt(middleLetter-1)+""+word.charAt(middleLetter) : "Invalid";



}

    public static void main(String[] args) {
        System.out.println( middleCharacter("marika"));;

    }
}
