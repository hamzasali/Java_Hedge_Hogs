package week_15;

import java.util.*;

public class ListImplementations {
    public static void main(String[] args) {

        Integer[] arr = {3,2,3,2,1};

        ArrayList<Integer> list = new ArrayList<>(List.of(arr));
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));

        LinkedList<Integer> linkedList = new LinkedList<>(list);
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.get(0) = " + linkedList.get(0));

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println("vector = " + vector);
        System.out.println("vector.get(0) = " + vector.get(0));

        Stack<Integer> stack = new Stack<>();
        stack.addAll(vector);
        System.out.println("stack = " + stack);
        System.out.println("stack.get(0) = " + stack.get(0));

    }
}
