package week_15;

import java.util.*;

public class QueueImplementations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(3,2,3,2,1));


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);
        System.out.println("priorityQueue = " + priorityQueue);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(list);
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("arrayDeque.getFirst() = " + arrayDeque.getFirst());
        System.out.println("arrayDeque.getLast() = " + arrayDeque.getLast());

        Deque<Integer> linkedList = new LinkedList<>(list);
        System.out.println(((LinkedList<?>)linkedList).get(0));




    }
}
