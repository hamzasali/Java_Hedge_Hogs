package week_34;

import java.util.Arrays;

public class ProducedArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        System.out.println(Arrays.toString(produceArrayOn(array)));
        System.out.println(Arrays.toString(produceArrayO1(array)));
    }

    /**
     * We are creating additional array that's why the space will be O(n) and time complexity will be O(n) too.
     * @param array
     * @return int [] array
     */
    public static int[] produceArrayOn(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return array;
        }

        int[] result = new int[n];
        result[0] = array[0] * array[1];
        result[n - 1] = array[n - 2] * array[n - 1];

        for (int i = 1; i < n - 1; i++) {
            result[i] = array[i - 1] * array[i + 1];
        }

        return result;
    }

    /**
     * No additional space, so space will be O(1) and time complexity will be O(n).
     * @param array
     * @return int [] array
     */
    public static int[] produceArrayO1(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int prev = 1;

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                prev = array[i];
                array[i] = prev * array[i + 1];
            } else if (i == array.length - 1) {
                array[i] = prev * array[i];
            } else {
                int temp = array[i];
                array[i] = prev * array[i + 1];
                prev = temp;
            }
        }

        return array;
    }
}
