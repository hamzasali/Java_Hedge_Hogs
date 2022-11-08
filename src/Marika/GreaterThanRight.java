package Marika;

import java.util.Stack;

public class GreaterThanRight {
    public static void find(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        if(nums==null || nums.length == 0)
             return;
        for (int each : nums) {
            while (!stack.isEmpty() && stack.peek() < each) {
                stack.pop();
            }
            stack.push(each);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,4,6,3,5};
        find(nums);
    }
}