package hamzaAli.wk34;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String str = "This is an example of example";
        System.out.println(FrequencyOfWords(str));
    }

    static Map<String, Integer> FrequencyOfWords(String str) {
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
