package mizgin;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        System.out.println(method("A"));
        System.out.println(method("AB"));
        System.out.println(method("ZY"));
        System.out.println(method("ABC"));

    }

    public static int method(String str){

        int result=0;

        for (int i=0; i < str.length(); i++) {
            result = result*26 + (str.charAt(i) - 'A' + 1);
        }

        return result;

    }
}
