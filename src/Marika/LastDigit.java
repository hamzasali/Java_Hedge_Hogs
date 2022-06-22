package Marika;

public class LastDigit {
    public static boolean lastDigit(int num1, int num2) {
        return  num2 %10 == num1 %10;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(27,17));

    }
}
