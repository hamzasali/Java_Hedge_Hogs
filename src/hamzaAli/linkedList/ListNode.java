package hamzaAli.linkedList;

import java.util.HashSet;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next;
        System.out.println(detectCycle(listNode).val);
    }


    static ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) return current;
            set.add(current);
            current = current.next;

        }

        return null;

    }

}
