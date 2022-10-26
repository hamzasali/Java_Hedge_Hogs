package hamzaAli.linkedList.phoneBook;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBookSinglyLinkedList list = new PhoneBookSinglyLinkedList();

        Contact contact1 = new Contact("David", "Mike", "mike@gmail.com", "1234536782");
        Contact contact2 = new Contact("Micheal", "Houston", "micheal@gmail.com", "3498534923");
        Contact contact3 = new Contact("Jordan", "Mike", "jordan@gmail.com", "3498534923");
        Contact contact4 = new Contact("Jason", "Mike", "jason@gmail.com", "1234536782");
//        System.out.println(list.isEmpty());
        list.add(contact1);
        list.add(contact2);
        list.add(contact3);
        list.add(contact4);
        System.out.println("---");
        list.printPhoneBook();
        System.out.println("---");
        System.out.println(list.size());
        System.out.println("---");
        System.out.println(list.findByFirstName("David"));
        System.out.println("---");
        list.deleteByFirstName("Micheal");
        list.printPhoneBook();
        System.out.println("---");
        System.out.println(list.findAllByLastName("Mike"));
        System.out.println("---");
        list.deleteAllMatchingLastName("Mike");
        System.out.println("---");
        list.printPhoneBook();
        System.out.println("---");
        System.out.println(list.findAll());
        System.out.println("---");


    }

}
