package mizgin.mapTasks;

import java.util.*;

public class Summation {

    public static void main(String[] args) {

        Map<Integer, Double> mapA = new LinkedHashMap<>();
        mapA.put(1, 1.0);
        mapA.put(2, 1.5);
        mapA.put(3, 2.0);

        Map<Integer, Double> mapB = new LinkedHashMap<>();
        mapB.put(2, 1.0);
        mapB.put(3, 2.5);
        mapB.put(5, 1.0);

        //System.out.println(summation(mapA, mapB));


    }

    //public static Map<Integer, Double> summation(Map<Integer, Double> map1, Map<Integer, Double> map2) {}


}

/*
A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output is a new time series of the summation of them.
    Example:
    series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
    series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
Assuming we have '0' for a time pair that's missing, this is the result:
    output:
    [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
*/
