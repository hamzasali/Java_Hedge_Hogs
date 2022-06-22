package sabina;

import java.util.Arrays;

public class Methods_Tasks {
    public static void main(String[] args) {

        System.out.println("============= sleepIn() ===============");

        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false));  //false
        System.out.println(sleepIn(false, true)); //true

        System.out.println("============== lastDigit() =================");
        System.out.println(lastDigit(7, 17));

        System.out.println("============== middleTwo() ==================");
        System.out.println(middleTwo("practice"));

        System.out.println("================ countEvens() ================");
        int[] array = {1, 2, 3, 4};
        System.out.println(countEvens(array));

        System.out.println("===============withoutTen()====================");
        int[] array2 = {10, 2, 10};
        System.out.println(Arrays.toString(withoutTen(array2)));

        System.out.println("============== catDog() =======================");

        System.out.println(catDog("1cat1cadodog"));


    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lastDigit(int num1, int num2) {
        if (num1 % 10 == num2 % 10) {
            return true;
        } else {
            return false;
        }
    }

    public static String middleTwo(String str) { // practice

        int divStr = str.length() / 2; //4
        return str.substring(divStr - 1, divStr + 1);

    }

    public static int countEvens(int[] array) {

        int count = 0;
        for (int each : array) {
            if (each % 2 == 0) {
                count++;

            }

        }
        return count;
    }

    public static int[] withoutTen(int[] array) {

        int[] withoutTen = new int[array.length];

        int i = 0;
        for (int each : array) {
            if (each != 10) {
                withoutTen[i] = each;
                i++;
            }
            if (each == 10) {
                withoutTen[i] = 0;
            }

        }
     return withoutTen;

}

    public static boolean catDog(String str){
        int countCat = 0;
        int countDog = 0;


        for(int i = 0; i< str.length()-2; i++) {

            if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countCat++;

            } else if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
                countDog++;
            }
        }


            if(countCat==countDog){
                return true;
            }else{
                return false;
            }
    }






}

