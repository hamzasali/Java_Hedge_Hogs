package week_34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {

    public static void main(String[] args) {
        String sentence = "This      is an example!!!!       exe exe exe            @@@@ of Example....";
        System.out.println(getFreqOfWords(sentence));
        System.out.println(withStreamLong(sentence));
        System.out.println(withStreamInteger(sentence));
        System.out.println(withStreamLongOther(sentence));
    }


    public static Map<String, Integer> getFreqOfWords(String str) {
        if (str == null) return null;

        Map<String, Integer> mapOfWords = new HashMap<>();

        String[] words = str.trim().toLowerCase().split("\\W+");

        for (String word : words) {
            mapOfWords.put(word, mapOfWords.getOrDefault(word, 0) + 1);
        }

        return mapOfWords;
    }

    public static Map<String, Long> withStreamLong(String str) {
        if (str == null) return null;
        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Integer> withStreamInteger(String str) {
        if (str == null) return null;
        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(s -> 1)));
    }

    public static Map<String, Long> withStreamLongOther(String str) {
        if (str == null) return null;
        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
}
