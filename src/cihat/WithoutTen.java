package cihat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutTen {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 2, 10})));
        System.out.println(Arrays.toString(withoutTen2(new int[]{1, 99, 10})));
        System.out.println(Arrays.toString(withoutTen2(new int[]{1, 10, 10, 20, 10})));

    }

    public static int[] withoutTen(int[] array) {
        int [] result = new int[array.length];

        for (int i = 0,j=0; i < array.length; i++) {
            if (array[i]!=10){
                result[j]=array[i];
                j++;
            }
        }
        return result;
    }

    public static int[] withoutTen1(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();
        int numberOfTen = 0;
        for (int i : array) {
            if (i != 10) {
                list.add(i);
            } else {
                numberOfTen++;
            }
        }

        for (int i = 0; i < numberOfTen; i++) {
            list.add(0);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[] withoutTen2(int[] array) {

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        list.removeIf(each -> each == 10);
        int remainElements = array.length - list.size();
        for (int i = 0; i < remainElements; i++) {
            list.add(0);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
