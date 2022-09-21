package alena.tasks;
import java.util.Map;
import java.util.TreeMap;

public class TimeValue {
    public static void main(String[] args) {

        Map<Integer, Double> seriesA = new TreeMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);

        Map<Integer, Double> seriesB = new TreeMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        System.out.println(summation(seriesA, seriesB));

    }

    public static Map<Integer, Double> summation(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB) {

        for (Map.Entry<Integer, Double> eachEntryA : seriesA.entrySet()) { //iterating series A
            if(seriesB.containsKey(eachEntryA.getKey())){ //checking if series B contains series A key
                seriesB.replace(eachEntryA.getKey(), eachEntryA.getValue()+seriesB.get(eachEntryA.getKey())); //replace with new value
            }else{
                seriesB.put(eachEntryA.getKey(), eachEntryA.getValue()); //add without replacing
            }
        }

        return seriesB;
    }
}
