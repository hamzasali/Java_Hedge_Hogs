package week_18.generics_enums_quiz;


enum Numbers {
    ONE("one"), TWO("two"), THREE("three"), FOUR, FIVE("five");

    String s = "NAME";

    Numbers() {
    }

    Numbers(String s) {
        this.s = s;
    }

    void print() {
        System.out.println(ordinal() + " : " + name());
    }

}

public class Practice {
    public static void main(String[] args) {
        Numbers.ONE.print();

        Numbers[] values = Numbers.values();

        for (Numbers value : values) {
            System.out.println(value);
        }
    }
}
