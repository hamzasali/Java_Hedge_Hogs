package hamzaAli.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "rat";
        System.out.println(isAnagram(str1, str2));
    }

    static Boolean isAnagram(String str1, String str2) {

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)){
            System.out.println(chars1);
            System.out.println(chars2);
            return true;
        }
        System.out.println(chars1);
        System.out.println(chars2);
        return false;
    }

}
