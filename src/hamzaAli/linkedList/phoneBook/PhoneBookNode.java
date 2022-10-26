package hamzaAli.linkedList.phoneBook;

public class PhoneBookNode {
    public Contact contact;
    public PhoneBookNode next;
    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "PhoneBookNode{" +
                "contact=" + contact +
                '}';
    }
}