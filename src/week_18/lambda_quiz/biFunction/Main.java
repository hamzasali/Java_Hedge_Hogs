package week_18.lambda_quiz.biFunction;

import java.util.function.BiFunction;

//class CoordinateFinder implements BiFunction<Double, Double, String> {
//    @Override
//    public String apply(Double latitude, Double longitude) {
//        return latitude + "\n" + longitude + "\n" + ": New York";
//    }
//}

public class Main {

    public static void main(String[] args) {

        Double latitude = 40.7127281;                                    // Line 1
        Double longitude = -74.0060152;                                    // Line 2
        //CoordinateFinder coordinateFinder = new CoordinateFinder();        // Line 3

        //String city = apply(latitude, longitude, coordinateFinder);        // Line 4
        //System.out.println(city);                                        // Line 5

        BiFunction<Double,Double,String> bFunction = (l1,l2) ->  l1 + "\n" + l2 + "\n" + ": New York";

        String apply = bFunction.apply(latitude, longitude);
        System.out.println(apply);


//        String result = newMethodForApply(latitude, longitude, bFunction);
//        System.out.println(newMethodForApply(latitude, longitude, (l1, l2) -> l1 + "\n" + l2 + "\n" + ": New York"));
//        System.out.println(result);



    }

//    public static String newMethodForApply(Double latitude, Double longitude, BiFunction<Double, Double, String> biFunction) {
//        return biFunction.apply(latitude, longitude);                    //  Line 6
//    }

}