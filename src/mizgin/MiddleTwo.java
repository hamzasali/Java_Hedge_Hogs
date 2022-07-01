package mizgin;

public class MiddleTwo {

    public static void main(String[] args) {

        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("rotator")); // ---??
    }

    public static String middleTwo(String str){

        return str.substring((str.length()/2)-1,str.length()/2+1);

    }
}
