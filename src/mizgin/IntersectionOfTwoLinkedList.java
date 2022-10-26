package mizgin;

public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(0);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(2);
        listNode1.next.next.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(3);
        listNode2.next =  new ListNode(2);
        listNode2.next.next = new ListNode(4);

        System.out.println(method(listNode1, listNode2));

    }

    public static ListNode method(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode firstPointer = headA;
        ListNode secondPointer = headB;

        while (firstPointer != secondPointer) {
            if (firstPointer == null) {
                firstPointer=headB;
            }else {
                firstPointer=firstPointer.next;
            }

            if (secondPointer == null) {
                secondPointer=headA;
            }else {
                secondPointer=secondPointer.next;
            }
        }

        return firstPointer;

    }
}
