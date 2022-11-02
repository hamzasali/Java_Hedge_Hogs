package mizgin;

public class DeleteNAfterMLinkedList {

    public static void main(String[] args) {

        int[] keys = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }

        printList(head);

        head = deleteNodes(head, 2, 3);

        printList(head);

    }

    public static ListNode deleteNodes(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        // skip m nodes
        for (int i = 1; curr != null && i <= m; i++) {
            prev = curr;
            curr = curr.next;
        }

        // delete next n nodes
        for (int i = 1; curr != null && i <= n; i++) {
            curr = curr.next;
        }

        // link remaining nodes with the last node
        prev.next = curr;

        // recursion for remaining nodes
        deleteNodes(curr, m, n);

        return head;
    }

    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

}
