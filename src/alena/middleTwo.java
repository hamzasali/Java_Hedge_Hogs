package alena;

public class middleTwo {
    public static void main(String[] args) {

        String str="string";

        System.out.println(middleTwo(str));

    }

    public static String middleTwo(String str){
        String result="";
        String half1=str.substring(0,str.length()/2);
        String half2=str.substring(str.length()/2);

        result+=half1.substring(half1.length()-1)+half2.substring(0,1);
        return result;
    }
}
