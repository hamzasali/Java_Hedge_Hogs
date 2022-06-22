package tatiana;

public class lastDigit {

    public static void main(String[] args) {

        System.out.println(lastDigit(7, 17));


    }

    public static boolean lastDigit(int num1, int num2){
       return num1%10==num2%10;


    }
}
