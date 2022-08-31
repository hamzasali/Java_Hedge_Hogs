package sabina;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3_FirstNonRepeatingVowel {

    public static void main(String[] args) {

        String str = "google";

        System.out.println(firstNonRepeatingVowel(str));


    }

    public static int firstNonRepeatingVowel(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        //   letter, count


        for (int i = 0; i < str.length(); i++) {

            if (!(map.containsKey(str.charAt(i)))) { // google.charAt(0)--> g, if the map contains key - 'g'...
                map.put(str.charAt(i), 1);  // g, 1
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1); // o, 1+1


            }
        }


        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            Character ch = eachEntry.getKey();
            Integer count = eachEntry.getValue();
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                if (count == 1) {
                    return str.indexOf(ch+"");
                }
            }
        }

        return -1;
    }
}

/*
Practice / First Non-Repeating Vowel
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
If it doesn't exist, return -1.
Assume that all the characters of the String is lowercase.
Do not use String class functions other than chart() and length()
You can also try to solve with Map data structure like using a Map<Character, Integer> variable.

Example
input: google
output: 5

explanation: only e is non-repeated vowel and it's index is 5

Example
input: mood
output:-1
explanation: o is repeated, no
non-repeating vowel.

Example
input: responsible
output: 4
explanation: e is repeated, o
and j are not repeated, o is the
first non-repeating vowel
 */