package week_12.childParent2;

public class Parent {

    static{
        System.out.println("Parent Static Initialization Block executed");
    }

    {
        System.out.println("Parent Instance Initialization Block executed");
    }

    public Parent() {
        System.out.println("Parent Constructor executed");
    }
}

class Child extends Parent{

    public static void main(String[] args) {
        Child c = new Child();
    }
    static{
        System.out.println("Child Static Initialization Block executed");
    }

    {
        System.out.println("Child Instance Initialization Block executed");
    }

    public Child() {
        System.out.println("Child Constructor executed");
    }

}
