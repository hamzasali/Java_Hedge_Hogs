package alena.polindromeLinkedList;

import java.util.Stack;

public class MySinglyLinkedList extends ListNode {
    public ListNode next;
    ListNode head;
    ListNode tail;
    int size;

    public MySinglyLinkedList(int id) {
        super(id);
    }

    static boolean isPalindrome(MySinglyLinkedList head) {

        ListNode slow = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();

        //adding data into stack
        while (slow != null) {   //while head is not null
            stack.push(slow.data); //adding into stack
            slow = slow.next;
        }

        while (head != null) { //iterate until head = null

            int i = stack.pop();  //removing each element from the stack
            if (head.data == i) {
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
            head = (MySinglyLinkedList) head.next;
        }
        return isPalindrome;
    }



}

