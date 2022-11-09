package Marika;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);
    }



    public static boolean isAnagram1(String s, String t) {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for(int i = 0;i<s.length();++i){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        return sMap.equals(tMap);
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s1= "tttttuuuuueaacc", t1 = "ccaatttttuuuuue";
        System.out.println(isAnagram1(s,t));
        System.out.println(isAnagram1(s1,t1));
    }
}
