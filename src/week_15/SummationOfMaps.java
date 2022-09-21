package week_15;

import java.util.HashMap;
import java.util.Map;

public class SummationOfMaps {

    public static void main(String[] args) {

        HashMap<Integer, Double> map1 = new HashMap<>(Map.of(1, 1.0, 2, 1.5, 3, 2.0));
        HashMap<Integer, Double> map2 = new HashMap<>(Map.of(2, 1.0, 3, 2.5, 5, 1.0));

        System.out.println(sumOfMaps2(map1, map2));

    }

    public static Map<Integer, Double> sumOfMaps(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>(map1);

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0D) + entry.getValue());
        }

//        map2.forEach((k, v) -> result.put(k, result.getOrDefault(k, 0D) + v));

        return result;
    }

    public static Map<Integer, Double> sumOfMaps2(Map<Integer, Double> map1, Map<Integer, Double> map2) {

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            if (map1.containsKey(entry.getKey())) {
                map1.put(entry.getKey(), entry.getValue() + map1.get(entry.getKey()));
            } else {
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        return map1;
    }

}
