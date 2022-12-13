package hamzaAli;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    public static void main(String[] args) {
        String str = "This is an example of example";
        System.out.println(countFrequency(str));
    }

    static Map<String, Integer> countFrequency(String str) {
        Map<String, Integer> map = new HashMap<>();

        if (str == null) return null;
        if (str.isEmpty()) return map;

        String[] s = str.split(" ");
        int count = 1;
        for (String value : s) {
            if (map.containsKey(value)) {
                count++;
            }
            map.put(value, count);
        }
        return map;
    }

}
