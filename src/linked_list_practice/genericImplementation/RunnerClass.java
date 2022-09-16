package linked_list_practice.genericImplementation;

import java.util.LinkedList;

public class RunnerClass {

    public static void main(String[] args) {

        LinkedListGeneric<String> listGenericWithString = new LinkedListGeneric<>();

        listGenericWithString.add("Hamza");
        listGenericWithString.add("Mizgin");
        listGenericWithString.add("Tatiana");
        listGenericWithString.add("Marika");
        listGenericWithString.add("Alena");
        listGenericWithString.add("Sabina");
        listGenericWithString.add("Esmira");
        listGenericWithString.add("Ahmet");
        listGenericWithString.add("Sergiy");

        listGenericWithString.printNodes();

        System.out.println(listGenericWithString.findTheMiddleNode().item);

        LinkedListGeneric<Student> listGenericWithStudent = new LinkedListGeneric<>();

        listGenericWithStudent.add(new Student("Tom Cruise","Oxford",22));
        listGenericWithStudent.add(new Student("Brad Pitt","Sorbonne",19));
        listGenericWithStudent.add(new Student("Kevin News","Cans",33));
        listGenericWithStudent.add(new Student("Bruce Wills","Kansas",17));

        listGenericWithStudent.printNodes();

        System.out.println(listGenericWithStudent.findTheMiddleNode().item);


    }
}
