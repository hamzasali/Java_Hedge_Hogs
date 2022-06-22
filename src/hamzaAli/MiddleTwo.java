package hamzaAli;

public class MiddleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("apple" ));
    }

    public static String middleTwo(String str) {
        int l = str.length();
        return (l % 2 == 0) ? str.substring(l / 2 - 1, l / 2 + 1) : "Invalid";
    }
}
