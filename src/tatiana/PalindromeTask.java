package tatiana;

import java.util.ArrayList;

public class PalindromeTask {

    public static void main(String[] args) {

        String[]words={"civic","radar","level","race"};

        System.out.println(palindrome(words));


    }

    public static boolean isPalindrome(String str) {
        str=str.replaceAll(" ","");

        String reverse="";
        for (int j = str.length() - 1; j >= 0; j--) {
            reverse += str.charAt(j);

        }
        return reverse.equalsIgnoreCase(str);



    }
    public static ArrayList<String> palindrome(String[]arr){



        ArrayList<String>palindrome=new ArrayList<>();

        for (String each : arr){
            if (isPalindrome(each)){
                palindrome.add(each);
            }
        }
        return palindrome;



    }

}
