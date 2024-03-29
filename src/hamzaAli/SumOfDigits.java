package hamzaAli;

public class SumOfDigits {


    public static int sumOfDigitsLoop(int num) {
        int last, sum = 0;
        while (num > 0) {
            System.out.println("sum=" + sum);
            System.out.println("before changing: " + num);
            last = num % 10;
            System.out.println("last number: " + last);
            num = num / 10;
            System.out.println("after changing: " + num);
            sum += last;
            System.out.println("sum + last = " + sum);
            System.out.println("------");
        }
        if (sum > 10) {
            return sumOfDigitsLoop(sum);
        }
        return sum;
    }

    public static int sumOfDigitsRec(int num) {
        if (num == 0) return 0;
        int sum = num % 10 + sumOfDigitsRec(num / 10);
        return sum > 10 ? sum % 10 + sumOfDigitsRec(sum / 10) : sum;
    }

    public static void main(String[] args) {
        System.out.println("1: " + sumOfDigitsLoop(4931923));
        System.out.println("2: " + sumOfDigitsRec(4931923));
    }

}
