package PassValue;

public class ReferenceChangeNotReflected {
    public static void main(String[] args) {
        // t is a reference
        Test1 t = new Test1(5);

        // Reference is passed and a copy of reference
        // is created in change()
        change(t);

        // Old value of t.x is printed
        System.out.println(t.x);
    }

    public static void change(Test1 t) {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
        t = new Test1();

        t.x = 10;
    }
}

class Test1 {
    int x;

    Test1(int i) {
        x = i;
    }

    Test1() {
        x = 0;
    }
}


