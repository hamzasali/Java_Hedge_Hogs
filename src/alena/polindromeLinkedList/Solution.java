package alena.polindromeLinkedList;

public class Solution {
    public static void main(String[] args) {

        MySinglyLinkedList head=new MySinglyLinkedList(1);

        head.next=new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next=new ListNode(1);

        MySinglyLinkedList.isPalindrome(head);
    }


}
