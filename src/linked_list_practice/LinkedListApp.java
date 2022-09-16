package linked_list_practice;

public class LinkedListApp {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        System.out.println(myList.findTheMiddleNode().value);
        myList.printNodes();

        myList.add(30);

        System.out.println();
        myList.printNodes();

        System.out.println();
        System.out.println(myList.findTheMiddleNode().value);

        System.out.println(myList.getKthFromLast(5));

    }

}
