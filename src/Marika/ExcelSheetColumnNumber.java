package Marika;

public class ExcelSheetColumnNumber {


    public static int excelToNumber(String str) {

        if(str == null || str.length() == 0)
            return 0;

        char[] chars = str.toCharArray();
        int result = 0;

        for(Character each : chars){
            result = result * 26 + (int)(each - 'A') + 1;
        }

        return result;
    }


    public static void main (String[] args) {
        String str = "CDA";
        System.out.print(excelToNumber(str));

    }
}

