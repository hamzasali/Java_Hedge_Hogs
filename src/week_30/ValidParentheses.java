package week_30;

import java.util.LinkedList;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "(())";
        System.out.println(longestValidParentheses(str));
        System.out.println(longestValidParentheses2(str));


    }


    public static int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') open++;
            else close++;

            if (open == close) {
                maxLen = Math.max(maxLen, open + close);
            } else if (close > open) {//)
                open = close = 0;
            }
        }

        open = close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '(') open++;
            else close++;

            if (open == close) {
                maxLen = Math.max(maxLen, open + close);
            } else if (close < open) {
                open = close = 0;
            }
        }
        return maxLen;


    }

    public static int longestValidParentheses2(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}

