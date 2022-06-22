package cihat;

public class MiddleTwo {

    public static void main(String[] args) {

        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo3("Practice"));
    }


    public static String middleTwo(String str){

        if (str.length()%2==0){
            return str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2);
        }else{
            return "provided string is not a valid argument";
        }
    }

    public static String middleTwo2(String str){ // code

        int divStr = str.length() / 2;
        return str.substring(divStr-1,divStr+1);

    }

    public static String middleTwo3(String str){

        return str.substring((str.length()/2)-1,str.length()/2+1);

    }
}
