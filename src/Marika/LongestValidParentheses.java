package Marika;

import java.util.Stack;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='(') {
                stack.push(i);
            }else {
                stack.pop();
                if(stack.empty()) {
                    stack.push(i);
                }else {
                    count = Math.max(count,i-stack.peek());
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "))((()))()))((";
        System.out.println(longestValidParentheses(str));
    }
}
