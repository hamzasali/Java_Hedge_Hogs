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

      /*  {
            HashSet<ListNode> set = new HashSet<>();

            ListNode current = head;
            while (current != null) {
                if (set.contains(current)) return current;
                set.add(current);
                current = current.next;

            }
            return null;
        }*/

        {
            if (head == null || head.next == null) return null;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow) {
                    ListNode firstNode = head;
                    ListNode intersection = fast;

                    while (firstNode != intersection) {
                        intersection = intersection.next;
                        firstNode = firstNode.next;
                    }
                    return firstNode;
                }

            }


            return null;
        }
    }

}
