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
        System.out.println(checkPalindrome(listNode));
        System.out.println(isPalindrome2(listNode));
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
    private static boolean checkPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next !=null) {
            fast = fast.next.next;

            ListNode temp = slow;
            slow = slow.next;

            temp.next = prev;
            prev = temp;
        }

        if (fast != null) { // handling for odd length linkedList
            slow = slow.next;
        }

        while (prev != null && slow !=null) {
            if (prev.val != slow.val) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;

    }
    public static boolean isPalindrome2(ListNode head) {


        if(head==null || head.next==null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        //find middle node:
        while (fast.next != null && fast.next.next !=null){

            fast = fast.next.next;
            slow = slow.next;
        }

        //divide into 2 nodes and rever second one
        ListNode secondHalfHead = reverse(slow);
        ListNode firstHalfHead = head;


        //check all if they are same or not:
        while (secondHalfHead !=null && firstHalfHead !=null){
            if(firstHalfHead.val !=secondHalfHead.val){
                return false;
            }

            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }
    private static ListNode reverse(ListNode head){

        ListNode newHead = null;
        ListNode next = null;

        while (head !=null){
            next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }

}

