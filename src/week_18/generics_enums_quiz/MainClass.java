package week_18.generics_enums_quiz;

enum Enums {
    ONE("one"), TWO("two"), THREE("three"), FOUR, FIVE("five");

    String s = "NAME";

    Enums() {
    }

    Enums(String s) {
        this.s = s;
    }

    void method() {
        System.out.println(s);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Enums.ONE.method();

        Enums.TWO.method();

        Enums.THREE.method();

        Enums.FOUR.method();
    }
}