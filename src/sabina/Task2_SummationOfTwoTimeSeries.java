package sabina;

import java.util.Map;
import java.util.TreeMap;

public class Task2_SummationOfTwoTimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> seriesA = new TreeMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);

        Map<Integer, Double> seriesB = new TreeMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        System.out.println(summationOfTwoTimeSeries(seriesA, seriesB));


    }

    public static Map<Integer, Double> summationOfTwoTimeSeries(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB) {

        Map<Integer, Double> map = new TreeMap<>();

        for (Map.Entry<Integer, Double> eachEntryA : seriesA.entrySet()) {

            Integer eachKeyA = eachEntryA.getKey();
            if(!(seriesB.containsKey(eachKeyA))){
                map.put(eachKeyA, eachEntryA.getValue());
            }

            for (Map.Entry<Integer, Double> eachEntryB : seriesB.entrySet()) {
                Integer eachKeyB = eachEntryB.getKey();
                if(!(seriesA.containsKey(eachKeyB))){
                    map.put(eachKeyB, eachEntryB.getValue());
                }

               if(eachKeyA.equals(eachKeyB)){
                    Double sumOfTime = eachEntryA.getValue()+eachEntryB.getValue();
                    map.put(eachKeyA, sumOfTime);

                }
               }
            }


        return map;
    }


}
/*
Practice / Summation of Two Time Series:

A time series is represented as a list of time/value pairs.
Write a function that takes two time series and outputs a new time series of the summation of them.

Example:

Input:
series A: ((1,1.0), (2, 1.5), (3, 2.0)]
series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
Map. Key : int. Value: double

output:
Assuming we have 'O' for a time pair that's missing, this is the result:
[(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]

explanation:
same key for two maps
from input1 => (1, 1.0) (2) 1.5) (3, 2.0)
from input2 =>          (2,1.0)  (3,2.5)   (5, 1.0)
summation   => (1,1.0)  (2,2.5)  (3,4.5)   (5, 1.0)
                         1.5+1

 */