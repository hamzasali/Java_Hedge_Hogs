package mizgin;

public class SleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(false,true));

    }

    public static boolean sleepIn(boolean isWeekDay,boolean isVacation){
        return !isWeekDay || isVacation;
    }
}
