package hamzaAli.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {
    public static int missing(int[] nums) {

        /** ArrayList is slow on leetcode */

//        List<Integer> numsList = new ArrayList<>();
//        for (int num : nums) {
//            numsList.add(num);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (!numsList.contains(i)) {
//                return i;
//            }
//        }
//        return 0;

        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!integerSet.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1};
        int[] arr2 = {3, 0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missing(arr1));
        System.out.println(missing(arr2));
        System.out.println(missing(arr3));
    }

}
