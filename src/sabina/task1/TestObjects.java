package sabina.task1;

public class TestObjects {
    public static void main(String[] args) {

        SubClass subClass = new SubClass(); //This is constructor of abstract class

        subClass.a_method();  //This is abstract method
        subClass.non_abstract(); //This is normal method of abstract class

    }
}
