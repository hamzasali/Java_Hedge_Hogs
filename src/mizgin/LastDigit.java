package mizgin;

public class LastDigit {

    public static void main(String[] args) {

        System.out.println(lastDigit(7,17));
        System.out.println(lastDigit(1223,113));
    }

    public static boolean lastDigit(int first, int second){
        return first%10 == second%10;
    }

}
