package mizgin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));

        String x = "car";
        String y = "cat";

        System.out.println(isAnagram(x, y));

        String a = "aacc";
        String b = "ccaa";

        System.out.println(isAnagram(a, b));
//        System.out.println(areAnagram(a, b));

    }

    public static boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (char each : str1.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        for (char each : str2.toCharArray()) {
            if (map.containsKey(each)) {
                if (map.get(each) == 1) {
                    map.remove(each);
                }else {
                    map.put(each, map.get(each) - 1);
                }
            } else {
                return false;
            }
        }
        return map.size() == 0;
    }


    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

}
