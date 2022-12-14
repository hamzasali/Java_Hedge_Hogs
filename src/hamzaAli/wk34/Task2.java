package hamzaAli.wk34;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(multiplyElements(arr)));
    }

    static int[] multiplyElements(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result[i] = arr[i] * arr[i + 1];
            } else if (i == arr.length - 1) {
                result[i] = arr[i] * arr[i - 1];
            } else {
                result[i] = arr[i - 1] * arr[i + 1];
            }
        }
        return result;
    }
}
