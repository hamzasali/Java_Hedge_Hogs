package hamzaAli.array;

import java.util.HashSet;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 3, 1, 5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int each : nums) {
            if (!set.add(each)) {
                set.remove(each);
            }
        }
        return set.iterator().next();
    }
}


