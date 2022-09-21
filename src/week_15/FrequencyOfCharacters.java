package week_15;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfCharactersBruteForce("aaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddee"));
        System.out.println(frequencyOfCharacters1("aaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddeeaaacccaacccddee"));
//        System.out.println(frequencyOfCharacters2("aaacccaacccddee"));
//        System.out.println(frequencyOfCharacters3("aaacccaacccddee"));

    }


    public static Map<Character, Integer> frequencyOfCharactersBruteForce(String str) {

        Long startTime = System.currentTimeMillis();
        Map<Character, Integer> map = null;
        if (str == null) {
            return map;
        }

        map = new HashMap<>();


        for (Character ch : str.toCharArray()) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            map.put(ch, count);
        }
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println("executionTime = " + executionTime);
        return map;

    }

    public static Map<Character, Integer> frequencyOfCharacters1(String str) {
        Long startTime = System.currentTimeMillis();
        Map<Character, Integer> map = null;
        if (str == null) {
            return map;
        }

        map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println("executionTime = " + executionTime);
        return map;
    }


    public static Map<Character, Integer> frequencyOfCharacters2(String str) {

        Map<Character, Integer> map = new HashMap<>();
        if (str == null) {
            return null;
        }

        if (str.isEmpty()) {
            return map;
        }

        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.putIfAbsent(ch, 1);
        }

        return map;
    }


    public static Map<Character, Integer> frequencyOfCharacters3(String str) {

        Map<Character, Integer> map = null;
        if (str == null) {
            return map;
        }

        map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }
}
