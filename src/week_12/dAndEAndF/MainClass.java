package week_12.dAndEAndF;

public class MainClass {
    public static void main(String[] args) {
        F f = new F(5,10);
    }
}

class D {

    int instanceFieldOfD;
    static int staticFieldOfD;

    static {
        System.out.println("static block of Class D");
    }
    {
        System.out.println("instance block of Class D");
    }

    public D(int instanceFieldOfD) {
        this.instanceFieldOfD = instanceFieldOfD;
    }
}

class E extends D {
    int instanceFieldOfE;
    static int staticFieldOfE;

    static {
        System.out.println("static block of Class E");
    }
    {
        System.out.println("instance block of Class E");
    }

    public E(int instanceFieldOfD, int instanceFieldOfE) {
        super(instanceFieldOfD);
        this.instanceFieldOfE = instanceFieldOfE;
    }
}

class F extends E {
    static {
        System.out.println("static block of Class F");
    }

    {
        System.out.println("instance block of Class F");
    }

    public F(int instanceFieldOfD, int instanceFieldOfE) {
        super(instanceFieldOfD, instanceFieldOfE);
    }
}
