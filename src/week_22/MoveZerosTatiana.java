package week_22;

import java.util.Arrays;

public class MoveZerosTatiana {


    public static void main(String[] args) {


        int[] array = {1, 0, 2, 0, 0, 7};
        System.out.println("The original array elements: " + Arrays.toString(array));

        moveZeros(array);
        System.out.println("After taking all the zeros to last : " + Arrays.toString(array));
    }

    public static void moveZeros(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[end] == 0) {
                end--;
            } else if (arr[start] != 0) {
                start++;

            } else {
                swap(arr, start, end);
                start++;
                end--;

            }


        }


    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
