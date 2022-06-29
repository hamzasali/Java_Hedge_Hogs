package cihat;

public class LastDigit {

    public static void main(String[] args) {

        System.out.println(lastDigit(15, 5));
        System.out.println(lastDigit(15, 17));
        System.out.println(lastDigit(152, 222));
        System.out.println(lastDigit(151, 55));
    }


    public static boolean lastDigit(int num1, int num2) {
        return num1 % 10 == num2 % 10;
    }
}
