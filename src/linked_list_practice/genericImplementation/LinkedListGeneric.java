package linked_list_practice.genericImplementation;

import linked_list_practice.Node;

public class LinkedListGeneric<E> {

    NodeGeneric<E> head;
    NodeGeneric<E> tail;

    public int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(E item) {
       NodeGeneric<E> node = new NodeGeneric<>(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void printNodes() {
        NodeGeneric<E> current = head;

        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }


    //find the middle node inside your linkedList without size information

    public NodeGeneric<E> findTheMiddleNode() {
        NodeGeneric<E> pointer1Fast = head;
        NodeGeneric<E> pointer2Slow = head;

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
}
