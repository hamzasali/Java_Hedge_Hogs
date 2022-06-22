package Sergiy;

public class SleepIn {

    public static boolean ifSleepIn(boolean isWeekday, boolean isVacation){
        if(!isWeekday||isVacation){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(ifSleepIn(false, true));
    }
}
