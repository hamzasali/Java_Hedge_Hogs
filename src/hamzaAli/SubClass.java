package hamzaAli;

public class SubClass extends Abstract {

    @Override
    public void a_method() { //implementing abstract method
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.a_method();//calling abstract method
        subClass.n_method();//calling normal method

    }
}
/*
A class 'SubClass' inherits the abstract class and has a method named 'a method' which prints "This is
abstract method"
Now create an object of 'SubClass' and call the abstract method and the non-abstract method.
(Analyse the result)
 */