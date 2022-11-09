package week_29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

     /*
    242. Valid Anagram
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
    https://leetcode.com/problems/valid-anagram/
     */

    // TC : O(n log n) SC : O(n)
    public boolean withArraySort(String s, String t) {
        char[] ch1 = s.toCharArray();    // SC : O(n)
        char[] ch2 = t.toCharArray();    // SC : O(n)
        Arrays.sort(ch1);             // TC : O(n log n)
        Arrays.sort(ch2);             // TC : O(n log n)
        return Arrays.equals(ch1, ch2); // TC : O(n)
    }

    // TC : O(n) SC : O(n)
    public boolean withMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {               // Time Complexity: O(n)
            Character ch = s.charAt(i);
//            if (map.containsKey(ch)) {                     // Time Complexity: O(1)
//                map.put(ch, map.get(ch + 1);              // Space Complexity: O(n)
//            } else {
//                map.put(ch, 1);
//            }
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {                      // Time Complexity: O(n)
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return map.size() == 0;
    }

    // TC : O(n) SC : O(1)
    public boolean withArray(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {   // Time Complexity: O(n)
            chars[s.charAt(i) - 'a']++;         // increasing count of that char found in s
            chars[t.charAt(i) - 'a']--;         // decreasing count of that char found in t
        }

        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0)                 // every character count must be zero
                return false;
        }
        return true;
    }

    // Follow-up question : What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

    // wikipedia : As of Unicode version 15.0, there are 149,186 characters with code points, covering 161 modern and
    // historical scripts, as well as multiple symbol sets.

    // We can use a hash table instead of a fixed size counter. So, our map solution already covers this follow-up question.
    // As an alternative, we can modify our array solution like below
    // TC : O(n) SC : O(1)
    public boolean withArrayCoversAllUnicode(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[149186];

        for (int i = 0; i < s.length(); i++) {   // Time Complexity: O(n)
            chars[s.charAt(i)]++;         // increasing count of that char found in s
            chars[t.charAt(i)]--;         // decreasing count of that char found in t
        }

        for (int i = 0; i < 149186; i++) {
            if (chars[i] != 0)                 // every character count must be zero
                return false;
        }
        return true;
    }
}
