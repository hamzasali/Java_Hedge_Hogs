package Marika;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBookSinglyLinkedList list = new PhoneBookSinglyLinkedList();


        list.add(new Contact("David", "Mike", "mike@gmail.com", "123456782"));
        list.add(new Contact("Emma", "Smith", "emma@gmail.com", "987654321"));
        System.out.println(list.isEmpty());
        list.printPhoneBook();
        System.out.println(list.size());


    }
}
