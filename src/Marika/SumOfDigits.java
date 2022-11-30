package Marika;

public class SumOfDigits {
    public static int sumOfDigits(int n) {

        if (n > 0 && n>= 10) {
            int result = n % 10 + sumOfDigits(n / 10);
            if (result >= 10) {
                return sumOfDigits(result);
            } else {
                return result;
            }

        } else {
            return n;
        }

    }

    public static void main(String[] args) {
        int n = 942;
        System.out.println(sumOfDigits(n));
    }
}
