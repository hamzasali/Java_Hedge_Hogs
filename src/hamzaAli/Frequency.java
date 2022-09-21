package hamzaAli;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {


        String s = "responsible";


        System.out.println(freq(s));
    }

    public static Map<Character, Integer> freq(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        if (s == null) {
            return null;
        }
        if (s.isEmpty()) {
            return map;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer value = map.get(c);

            if (value == null) {
                map.put(c, 1);
            } else {
                map.put(c, value + 1);
            }
        }
        return map;
    }


}
