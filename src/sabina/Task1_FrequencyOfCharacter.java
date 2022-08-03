package sabina;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1_FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "responsible";
        System.out.println(frequencyOfCharacter_1(str));
        System.out.println(frequencyOfCharacter_2(str));


    }



    public static Map<Character, Integer> frequencyOfCharacter_1(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        if (str.isEmpty() || str.isBlank()) {
            return null;
        }

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                count++;
                map.put(ch, count);
                }
            }
         }

        return map;

    }


    public static Map <String, Integer> frequencyOfCharacter_2(String str) {


        Map<String, Integer> map = new LinkedHashMap<>();

        if(str.isEmpty() || str.isBlank()){
            return null;
        }

        String[] array = str.split("");

        for (String eachLetter : array) {

            int frequency = Collections.frequency(Arrays.asList(array), eachLetter);
            map.put(eachLetter, frequency);

        }

        return map;


    }
}
/*
Practice / Frequency of Characters:

Write a method that returns the frequency of each characters of a given String parameter.
If the given String is null, then return null
If the given String is empty return an empty map

Example
input:
output: empty map
explanation: input is empty

Example
input: null
output: null
explanation: input is null.

Since problem output is focused on the frequency we can
comfortably use Map data structure. Because we can use
characters as key and the occurrences of them as value.

Example
input: responsible
output: {r=1, e=2, s=2, p=1,
0=1, n=1, i=1, b=1, |=1}
explanation; characters are
keys and occurrences are
values
 */