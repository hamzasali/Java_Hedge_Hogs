package linked_list_practice;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void printNodes() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


    //find the middle node inside your linkedList without size information

    public Node findTheMiddleNode() {
        Node pointer1Fast = head;
        Node pointer2Slow = head;

        while (pointer1Fast != null && pointer1Fast.next != null) {//to prevent null pointer exception add both as a condition
            pointer2Slow = pointer2Slow.next;
            //pointer1Fast = pointer1Fast.next.next; both are same with for loop if you want to use
            //next.next instead of for loop comment for loop and comment out previous code...->>pointer1Fast = pointer1Fast.next.next;
            for (int i = 0; i < 2; i++) {
                pointer1Fast = pointer1Fast.next;
            }
        }
        return pointer2Slow;
    }

    public int indexOf(int value) {
        if (isEmpty()) {
            throw new NoSuchElementException("This linkedList does not consist of any nodes");
        }

        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.value == value) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;

    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public int getKthFromLast(int k) {//k=2

        Node fast = head;
        Node slow = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }// at the end of this for loop fast will be third node


        while (fast != tail) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.value;
    }
}
