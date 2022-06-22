package Sergiy;

public class LastDigit {

    public static boolean isSameLastNumber(int a, int b){
        return a%10 == b%10;
    }

    public static void main(String[] args) {
        System.out.println(isSameLastNumber(15, 125));
    }

}
