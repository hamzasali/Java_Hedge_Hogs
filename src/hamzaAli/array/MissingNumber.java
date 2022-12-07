package hamzaAli.array;

import java.util.*;

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

        /** Sorting */

//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;

//        Set<Integer> integerSet = new HashSet<>();
//        for (int num : nums) {
//            integerSet.add(num);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (!integerSet.contains(i)) {
//                return i;
//            }
//        }
//        return 0;

        /** Mathematics solution */

        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
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
