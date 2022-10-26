package week_27.phoneBook;

import java.util.*;

public class PhoneBookSinglyLinkedList {

    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;

    Map<String,PhoneBookNode> map = new HashMap<>();

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
            System.out.println(element + ". " + current.contact);
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

        if (isEmpty()) {
            head = tail = phoneBookNode;
        } else {
            tail.next = phoneBookNode;
            tail = phoneBookNode;
        }

        if (!map.containsKey(contact.firstName)) {
            map.put(contact.firstName,phoneBookNode);
            size++;
        }else {
            throw new IllegalArgumentException(contact.firstName + " has already used as a key!");
        }

    }

    /**
     * Time complexity: O(1)  With the help of the hash map structure,
     * we did decrease the search operation complexity to the O(1).
     * Space complexity: 0(1) As constant extra space is used.
     * @param firstName this parameter will give the first corresponding node in LinkedList.
     * @return the PhoneBookNode object that has parameterized firstName.
     */
    public PhoneBookNode findByFirstName(String firstName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record available in phonebook!");
        }

        PhoneBookNode foundNode = map.get(firstName);

        if (foundNode == null) {
            throw new NoSuchElementException(firstName + " didn't match any records.");
        }
        return foundNode;
    }

    /**
     * Time complexity: O(n) Space complexity: 0(n) In the worst case all nodes might have same lastName.
     *
     * @param lastName this parameter will give the all nodes with this lastName in LinkedList.
     * @return list of PhoneBookNode with the parameterized lastName.
     */
    public List<PhoneBookNode> findAllByLastName(String lastName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record available in phonebook!");
        }
        List<PhoneBookNode> phoneBookNodeList = new ArrayList<>();

        PhoneBookNode current = head;
        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                phoneBookNodeList.add(current);
            }
            current = current.next;
        }
        if (phoneBookNodeList.isEmpty()) {
            throw new NoSuchElementException(lastName + " didn't match any records.");
        }
        return phoneBookNodeList;


    }
    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     * This method will just delete the first occurrence of relevant record.
     *
     * @param firstName will indicate the first node that will be deleted.
     */
    public void deleteByFirstName(String firstName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record available in phonebook!");
        }
        PhoneBookNode current = head;
        PhoneBookNode prev = head;

        while (current != null) {
            if (current.contact.firstName.equals(firstName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = null;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
        throw new NoSuchElementException(firstName + " didn't match any records.");
    }

    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     * This method will delete the all nodes that have the parameterized lastName.
     *
     * @param lastName will indicate the all nodes that will be deleted.
     */
    public void deleteAllMatchingLastName(String lastName) {

        int startingSize = size;

        if (isEmpty()) {
            throw new NoSuchElementException("No record available in phonebook!");
        }

        PhoneBookNode current = head;
        PhoneBookNode prev = head;

        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = null;
                } else {
                    prev.next = current.next;
                    current = prev;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }

        if (startingSize == size) {
            throw new NoSuchElementException(lastName + " didn't match any records.");
        }

    }

    /**
     * Time complexity: O(n) Space complexity: 0(n) We are creating a list for all nodes in the LinkedList.
     *
     * @return list of PhoneBookNode with all nodes.
     */
    public List<PhoneBookNode> findAll() {
        if (isEmpty()) {
            throw new NoSuchElementException("No record available in phonebook!");
        }

        List<PhoneBookNode> phoneBookNodeList = new ArrayList<>();
        PhoneBookNode current = head;

        while (current != null) {
            phoneBookNodeList.add(current);
            current = current.next;
        }

        return phoneBookNodeList;
    }

}
