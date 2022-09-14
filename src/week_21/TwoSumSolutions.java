package week_21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TwoSumSolutions {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePairNumbers(new int[]{5, 6, 2, 13, 9, 1}, 8)));
        System.out.println(Arrays.toString(findIndicesWithTwoPointerAndHashMap(new int[]{5, 6, 2, 13, 9, 1}, 8)));
        System.out.println(Arrays.toString(findIndicesWithTwoPointerAndTreeMap(new int[]{5, 6, 2, 13, 9, 1}, 8)));
    }

    public static int[] findThePairNumbers(int[] arr, int target) {
        int first = 0, last = arr.length - 1;
        Arrays.sort(arr);
        while (first < last) {
            if (arr[first] + arr[last] == target) {
                return new int[]{arr[first], arr[last]};
            } else if (arr[first] + arr[last] < target) first++;
            else
                last--;
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndHashMap(int[] arr, int target) {
        int first = 0, last = arr.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        while (first < last) {
            if (arr[first] + arr[last] == target) {
                return new int[]{map.get(arr[first]), map.get(arr[last])};
            } else if (arr[first] + arr[last] < target) {
                first++;
            } else last--;
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndTreeMap(int[] arr, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        while (!map.firstKey().equals(map.lastKey())) {
            if (map.firstKey() + map.lastKey() == target) {
                return new int[]{map.firstEntry().getValue(), map.lastEntry().getValue()};
            } else if (map.firstKey() + map.lastKey() < target) {
                map.remove(map.firstKey());
            } else map.remove(map.lastKey());
        }
        return new int[0];
    }
}