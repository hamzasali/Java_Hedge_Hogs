package Marika;

import java.util.Arrays;

public class MoveZeroesTwoPointer {

    public static int[] moveZeroes(int[] nums) {
        int left = 0;

        int right = 0;

        while (left < nums.length) {
            if (nums[right] != 0) {
                right++;
                left = right;
            } else if (nums[left] == 0) {
                left++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,0,7,8,0,0,9};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

}

