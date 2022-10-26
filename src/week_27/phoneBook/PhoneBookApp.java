package week_27.phoneBook;

public class PhoneBookApp {

    public static void main(String[] args) {

        PhoneBookSinglyLinkedList list = new PhoneBookSinglyLinkedList();

        list.add(new Contact("Tom","Hanks","tom@cydeo.com","0123456789"));
        list.add(new Contact("John","Smith","john@cydeo.com","0123456789"));
        list.add(new Contact("Lora","Bruce","lora@cydeo.com","0123456789"));
        list.add(new Contact("Karla","Henderson","karla@cydeo.com","0123456789"));
        list.add(new Contact("George","Hanks","george@cydeo.com","0123456789"));

        System.out.println(list.isEmpty());
        System.out.println(list.size);
        list.printPhoneBook();


    }

}
