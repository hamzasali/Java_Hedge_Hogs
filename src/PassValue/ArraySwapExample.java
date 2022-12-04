package PassValue;

import java.util.Arrays;

public class ArraySwapExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("a and b after swap method");
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------Array example--------------");

        int[] array = {1, 2};

        swap(array[0], array[1]);

        System.out.println("array[0] and array[1] after swap method");
        System.out.println(array[0]);
        System.out.println(array[1]);

        swapArray(array);
        System.out.println("After method call");
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a in swap method: " + a);
        System.out.println("b in swap method: " + b);
    }

    public static void swapArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println(Arrays.toString(array));
    }
}
