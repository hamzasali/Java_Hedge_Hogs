package week_32;

public class SumOfDigits {

    public static int digitalRootCihat(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        if (sum < 10) {
            return sum;
        }
        return digitalRootCihat(sum);
    }

    public static int findSumTatiana(int number){
        return number==0 ? 0 : number % 10+findSumTatiana(number/10);
    }

    private static int digitalRootMizgin_Marika(int n) {

        if (n < 10) {
            return n;
        } else {

            int sum = n % 10 + digitalRootMizgin_Marika(n / 10);

            if (sum > 10) {
                return digitalRootMizgin_Marika(sum);
            } else {
                return sum;
            }

        }
    }

    public static int sumOfDigitsHamza1(int num) {
        if (num == 0) return 0;
        int sum = num % 10 + sumOfDigitsHamza1(num / 10);
        return sum > 10 ? sum % 10 + sumOfDigitsHamza1(sum / 10) : sum;
    }

    public static int sumOfDigitsHamza2(int num) {
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
            return sumOfDigitsHamza2(sum);
        }
        return sum;
    }


}
