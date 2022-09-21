package hamzaAli.linkedList;

import linked_list_practice.Node;
import linked_list_practice.SinglyLinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(4);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);

        singlyLinkedList.printNodes();


        Node node = removeDup(singlyLinkedList.head);
        System.out.println(node);


        singlyLinkedList.printNodes();

    }

    public static Node removeDup(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node fast = head.next;
        Node slow = head;

        while (fast != null) {
            if (slow.value == fast.value) {// 1 1 3 4 4 4 5 6 6
                fast = fast.next;
                slow.next = fast;
            } else {
                slow = fast;
                fast = fast.next;
            }

        }
        return head;
    }
}
