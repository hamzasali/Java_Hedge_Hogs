package tatiana;

public class MiddleTwo {

    public static void main(String[] args) {

        System.out.println(middleTwo("code"));




    }

    public static String middleTwo(String str){
        String result="";


        if (str.length()%2!=0){
           result+=("Invalid string");

        }else {
             result+=str.substring((str.length()/2)-1,(str.length()/2)+1);
        }
        return result;

    }



}
