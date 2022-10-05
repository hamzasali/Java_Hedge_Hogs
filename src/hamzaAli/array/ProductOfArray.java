package hamzaAli.array;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4};
        int[] ints = productExceptSelf(nums);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int base = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = base * result[i];
            base = base * nums[i];
        }

//        for (int i = 0; i < nums.length; i++) {
//            int sub = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    sub *= nums[j];
//                }
//            }
//            result[i] = sub;
//        }
        return result;
    }
}
/*
• Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
• The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
• You must write an algorithm that runs in O(n) time and without using the division operation.
*/