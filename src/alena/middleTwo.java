package alena;

public class middleTwo {
    public static void main(String[] args) {

        String str="string";

        String result="";
        String half1=str.substring(0,str.length()/2);
        String half2=str.substring(str.length()/2);

        result+=half1.substring(half1.length()-1)+half2.substring(0,1);

        System.out.println(result);





    }
}
