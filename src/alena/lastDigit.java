package alena;

public class lastDigit {

    public static void main(String[] args) {
        System.out.println(lastDigit(77, 277));
    }

    public static boolean lastDigit(int n1, int n2) {
        return n1 % 10 == n2 % 10;
    }


}
