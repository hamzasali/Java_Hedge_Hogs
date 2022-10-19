package hamzaAli.linkedList;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next.next = new ListNode(3);

        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode node = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (head != null) {
            if (head.val == stack.pop()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }
}

