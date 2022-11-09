package Marika;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int left = 1;
        int right = 1;

        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            answer[i]=left;
            left *= nums[i];
        }
        for(int i = nums.length-1; i >= 0; i--) {
            answer[i]=right * answer[i];
            right *= nums[i];
        }

        return answer;

    }


    

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

        int[] nums1 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
    }


}
