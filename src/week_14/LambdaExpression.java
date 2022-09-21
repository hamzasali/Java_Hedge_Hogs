package week_14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LambdaExpression {

    public static void main(String[] args) {

        Map<String,Integer> months = Map.of("January",31,"February",28,"March",31);
        System.out.println(months);

        months.forEach((k,v)-> System.out.println(v));

        Set<String> strings = months.keySet();
        Collection<Integer> values = months.values();

        strings.forEach(s-> System.out.println(s));


        System.out.println("================================================");
        Set<Map.Entry<String, Integer>> entries = months.entrySet();

        for (Map.Entry<String, Integer> eachEntry :entries){
            System.out.println(" key information " + eachEntry.getKey());
            System.out.println(" value information " + eachEntry.getValue());
        }
    }
}
