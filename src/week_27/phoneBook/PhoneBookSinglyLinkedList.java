package week_27.phoneBook;

public class PhoneBookSinglyLinkedList {

    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;


    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void printPhoneBook() {
        PhoneBookNode current = head;
        Integer element = 1;
        while (current != null) {
            System.out.println(element +". "+ current.contact);
            element++;
            current = current.next;
        }
    }
}
