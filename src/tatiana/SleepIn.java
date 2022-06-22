package tatiana;

public class SleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));//true
        System.out.println(sleepIn(true,false));//false
        System.out.println(sleepIn(false,true));//true


    }
    public static boolean sleepIn(boolean isWeekday,boolean isVacation){

        return !isWeekday||isVacation;






    }

}
