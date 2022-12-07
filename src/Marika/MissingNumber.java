package Marika;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public static int missingNumber(int[] nums) { // O(n) - O(1)
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int n = nums.length; //3
        return n * (n + 1) / 2 - sum; //3*(3+1)/2-4
    }

    public static int missingNumber1(int[] nums) { // O(n) - O(1)
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {3,0,1};  //2
        int [] numbers = {9,6,4,2,3,5,7,0,1};  //8
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber1(numbers));
    }
}

