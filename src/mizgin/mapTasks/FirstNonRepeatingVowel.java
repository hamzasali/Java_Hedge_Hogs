package mizgin.mapTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {

        firstNonRepeatingVowel("google");
        firstNonRepeatingVowel("mood");
        firstNonRepeatingVowel("responsible");


    }

    public static void firstNonRepeatingVowel(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        int index=-1;

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<Character, Integer> hm : map.entrySet()) {
            if (hm.getValue()==1 && (hm.getKey()=='a' || hm.getKey()=='e' || hm.getKey()=='i' || hm.getKey()=='o' || hm.getKey()=='u')) {
                index=str.indexOf(hm.getKey());
                break;
            }
        }

        System.out.println(index);

    }

}

/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
    -If it doesn't exist, return -1.
    -Assume that all the characters of the String is lowercase.
    -Do not use String class functions other than charAt() and length()
    -You can also try to solve with Map data structure like using a Map<Character, Integer> variable.
Example 1
    input: google
    output: 5
    explanation: only e is non-repeated vowel, and it's index is 5
Example 2
    input: mood
    output: -1
    explanation: o is repeated, no non-repeating vowel.
Example 3
    input: responsible
    output: 4
    explanation: e is repeated, o and i are not repeated, o is the first non-repeating vowel
 */
