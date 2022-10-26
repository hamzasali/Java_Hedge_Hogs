package hamzaAli.linkedList.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
        while (current != null) {
            System.out.println(current.contact);
            current = current.next;
        }
    }

    public void add(Contact contact) {
        PhoneBookNode phoneBookNode = new PhoneBookNode(contact);
        if (isEmpty()) {
            head = tail = phoneBookNode;
        } else {
            tail.next = phoneBookNode;
            tail = phoneBookNode;
        }
        size++;
    }

    public PhoneBookNode findByFirstName(String firstName) {
        PhoneBookNode current = head;

        if (isEmpty()) {
            throw new NoSuchElementException("Phonebook is empty");
        }
        while (current != null) {
            if (current.contact.firstName.toLowerCase().equalsIgnoreCase(firstName)) {
                return current;
            }
            current = current.next;
        }

        throw new NoSuchElementException(firstName + " not found");
    }

    public List<PhoneBookNode> findAllByLastName(String lastName) {
        PhoneBookNode current = head;
        List<PhoneBookNode> list = new ArrayList<>();

        if (isEmpty()) {
            return null;
        }
        while (current != null) {
            if (current.contact.lastName.toLowerCase().equalsIgnoreCase(lastName)) {
                list.add(current);
            }
            current = current.next;
        }

        return list;
    }

    public void deleteByFirstName(String firstName) {

        if (isEmpty()) {
            System.out.println("List is Empty");
        }
        PhoneBookNode current = head;
        PhoneBookNode prev = head;

        while (current != null) {
            if (current.contact.firstName.equalsIgnoreCase(firstName)) {
                if (current == head) {
                    current = current.next;
                    current.next = null;
                }
                if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

    public void deleteAllMatchingLastName(String lastName) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        PhoneBookNode current = head;
        PhoneBookNode prev = head;

        while (current != null && current.next != null) {
            if (current.contact.lastName.equalsIgnoreCase(lastName)) {
                if (current == head) {
                    current = current.next;
                    current.next = null;
                }
                if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

    public List<PhoneBookNode> findAll() {
        List<PhoneBookNode> list = new ArrayList<>();
        PhoneBookNode current = head;

        while (current != null) {
            list.add(current);
            current = current.next;
        }
        return list;
    }

}