package Sergiy;

import java.util.Arrays;

public class WithoutTen {

    public static int[] withoutTen(int[] arr){
        int[] without10 = new int[arr.length];
        int j = 0;
        for (int each : arr) {
            if(each != 10){
                without10[j] = each;
                j++;
            }
        }
        return without10;
    }

    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2, 99, 5, 10};
        System.out.println(Arrays.toString(withoutTen(arr)));

    }

}
