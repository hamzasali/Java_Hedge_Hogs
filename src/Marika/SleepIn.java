package Marika;

public class SleepIn {
    public static boolean sleepIn(boolean isWeekDay, boolean isVacation) {
        return !isWeekDay || isVacation;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));//true
        System.out.println(sleepIn(true,false)); //false
        System.out.println(sleepIn(false,true)); //true

    }




}