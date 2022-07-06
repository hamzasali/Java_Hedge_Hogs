package week_12.finalPackage;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        final int  NUMBER = 10;

        //NUMBER = 15;

        final ClassB classB = new ClassB();
        ClassB classB1 = new ClassB();
        //classB=classB1;
        System.out.println(classB.a);
        System.out.println(classB.s);

        classB.a=25;
        classB.s="not str";

        System.out.println(classB.a);
        System.out.println(classB.s);

        final int [] array = {1,2,3};
        int [] array1 = {1,2,3};
        //array=array1;
        System.out.println(Arrays.toString(array));
        array[0]=5;
        System.out.println(Arrays.toString(array));

    }

    public static void myMethod(final int number, final ClassB b){
//        number = 5;
//
//        b = new ClassB();
    }
}
