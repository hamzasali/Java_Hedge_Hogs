package week_21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachArray {

    public static void main(String[] args) {

        bruteForce(new int[]{1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2});
        withEnumAndMap(new int[]{1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2});
        withStreamAndEnum(new int[]{1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2});

    }

    public static void bruteForce(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("array is empty");
            return;
        }

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        Map<Integer, String> map = new HashMap<>();

        for (int each : array) {
            int count = 0;
            for (int i : array) {
                if (each == i) {
                    count++;
                }
            }
            if (count > 10) {
                map.put(each, numbers[11]);
            } else {
                map.put(each, numbers[count]);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " is " + v + " times"));

    }

    public static void withEnumAndMap(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        map.forEach((k, v) -> {
            int n = v <= 11 ? v : 11;
            System.out.println(k + " is " + NumberToWord.values()[n].value + " times");
        });
    }

    static void withStreamAndEnum(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return;
        }
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).forEach((k, v) -> {
            //int n = v <= 11 ? Math.toIntExact(v) : 11;
            long n = v <= 11 ? v : 11;
            System.out.println(k + " is " + NumberToWord.values()[(int) n].value + " times");

        });
    }

    enum NumberToWord {

        ZERO("zero"), ONE("one"),

        TWO("two"), THREE("three"),

        FOUR("four"), FIVE("five"),

        SIX("six"), SEVEN("seven"),

        EIGHT("eight"), NINE("nine"),

        TEN("ten"),

        MORE_THAN_TEN("more than ten");
        final String value;

        NumberToWord(String value) {
            this.value = value;
        }
    }
}