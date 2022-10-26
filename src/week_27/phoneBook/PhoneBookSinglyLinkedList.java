package week_27.phoneBook;

public class PhoneBookSinglyLinkedList {

    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;

    /**
     * Time complexity: O(1) Space complexity: O(1).
     *
     * @return true or false according to whether the LinkedList has any elements or not.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Time complexity: O(1) Space complexity: O(1).
     *
     * @return the number of elements in this linkedList.
     */
    public int size() {
        return size;
    }

    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     */
    public void printPhoneBook() {
        PhoneBookNode current = head;
        Integer element = 1;
        while (current != null) {
            System.out.println(element +". "+ current.contact);
            element++;
            current = current.next;
        }
    }

    /**
     * Time complexity: O(1) Space complexity: 0(1) As constant extra space is used.
     *
     * @param contact for creating a node object with firstName, lastName, email and phoneNumber.
     */
    public void add(Contact contact) {
        PhoneBookNode phoneBookNode = new PhoneBookNode(contact);

        if(isEmpty()) {
            head = tail = phoneBookNode;
        }else {
            tail.next = phoneBookNode;
            tail = phoneBookNode;
        }
        size++;
    }

    public PhoneBookNode findByFirstName(String firstName) {

    }


}
