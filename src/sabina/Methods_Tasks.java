package sabina;

public class Methods_Tasks {
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false));  //false
        System.out.println(sleepIn(false, true)); //true

        System.out.println("======================");
        System.out.println(lastDigit(7, 17));

        System.out.println("=================");
        System.out.println(middleTwo("practice"));

        System.out.println("=================");
        int [] array = {1,2, 3,4};
        System.out.println(countEvens(array));

    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lastDigit(int num1, int num2){
        if(num1 %10 == num2 %10){
            return true;
        }else{
            return false;
        }
    }

    public static String middleTwo(String str){ // practice

        int divStr = str.length() / 2; //4
        return str.substring(divStr-1,divStr+1);

    }


    public static int countEvens (int[] array){

        int count = 0;
        for (int each : array) {
            if(each % 2 == 0){
                count++;

            }

        }
        return count;
    }


}

