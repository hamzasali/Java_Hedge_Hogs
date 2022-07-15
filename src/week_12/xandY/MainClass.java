package week_12.xandY;

public class MainClass {
    public static void main(String[] args) {
        Y.staticMethod();
    }
}

class X{
    static  void staticMethod(){
        System.out.println("Class X");
    }
}

class Y extends X{
    static void staticMethod(){
        System.out.println("Class Y");
    }
}
