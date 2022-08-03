package mizgin.mapTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println(frequencyTest(""));
        System.out.println(frequencyTest(null));
        System.out.println(frequencyTest("responsible"));

    }

    public static Map<Character, Integer> frequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        if(str != null){
            for (Character each : str.toCharArray()) {
                if (map.containsKey(each)) {
                    map.put(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            return map;
        }
        return null;
    }
}

/*
Write a method that prints the frequency of each character from a String parameter.
    If the given String is null, then return null
    If the given String is empty return an empty map

Example
    input: ""
    output: empty map
    explanation: input is empty
Example
    input: null
    output: null
    explanation: input is null.
Example
    input: responsible
    output: {r=1, e=2, S=2, p=1, 0=1. n=1. i=1, b=1, =11
    explanation: characters are keys and occurrences are values
*/
