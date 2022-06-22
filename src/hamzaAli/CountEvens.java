package hamzaAli;

import java.util.ArrayList;
import java.util.Arrays;

public class CountEvens {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 12, 13, 1, 3, 4));
        System.out.println(countEven(list));

    }

    public static int countEven(ArrayList<Integer> nums) {

        int count = 0;
        for (Integer each : nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
