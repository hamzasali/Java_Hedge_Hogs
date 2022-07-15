package hamzaAli;

public abstract class Abstract {
    public Abstract() {//Constructor
        System.out.println("This is constructor of the abstract class");
    }

    public abstract void a_method();

    public void n_method(){
        System.out.println("This is a normal method of the abstract class");
    }

}

/*
Create an abstract class has a constructor which prints "This is constructor of abstract class"
an abstract method named 'a_method' and a non-abstract method which prints
"This is a normal method of
abstract class"
 */