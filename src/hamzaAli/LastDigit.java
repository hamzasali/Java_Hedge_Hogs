package hamzaAli;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 27));
    }

    public static boolean lastDigit(int n1, int n2) {
        return n1 % 10 == n2 % 10;
    }
}
