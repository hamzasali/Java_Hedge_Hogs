package week_27.phoneBook;

import java.util.LinkedList;

public class PhoneBookNode {

    public PhoneBookNode next;
    public Contact contact;


    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }
}
