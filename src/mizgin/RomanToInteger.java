package mizgin;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(method("IV"));
        System.out.println(method("VI"));
        System.out.println(method("XC"));
        System.out.println(method("LVIII"));
        System.out.println(method("CCXLVIII"));

    }

    public static int method(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;

        for (int i=0; i < str.length(); i++) {
            //check what was that before
            if (i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))) {
                                            //first take out one added before then subtract the value again
                sum = sum + map.get(str.charAt(i)) -2*map.get(str.charAt(i-1));
            }else {
                sum = sum + map.get(str.charAt(i));
            }
        }

        return sum;

    }
}
