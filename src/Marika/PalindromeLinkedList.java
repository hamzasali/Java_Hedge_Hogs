package Marika;
// every single list has only one pointer which is pointing it's only immediate next node
// that's why we need to reverse it, so we can have side by side comparison
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        while(slow!=null) {
            if(slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public  static ListNode reversed (ListNode head) {
        ListNode newHead = null;
        while(head!=null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNodeA = new ListNode(1);
        listNodeA.next = new ListNode(2);
        listNodeA.next.next = new ListNode(2);
        listNodeA.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(listNodeA));

    }
}
