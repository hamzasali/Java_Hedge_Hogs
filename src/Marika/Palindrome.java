package Marika;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(str.charAt(j)))
                j--;

            if (i < j && Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A brown fox jumping over";

        System.out.println(isPalindrome(str));
    }

}
