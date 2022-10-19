package alena.polindromeLinkedList;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        ListNode head=new ListNode(1);

        head.next=new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next=new ListNode(4);

        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();

        //adding data into stack
        while (slow != null) {   //while head is not null
            stack.push(slow.val); //adding into stack
            slow = slow.next;
        }

        while (head != null) { //iterate until head = null

            int i = stack.pop();  //removing each element from the stack
            if (head.val == i) {
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

}
