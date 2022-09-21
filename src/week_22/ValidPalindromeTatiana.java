package week_22;

public class ValidPalindromeTatiana {


    public static void main(String[] args) {

        String str = "Do geese see God";

        System.out.println(isPalindrome2(str));


    }

    public static boolean isPalindrome2(String str) {
        int ptr1 = 0;
        int ptr2 = str.length() - 1;
        str = str.toLowerCase();
        while (ptr1 < ptr2) {

            char getPtr1 = str.charAt(ptr1);
            char getPtr2 = str.charAt(ptr2);

            if (!(getPtr1 >= 'a' && getPtr1 <= 'z')) {//d=100
                ptr1++;
            } else if (!(getPtr2 >= 'a' && getPtr2 <= 'z')) {
                ptr2--;

            } else if (getPtr1 == getPtr2) {
                ptr1++;
                ptr2--;
            } else {
                return false;
            }

        }
        return true;


    }

}

