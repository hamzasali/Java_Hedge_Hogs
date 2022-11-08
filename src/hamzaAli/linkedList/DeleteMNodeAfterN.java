package hamzaAli.linkedList;

public class DeleteMNodeAfterN {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next.next.next = new ListNode(12);
        listNode.next.next.next.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next.next.next.next.next.next.next = new ListNode(10);
        deleteNodes(listNode, 2, 3);


    }

    public static ListNode deleteNodes(ListNode node, int m, int n) {

        ListNode current = node;

        while (current != null) {

            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }

            if (current != null) {
                ListNode lastNode = current;
                for (int i = 0; i <= n && current != null; i++) {
                    current = current.next;
                }
                lastNode.next = current;
            }
        }


        return node;
    }
}
