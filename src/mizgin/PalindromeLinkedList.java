package mizgin;

public class PalindromeLinkedList {

    public static void main(String[] args) {

        ListNode a = new ListNode(7);
        a.next = new ListNode(8);
        a.next.next = new ListNode(9);
        a.next.next.next = new ListNode(8);
        a.next.next.next.next = new ListNode(7);

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(2);
        b.next.next.next = new ListNode(1);

        ListNode c = new ListNode(1);
        c.next = new ListNode(2);

        System.out.println(checkPalindrome(a));
        System.out.println(checkPalindrome(b));
        System.out.println(checkPalindrome(c));
        System.out.println(checkPalindrome(null));

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

}
