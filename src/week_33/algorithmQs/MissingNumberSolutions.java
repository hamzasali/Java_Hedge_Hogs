package week_33.algorithmQs;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberSolutions {
    public static void main(String[] args) {
        int[] arr1 = {0, 1};
        int[] arr2 = {3, 0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("arr1:" + missingNumFollowUpSolution(arr1));
        System.out.println("arr2:" + missingNumFollowUpSolution(arr2));
        System.out.println("arr3:" + missingNumFollowUpSolution(arr3));
        System.out.println("----------------------------");
        System.out.println("arr1:" + missingNumSortedSolution(arr1));
        System.out.println("arr2:" + missingNumSortedSolution(arr2));
        System.out.println("arr3:" + missingNumSortedSolution(arr3));
        System.out.println("----------------------------");
        System.out.println("arr1:" + missingNumberMarika1(arr1));
        System.out.println("arr2:" + missingNumberMarika1(arr2));
        System.out.println("arr3:" + missingNumberMarika1(arr3));
        System.out.println("----------------------------");
        System.out.println("arr1:" + missingNumberMarika2(arr1));
        System.out.println("arr2:" + missingNumberMarika2(arr2));
        System.out.println("arr3:" + missingNumberMarika2(arr3));
        System.out.println("----------------------------");
        System.out.println("arr1:" + missingNumberTatiana(arr1));
        System.out.println("arr2:" + missingNumberTatiana(arr2));
        System.out.println("arr3:" + missingNumberTatiana(arr3));
        System.out.println("----------------------------");
        System.out.println("arr1:" + missingNumberMizgin(arr1));
        System.out.println("arr2:" + missingNumberMizgin(arr2));
        System.out.println("arr3:" + missingNumberMizgin(arr3));
        System.out.println("----------------------------");
    }

    public static int missingNumFollowUpSolution(int[] nums) { //Time: O(n) Space: 0(1)
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }

    public static int missingNumSortedSolution(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumberMarika1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int n = nums.length; //3
        return n * (n + 1) / 2 - sum; //3*(3+1)/2-4
    }

    public static int missingNumberMarika2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberTatiana(int[] nums) {

        int remain = 0;
        for (int i = 0; i < nums.length; i++) {

            remain += i + 1 - nums[i];

        }
        return remain;
    }

    public static int missingNumberMizgin(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
