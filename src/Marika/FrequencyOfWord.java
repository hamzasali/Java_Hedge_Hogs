package Marika;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWord {

    public static void frequencyOfWord(String str) {

        String st [] = str.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String each : st) {
            if (words.containsKey(each)) {
                words.put(each, 1 + words.get(each));
            } else {
                words.put(each, 1);
            }
        }
        System.out.println(words);
    }



    public static void main(String[] args) {
        String str = "This is an example of example";

        frequencyOfWord(str);
    }
}
