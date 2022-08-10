package hamzaAli;

import java.util.HashMap;

public class Non_Repeating_Vowel {
    public static void main(String[] args) {

        String str = "google";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {

                map.put(ch, i);
            }
        }


        System.out.println(map);

    }

}
/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
If it doesn't exist, return -1.
Assume that all the characters of the String is lowercase.
Do not use String class functions other than chart() and length()
You can also try to solve with Map data structure like using a Map<Character, Integer> variable.

Example
input: google
output: 5
explanation: only e is
non-repeated vowel and it's
index is 5

Example
input: mood
output: -1
explanation: o is repeated, no
non-repeating vowel.

Example
input: responsible
output: 4
explanation: e is repeated, q
and j are not repeated, o is the
first non-repeating vowel
 */