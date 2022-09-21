package week_22;

import linked_list_practice.Node;
import linked_list_practice.SinglyLinkedList;

import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {

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

//        removeDuplicates(singlyLinkedList.head);
//        singlyLinkedList.printNodes();

        Node node = removeDuplicatesTwoPointer(singlyLinkedList.head);


        Node current = node;

        while (current!=null){
            System.out.print(current.value + " ");
            current=current.next;
        }

    }

    public static void removeDuplicates(Node head) {

        Node current = head;


        while (current != null && current.next != null) {

            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
    }

    public static Node removeDuplicatesTwoPointer(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head.next;
        Node slow = head;

        while (fast != null) {
            if (slow.value == fast.value) {
                fast = fast.next;
                slow.next=fast;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        return head;
    }
}
