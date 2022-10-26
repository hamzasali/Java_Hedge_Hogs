package week_27.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     *
     * @param firstName this parameter will give the first corresponding node in LinkedList.
     * @return the PhoneBookNode object that has parameterized firstName.
     */
    public PhoneBookNode findByFirstName(String firstName) {
        if (isEmpty()){
            throw new NoSuchElementException("No record available in phonebook!");
        }
        PhoneBookNode current=head;
        while (current!=null){
            if (current.contact.firstName.equals(firstName)){
                return current;
            }

            current=current.next;
        }
        throw new NoSuchElementException(firstName+ " didn't match any records.");
    }
    /**
     * Time complexity: O(n) Space complexity: 0(n) In the worst case all nodes might have same lastName.
     *
     * @param lastName this parameter will give the all nodes with this lastName in LinkedList.
     * @return list of PhoneBookNode with the parameterized lastName.
     */
    public List<PhoneBookNode> findAllByLastName(String lastName){
        if (isEmpty()){
            throw new NoSuchElementException("No record available in phonebook!");
        }
        List<PhoneBookNode>phoneBookNodeList=new ArrayList<>();

        PhoneBookNode current=head;
        while (current!=null){
            if (current.contact.lastName.equals(lastName)) {
                phoneBookNodeList.add(current);
            }
            current=current.next;
        }
        if(phoneBookNodeList.isEmpty()){
            throw new NoSuchElementException(lastName+ " didn't match any records.");
        }
        return phoneBookNodeList;


    }





}
