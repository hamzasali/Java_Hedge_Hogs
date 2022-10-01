package hamzaAli.stack;

import java.util.Stack;

public class GreaterThanRight {

    // Function to print all elements which are greater than all // elements present to their right
    public static void find(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int each : arr) {
            while (!stack.isEmpty() && each > stack.peek()) {
                stack.pop();
            }
            stack.push(each);
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 3, 5};
        find(arr);
    }
}

/*
• Given an unsorted integer array, print all greater elements than all elements present to their right using Stack.
• For example, consider the array [10, 4, 6, 3, 5]. The elements that are greater than all elements to their right are 10, 6,
and 5.
• 10>4&10>6&10>3&10>5
 */