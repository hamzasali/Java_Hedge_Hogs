package alena.stream_tasks;

import java.util.*;
import java.util.stream.IntStream;

public class task1 {
    public static void main(String[] args) {

        int[] array={6,8,3,5,1,9};
        findMaxNumber(array);


    }

    public static void findMaxNumber(int[] array){

        IntStream intStream1 = Arrays.stream(array);
        System.out.println(intStream1.max());

    }

}
