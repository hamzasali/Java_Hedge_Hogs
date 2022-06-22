package hamzaAli;

import java.util.ArrayList;
import java.util.Arrays;

public class countEvens {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 12, 13, 1, 3, 4));
        System.out.println(even(list));

    }

    public static int even(ArrayList<Integer> nums) {

        int count = 0;
        for (Integer each : nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
