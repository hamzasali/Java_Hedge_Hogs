package week_11;

import static java.lang.Math.*;

public class OuterClass {
    public static void main(String[] args) {

        System.out.println(random());
        System.out.println(PI);

        OuterClass outerClass = new OuterClass("Michael");
        OuterClass.InnerStatic.getTheNumber();



    }

    String name;

    public OuterClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static class InnerStatic{
        static int number=10;

        public static void getTheNumber(){
            System.out.println(number);
        }
    }

}

