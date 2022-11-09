package week_29;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println(isAnagram(str1, str2));

    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] characters = new int[26];

        // s= eat t= ate
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++; // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
            characters[t.charAt(i) - 'a']--;
        }
        for (int character : characters) {
            if (character != 0) {
                return false;
            }
        }
        return true;
    }
}
